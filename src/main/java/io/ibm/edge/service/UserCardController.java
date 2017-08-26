package io.ibm.edge.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCardController {
	
	@GetMapping(value="/home")
	public String home() {
		return "index";
	}
}
