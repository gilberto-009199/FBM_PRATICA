package com.fbm.store.api.controllers;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fbm.store.api.controllers.responses.Message;
import com.fbm.store.api.services.ProductService;

@CrossOrigin(allowedHeaders = "*")
@RestController
@RequestMapping(path = "/v1/product/")
public class ProductController {
	
	@Autowired
	public ProductService service;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		
		return ResponseEntity.ok(
				Message.of(service.list())
		);
	}
	
	@PostMapping
	public ResponseEntity<?> create(){
		return null;
	}
	
}
