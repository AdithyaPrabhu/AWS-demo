package com.AWSdemo.ironman.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ironman")
public class IronmanController {
	
	@GetMapping("/posters")
	public List<String> getPosterUrls(){
		ArrayList<String> imageUrls = new ArrayList<>();
		imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTfsNs5nXz-SOmo9DjmvGmIS9xx9tE_4fta2z8s4cBTnXWFbJB");
		imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBC9GxS1YmqNQpfy9-m4IIumTn68uEHFk7sP6d5CuiOwCdRvuRKw");
		imageUrls.add("https://pmcvariety.files.wordpress.com/2013/03/ironman3_poster.jpg?w=800");
		return imageUrls;
	}
	
	@GetMapping("/summary")
	public List<String> getSummary() {
		ArrayList<String> summary = new ArrayList<>();
		summary.add("https://pmcvariety.files.wordpress.com/2013/03/ironman3_poster.jpg?w=800");
		summary.add("IRON MAN");
		summary.add("Genius, billionaire, playboy and philanthropist Tony Stark");
		return summary;
	}

}
