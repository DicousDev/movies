package com.dev.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.movies.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
