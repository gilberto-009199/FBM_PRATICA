package com.fbm.store.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fbm.store.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{}
