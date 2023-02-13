package com.movie.app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.movie.app.model.Movie;
import com.movie.app.model.MovieCategory;

public interface MovieService {
	
	public List<Movie> findAllMovies();
	
	public void createMovie(MultipartFile file,Movie movie,List<MovieCategory> categories);
	
	public Movie findMovie(int id);
	
	public void deleteMovie(Movie movie);
	
	public Movie editMovie(MultipartFile file,Movie movie,List<MovieCategory> categories);
	
	
	public double getTotalRatingByMovieId(int id);
	
	//pagination
	public Page<Movie> findPaginated(List<Movie> movies,Pageable pageable);
}
