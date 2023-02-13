package com.movie.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.movie.app.model.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer>{
	
	@Query("SELECT  SUM(r.rating) FROM Review r WHERE r.movie.movieId=:id AND r.rating>0 GROUP BY r.movie.movieId")
	public double getTotalRating(int id);
	
	
	@Query("SELECT COUNT(r.user.userId) FROM Review r WHERE r.movie.movieId =:id AND r.rating>0")
	public int getTotalNumber(@Param("id")int id);
}
