package com.management.ProductMS.dto;


import com.management.ProductMS.entity.SubscribedProduct;

public class SubscribedProductDTO {
	int subId;
	int prodId;
	int buyerId;
	int quantity;
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public SubscribedProduct createEntity() {
		SubscribedProduct subscribedProduct= new SubscribedProduct();
		subscribedProduct.setBuyerId(this.getBuyerId());
		subscribedProduct.setProdId(this.getProdId());
		subscribedProduct.setSubId(this.getSubId());
		subscribedProduct.setQuantity(this.getQuantity());
		return subscribedProduct;
	}
	

}
