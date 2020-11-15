package com.mobilium.vitrin.pojos;

import java.util.List;

public class CategoriesItem{
	private Cover cover;
	private List<ChildrenItem> children;
	private Object parentId;
	private String name;
	private Object parentCategory;
	private Logo logo;
	private int id;
	private int order;

	public Cover getCover(){
		return cover;
	}

	public List<ChildrenItem> getChildren(){
		return children;
	}

	public Object getParentId(){
		return parentId;
	}

	public String getName(){
		return name;
	}

	public Object getParentCategory(){
		return parentCategory;
	}

	public Logo getLogo(){
		return logo;
	}

	public int getId(){
		return id;
	}

	public int getOrder(){
		return order;
	}
}