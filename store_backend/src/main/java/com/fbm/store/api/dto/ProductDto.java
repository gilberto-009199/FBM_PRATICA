package com.fbm.store.api.dto;

import java.util.UUID;

import com.fbm.store.entities.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

	public Long id;
	public String name;

}
