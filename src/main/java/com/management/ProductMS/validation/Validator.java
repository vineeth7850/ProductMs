package com.management.ProductMS.validation;


import com.management.ProductMS.dto.*;


public class Validator {
	
	public static boolean validate(ProductDTO productDTO) {
		if(validateProductName(productDTO.getProductName())) {
			if(validateDescription(productDTO.getDescription())) {
				if(validatePrice(productDTO.getPrice())) {
					if(validateStock(productDTO.getStock())) {
						if(validateImage(productDTO.getImage())) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	
	
	public static boolean validateProductName(String productname) {
		String reg="^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*).{0,100}$";
		if(productname.matches(reg)) {
			return true;
		}
		return false;
	}
	public static boolean validateDescription(String description) {
		if(description.length()<=500) {
			return true;
		}
		return false;
	}
	public static boolean validatePrice(double price) {
		if(price>=200) {
			return true;
		}
		return false;
	}
	public static boolean validateStock(Integer stock) {
		if(stock>=10) {
			return true;
		}
		return false;
	}
	public static boolean validateImage(String image) {
		if(image.endsWith(".png") || image.endsWith(".jpeg")) {
			return true;
		}
		return false;
	}

}
