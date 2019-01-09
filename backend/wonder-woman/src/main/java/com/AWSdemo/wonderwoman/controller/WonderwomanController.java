package com.AWSdemo.wonderwoman.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wonderwoman")
public class WonderwomanController {
	@GetMapping("/posters")
	public List<String> getPosterUrls(){
		ArrayList<String> imageUrls = new ArrayList<>();
		imageUrls.add("https://m.media-amazon.com/images/M/MV5BZWVhYzE0NzgtM2U1Yi00OWM1LWJlZTUtZmNkNWZhM2VkMDczXkEyXkFqcGdeQW1yb3NzZXI@._V1_CR46,0,1401,788_AL_UY268_CR15,0,477,268_AL_.jpg");
		imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRjHaNcCo7nm-19YHmJ1RFKbUIM3T7EqEZYMKDCvIQCyQVbsmAw");
		imageUrls.add("https://img.etimg.com/thumb/msid-53395840,width-643,imgsize-88232,resizemode-4/diana-was-my-inspiration-wonder-woman-gal-gadot.jpg");
		return imageUrls;
	}
	
	@GetMapping("/summary")
	public List<String> getSummary() {
		ArrayList<String> summary = new ArrayList<>();
		summary.add("https://m.media-amazon.com/images/M/MV5BZWVhYzE0NzgtM2U1Yi00OWM1LWJlZTUtZmNkNWZhM2VkMDczXkEyXkFqcGdeQW1yb3NzZXI@._V1_CR46,0,1401,788_AL_UY268_CR15,0,477,268_AL_.jpg");
		summary.add("WONDER WOMAN");
		summary.add("Wonder Woman had its world premiere in Shanghai on May 15, 2017, and was released in the United States on June 2, 2017");
		return summary;
	}

}
