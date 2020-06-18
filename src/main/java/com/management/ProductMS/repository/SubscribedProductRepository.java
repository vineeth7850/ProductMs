package com.management.ProductMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.ProductMS.entity.SubscribedProduct;

@Repository
public interface SubscribedProductRepository extends JpaRepository<SubscribedProduct, Integer>{

}
