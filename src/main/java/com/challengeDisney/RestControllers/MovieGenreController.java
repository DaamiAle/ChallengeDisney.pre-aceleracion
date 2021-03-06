package com.challengeDisney.RestControllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challengeDisney.Models.MovieGenreModel;
import com.challengeDisney.Services.MovieGenreService;

@RestController
@RequestMapping("/genre")
public class MovieGenreController {
	@Autowired
	MovieGenreService genreService;
	
	@GetMapping
	public ArrayList<MovieGenreModel> getGenres(){
		return genreService.getAllGenres();
	}
	@PostMapping("/create")
	public MovieGenreModel createGenre(@RequestBody MovieGenreModel genre) {
		return genreService.createGenre(genre);
	}
}