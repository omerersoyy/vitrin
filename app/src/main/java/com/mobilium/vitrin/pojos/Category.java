package com.mobilium.vitrin.pojos;

public class Category{
	private int parentId;
	private String name;
	private ParentCategory parentCategory;
	private int id;
	private int order;

	public int getParentId(){
		return parentId;
	}

	public String getName(){
		return name;
	}

	public ParentCategory getParentCategory(){
		return parentCategory;
	}

	public int getId(){
		return id;
	}

	public int getOrder(){
		return order;
	}
}
