package com.fbm.store.api.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.fbm.store.api.dto.ProductDto;
import com.fbm.store.api.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository repository;
	
	@Autowired
	public ModelMapper mapper;
	
	public List<ProductDto> list(){
		return repository.findAll().stream().map(entity -> mapper.map(entity, ProductDto.class)).collect(Collectors.toList());
	}
}
