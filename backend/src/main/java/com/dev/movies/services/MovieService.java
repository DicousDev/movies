package com.dev.movies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.movies.dto.MovieDTO;
import com.dev.movies.entities.Movie;
import com.dev.movies.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findMoviesAll(Pageable pageable) {
		Page<Movie> movies = movieRepository.findAll(pageable);
		return movies.map(movie -> new MovieDTO(movie));
	}
	
	@Transactional
	public MovieDTO findMovieById(Long idMovie) {
		Movie movie = movieRepository.findById(idMovie).get();
		return new MovieDTO(movie);
	}
}
