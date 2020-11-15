package com.mobilium.vitrin.pojos;

public class ShopsItem{
	private int commentCount;
	private boolean isEditorChoice;
	private boolean nameUpdateable;
	private int productCount;
	private String createdAt;
	private int vacationMode;
	private int followerCount;
	private int shopPaymentId;
	private Cover cover;
	private int shopRate;
	private String shareUrl;
	private String name;
	private Object logo;
	private String definition;
	private int id;
	private boolean isFollowing;
	private String slug;

	public int getCommentCount(){
		return commentCount;
	}

	public boolean isIsEditorChoice(){
		return isEditorChoice;
	}

	public boolean isNameUpdateable(){
		return nameUpdateable;
	}

	public int getProductCount(){
		return productCount;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public int getVacationMode(){
		return vacationMode;
	}

	public int getFollowerCount(){
		return followerCount;
	}

	public int getShopPaymentId(){
		return shopPaymentId;
	}

	public Cover getCover(){
		return cover;
	}

	public int getShopRate(){
		return shopRate;
	}

	public String getShareUrl(){
		return shareUrl;
	}

	public String getName(){
		return name;
	}

	public Object getLogo(){
		return logo;
	}

	public String getDefinition(){
		return definition;
	}

	public int getId(){
		return id;
	}

	public boolean isIsFollowing(){
		return isFollowing;
	}

	public String getSlug(){
		return slug;
	}
}
