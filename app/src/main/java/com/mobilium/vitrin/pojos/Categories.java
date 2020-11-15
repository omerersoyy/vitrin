package com.mobilium.vitrin.pojos;

import java.util.List;

public class Categories{
	private List<CategoriesItem> categories;
	private String type;
	private String title;

	public List<CategoriesItem> getCategories(){
		return categories;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}
}