package com.telus.health.thfs.mbcm.resttest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

	@GetMapping("/version")
	public Version version() {
		return  new Version("1.0.0", "May 18, 2020 10:05 P.M");
	}
	
}
