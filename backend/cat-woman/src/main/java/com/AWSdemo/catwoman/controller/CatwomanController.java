package com.AWSdemo.catwoman.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catwoman")
public class CatwomanController {
	@GetMapping("/posters")
	public List<String> getPosterUrls(){
		ArrayList<String> imageUrls = new ArrayList<>();
		imageUrls.add("https://images-na.ssl-images-amazon.com/images/S/cmx-images-prod/Item/708728/Cover._SX360_QL80_TTD_.jpg");
		imageUrls.add("https://ae01.alicdn.com/kf/HTB1PyTdLpXXXXc9XFXXq6xXFXXXz/Classic-1966-Batman-TV-Series-Grand-Heritage-Catwoman-Costume-New-Halloween-Suit-Sexy-Catwoman-Costume-Black.jpg_640x640.jpg");
		imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTacv2m7QxN_fsPLbz4LJlbHVsWVOQ-ETRnQ6YqEtXPueSWMfh9OQ");
		return imageUrls;
	}
	
	@GetMapping("/summary")
	public List<String> getSummary(){
		ArrayList<String> summary = new ArrayList<>();
		summary.add("https://images-na.ssl-images-amazon.com/images/S/cmx-images-prod/Item/708728/Cover._SX360_QL80_TTD_.jpg");
		summary.add("CAT WOMAN");
		summary.add("Catwoman, whose real name is Selina Kyle, has been Batman's most enduring love interest and is known for her complex love-hate relationship with him");
		return summary;
	}

}
