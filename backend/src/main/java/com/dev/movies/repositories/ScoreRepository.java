package com.dev.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.movies.entities.Score;
import com.dev.movies.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
