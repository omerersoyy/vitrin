package com.mobilium.vitrin.pojos;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Collections{

	@SerializedName("collections")
	private List<CollectionsItem> collections;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	public List<CollectionsItem> getCollections(){
		return collections;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}
}