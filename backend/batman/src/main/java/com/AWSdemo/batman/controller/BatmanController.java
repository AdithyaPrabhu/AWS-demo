package com.AWSdemo.batman.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batman")
public class BatmanController {
	@GetMapping("/posters")
	public List<String> getPosterUrls(){
		ArrayList<String> imageUrls = new ArrayList<>();
		imageUrls.add("https://i.kinja-img.com/gawker-media/image/upload/s--PUQWGzrn--/c_scale,f_auto,fl_progressive,q_80,w_800/yktaqmkm7ninzswgkirs.jpg");
		imageUrls.add("https://images-na.ssl-images-amazon.com/images/I/41trnBjzshL.jpg");
		imageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJBhuw-KwUsnbDVXAXSBX4BfUfvbkw_Kzkk81-P0gIIp1lYctb");
		return imageUrls;
	}
	
	@GetMapping("/summary")
	public List<String> getSummary(){
		ArrayList<String> summary = new ArrayList<>();
		summary.add("https://images-na.ssl-images-amazon.com/images/I/41trnBjzshL.jpg");
		summary.add("BATMAN!!");
		summary.add("Batman's secret identity is Bruce Wayne");
		return summary;
	}
	
}
