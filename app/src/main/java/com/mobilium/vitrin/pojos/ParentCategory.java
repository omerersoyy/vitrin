package com.mobilium.vitrin.pojos;

public class ParentCategory{
	private Object parentId;
	private String name;
	private Object parentCategory;
	private int id;
	private int order;

	public Object getParentId(){
		return parentId;
	}

	public String getName(){
		return name;
	}

	public Object getParentCategory(){
		return parentCategory;
	}

	public int getId(){
		return id;
	}

	public int getOrder(){
		return order;
	}
}
