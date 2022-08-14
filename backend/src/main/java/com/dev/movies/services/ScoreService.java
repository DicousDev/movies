package com.dev.movies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.movies.dto.MovieDTO;
import com.dev.movies.dto.ScoreDTO;
import com.dev.movies.entities.Movie;
import com.dev.movies.entities.Score;
import com.dev.movies.entities.User;
import com.dev.movies.repositories.MovieRepository;
import com.dev.movies.repositories.ScoreRepository;
import com.dev.movies.repositories.UserRepository;

@Service
public class ScoreService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		if(user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getIdMovie()).get();
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setPoints(dto.getScore());
		score = scoreRepository.saveAndFlush(score);
		
		// Recalcular a média
		double totalScores = 0D;
		for (Score s : movie.getScores()) {
			totalScores = totalScores + s.getPoints();
		}
		
		double avg = totalScores / movie.getScores().size();
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		movie = movieRepository.save(movie);
		return new MovieDTO(movie);
	}
}
