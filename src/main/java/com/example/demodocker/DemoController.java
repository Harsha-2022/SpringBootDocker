package com.example.demodocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public String Message() {
		return "<h1>Setting Up Jenkins Pipeline To Deploy DockerSwarm is done successfully</h1>";
	}

}
