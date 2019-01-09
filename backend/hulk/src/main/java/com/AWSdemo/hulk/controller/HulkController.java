package com.AWSdemo.hulk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hulk")
public class HulkController {
	@GetMapping("/posters")
	public List<String> getPosterUrls() {
		ArrayList<String> imageUrls = new ArrayList<>();
		imageUrls.add(
				"https://fgmxi4acxur9qbg31y9s3a15-wpengine.netdna-ssl.com/wp-content/uploads/sites/2/2011/06/ang-lee-hulk-feature-1600x900-c-default.jpg");
		imageUrls.add("https://images-na.ssl-images-amazon.com/images/I/516X0YLRV%2BL._SY450_.jpg");
		imageUrls.add(
				"https://www.hindustantimes.com/rf/image_size_960x540/HT/p2/2018/06/15/Pictures/_1caf1900-7098-11e8-bbf6-b72314b60444.jpg");
		return imageUrls;
	}

	@GetMapping("/summary")
	public List<String> getSummary() {
		ArrayList<String> summary = new ArrayList<>();
		summary.add("https://images-na.ssl-images-amazon.com/images/I/516X0YLRV%2BL._SY450_.jpg");
		summary.add("HULK");
		summary.add("During the 1960s, scientist David Banner has the idea to forge supersoldiers by introducing modified DNA sequences");
		return summary;
	}
}
