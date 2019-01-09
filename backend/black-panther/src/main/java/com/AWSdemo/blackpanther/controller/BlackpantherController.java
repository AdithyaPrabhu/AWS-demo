package com.AWSdemo.blackpanther.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blackpanther")
public class BlackpantherController {
	@GetMapping("/posters")
	public List<String> getPosterUrls(){
		ArrayList<String> imageUrls = new ArrayList<>();
		imageUrls.add("https://ichef.bbci.co.uk/images/ic/720x405/p05xk6z2.jpg");
		imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2u-FEG4rvKTTcbZSFPC-dmDxgBCOsw0iOWa9b68PNGqCRnHrW");
		imageUrls.add("https://www.telegraph.co.uk/content/dam/films/2018/02/06/wakanda_trans_NvBQzQNjv4Bq43UlpKYN9pb_KZA_dr6rNPzrY88woAPYdgFCmaYcBoA.PNG?imwidth=450");
		return imageUrls;
	}
	
	@GetMapping("/summary")
	public List<String> getSummary(){
		ArrayList<String> summary = new ArrayList<>();
		summary.add("https://ichef.bbci.co.uk/images/ic/720x405/p05xk6z2.jpg");
		summary.add("BLACK PANTHER");
		summary.add("One warrior ingests a heart-shaped herb affected by the metal and gains superhuman abilities, becoming the first BLACK PANTHER");
		return summary;
	}
}
