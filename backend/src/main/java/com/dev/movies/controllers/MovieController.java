package com.dev.movies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.movies.dto.MovieDTO;
import com.dev.movies.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public Page<MovieDTO> findMoviesAll(Pageable pageable) {
		return movieService.findMoviesAll(pageable);
	}
	
	@GetMapping(value = "/{idMovie}")
	public MovieDTO findMovieById(@PathVariable Long idMovie) {
		return movieService.findMovieById(idMovie);
	}
	
}
