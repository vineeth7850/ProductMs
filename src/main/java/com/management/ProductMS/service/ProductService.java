package com.management.ProductMS.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.ProductMS.dto.ProductDTO;
import com.management.ProductMS.dto.SubscribedProductDTO;
import com.management.ProductMS.entity.Product;
import com.management.ProductMS.entity.SubscribedProduct;
import com.management.ProductMS.repository.ProductRepository;
import com.management.ProductMS.repository.SubscribedProductRepository;
import com.management.ProductMS.validation.Validator;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	@Autowired
	SubscribedProductRepository subrepo;



	public List<ProductDTO> getproducts() {
		List<Product> product = productRepository.findAll();
		List<ProductDTO> productDTO = new ArrayList<ProductDTO>();
		for (Product p1 : product) {
			ProductDTO product1 = ProductDTO.valueof(p1);
			productDTO.add(product1);
		}
		return productDTO;
	}

	public List<ProductDTO> getproductsonCategory(String category) {
		List<Product> product = productRepository.findAll();
		List<ProductDTO> productDTO = new ArrayList<ProductDTO>();
		for (Product p1 : product) {
			if (p1.getCategory().equals(category)) {
				ProductDTO product1 = ProductDTO.valueof(p1);
				productDTO.add(product1);
			}

		}
		return productDTO;
	}

	public List<ProductDTO> getproductsonName(String productName) {
		List<Product> product = productRepository.findAll();
		List<ProductDTO> productDTO = new ArrayList<ProductDTO>();
		for (Product p1 : product) {
			if (p1.getProductName().equals(productName)) {
				ProductDTO product1 = ProductDTO.valueof(p1);
				productDTO.add(product1);
			}

		}
		return productDTO;

	}

	public void subscribeProduct(SubscribedProductDTO subscribedProductDTO) {
		SubscribedProduct subscribedProduct = subscribedProductDTO.createEntity();
		subrepo.save(subscribedProduct);
	}

	public void updateStock(Integer prodid,Integer stock) {
		Optional<Product> product=productRepository.findById(prodid);
		if(product.isPresent()) {
			Product p=product.get();
			p.setStock(stock);
			productRepository.save(p);
				}
			}
		

	public void addProduct(ProductDTO productDTO) {
		Product product = productDTO.addProduct();
		productRepository.save(product);

	}

	public void deleteById(Integer prodid) {
		productRepository.deleteById(prodid);
		
		// TODO Auto-generated method stub
		
	}

	public ProductDTO getProductByProdid(int prodid) {
		ProductDTO productDTO=null;
		List<Product> products= productRepository.findAll();
		
		
		for(Product product : products) {
			if((product.getProdid())==prodid) {
			productDTO=productDTO.valueOf(product);
			}
			
		}
		
			
		
		return productDTO;
	}
}
