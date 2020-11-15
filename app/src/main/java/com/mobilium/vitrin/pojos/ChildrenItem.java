package com.mobilium.vitrin.pojos;

import java.util.List;

public class ChildrenItem{
	private Cover cover;
	private List<Object> children;
	private int parentId;
	private String name;
	private ParentCategory parentCategory;
	private Logo logo;
	private int id;
	private int order;

	public Cover getCover(){
		return cover;
	}

	public List<Object> getChildren(){
		return children;
	}

	public int getParentId(){
		return parentId;
	}

	public String getName(){
		return name;
	}

	public ParentCategory getParentCategory(){
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