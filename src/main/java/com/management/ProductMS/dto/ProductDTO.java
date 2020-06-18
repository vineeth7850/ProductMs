package com.management.ProductMS.dto;

import com.management.ProductMS.entity.Product;

public class ProductDTO {
	int prodid;
	String brand;
	String category;
	String description;
	String image;
	float price;
	String productName;
	int rating;
	int sellerId;
	int stock;
	String subcategory;
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public static ProductDTO valueof(Product p1) {
		ProductDTO product= new ProductDTO();
		product.setProdid(p1.getProdid());
		product.setBrand(p1.getBrand());
		product.setCategory(p1.getCategory());
		product.setDescription(p1.getDescription());
		product.setImage(p1.getImage());
		product.setPrice(p1.getPrice());
		product.setProductName(p1.getProductName());
		product.setRating(p1.getRating());
		product.setSellerId(p1.getSellerId());
		product.setStock(p1.getStock());
		product.setSubcategory(p1.getSubCategory());
		
		return product;
	}
	public Product createEntity() {
		Product product = new Product();
		product.setProdid(this.getProdid());
		product.setProductName(this.getProductName());
		product.setBrand(this.getBrand());
		product.setCategory(this.getCategory());
		product.setRating(this.getRating());
		product.setImage(this.getImage());
		product.setDescription(this.getDescription());
		product.setSellerId(this.getSellerId());
		product.setStock(this.getStock());
		product.setSubCategory(this.getSubcategory());
		product.setPrice(this.getPrice());
		return product;
	}
	
	public Product addProduct() {
		Product product = new Product();
		product.setProdid(this.getProdid());
		product.setProductName(this.getProductName());
		product.setBrand(this.getBrand());
		product.setCategory(this.getCategory());
		product.setRating(this.getRating());
		product.setImage(this.getImage());
		product.setDescription(this.getDescription());
		product.setSellerId(this.getSellerId());
		product.setStock(this.getStock());
		product.setSubCategory(this.getSubcategory());
		product.setPrice(this.getPrice());
		return product;
	}

		public static ProductDTO valueOf(Product product) {
			// TODO Auto-generated method stub
			ProductDTO productDTO=new ProductDTO();
			productDTO.setBrand(product.getBrand());
			productDTO.setCategory(product.getCategory());
			productDTO.setDescription(product.getDescription());
			productDTO.setImage(product.getImage());
			productDTO.setPrice(product.getPrice());
			productDTO.setProdid(product.getProdid());
			productDTO.setProductName(product.getProductName());
			productDTO.setRating(product.getRating());
			productDTO.setSellerId(product.getSellerId());
			productDTO.setStock(product.getStock());
			productDTO.setSubcategory(product.getSubCategory());
			
			return productDTO;
		}

}

