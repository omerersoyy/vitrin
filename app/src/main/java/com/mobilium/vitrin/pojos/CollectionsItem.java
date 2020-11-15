package com.mobilium.vitrin.pojos;

import com.google.gson.annotations.SerializedName;

public class CollectionsItem{

	@SerializedName("cover")
	private Cover cover;

	@SerializedName("share_url")
	private String shareUrl;

	@SerializedName("start")
	private String start;

	@SerializedName("logo")
	private Logo logo;

	@SerializedName("definition")
	private String definition;

	@SerializedName("end")
	private Object end;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	public Cover getCover(){
		return cover;
	}

	public String getShareUrl(){
		return shareUrl;
	}

	public String getStart(){
		return start;
	}

	public Logo getLogo(){
		return logo;
	}

	public String getDefinition(){
		return definition;
	}

	public Object getEnd(){
		return end;
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}
}