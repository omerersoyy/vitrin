package com.mobilium.vitrin.pojos;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Featured{

	@SerializedName("featured")
	private List<FeaturedItem> featured;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	public List<FeaturedItem> getFeatured(){
		return featured;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}
}