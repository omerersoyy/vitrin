package com.mobilium.vitrin.pojos;

import java.util.List;

public class NewProducts{
	private String type;
	private String title;
	private List<ProductsItem> products;

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}
}