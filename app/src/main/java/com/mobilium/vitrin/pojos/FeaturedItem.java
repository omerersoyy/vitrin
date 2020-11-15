package com.mobilium.vitrin.pojos;

import com.google.gson.annotations.SerializedName;

public class FeaturedItem{

	@SerializedName("cover")
	private Cover cover;

	@SerializedName("sub_title")
	private String subTitle;

	@SerializedName("id")
	private int id;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	public Cover getCover(){
		return cover;
	}

	public String getSubTitle(){
		return subTitle;
	}

	public int getId(){
		return id;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}
}