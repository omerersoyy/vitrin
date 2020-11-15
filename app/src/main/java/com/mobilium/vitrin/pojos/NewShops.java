package com.mobilium.vitrin.pojos;

import java.util.List;

public class NewShops{
	private List<ShopsItem> shops;
	private String type;
	private String title;

	public List<ShopsItem> getShops(){
		return shops;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}
}