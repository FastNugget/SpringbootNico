package com.bezkoder.spring.mssql.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TutorialController {


	@PostMapping("/coucou")
	public ResponseEntity<String> getCoucou(@RequestBody() String body) {


		return ResponseEntity.ok("Nombre chars:" + body.length());

	}


}
