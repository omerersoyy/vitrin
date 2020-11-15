package com.mobilium.vitrin.pojos;

import java.util.List;

public class ProductsItem{
	private int commentCount;
	private Object maxInstallment;
	private boolean isEditorChoice;
	private Object code;
	private Shop shop;
	private String title;
	private int categoryId;
	private int price;
	private String definition;
	private int id;
	private int stock;
	private String slug;
	private boolean isLiked;
	private List<ImagesItem> images;
	private boolean isActive;
	private int likeCount;
	private boolean isNew;
	private boolean isOwner;
	private int oldPrice;
	private int cargoTime;
	private Object rejectReason;
	private String shareUrl;
	private String difference;
	private boolean isApproved;
	private int commissionRate;
	private Category category;
	private boolean isCargoFree;

	public int getCommentCount(){
		return commentCount;
	}

	public Object getMaxInstallment(){
		return maxInstallment;
	}

	public boolean isIsEditorChoice(){
		return isEditorChoice;
	}

	public Object getCode(){
		return code;
	}

	public Shop getShop(){
		return shop;
	}

	public String getTitle(){
		return title;
	}

	public int getCategoryId(){
		return categoryId;
	}

	public int getPrice(){
		return price;
	}

	public String getDefinition(){
		return definition;
	}

	public int getId(){
		return id;
	}

	public int getStock(){
		return stock;
	}

	public String getSlug(){
		return slug;
	}

	public boolean isIsLiked(){
		return isLiked;
	}

	public List<ImagesItem> getImages(){
		return images;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public int getLikeCount(){
		return likeCount;
	}

	public boolean isIsNew(){
		return isNew;
	}

	public boolean isIsOwner(){
		return isOwner;
	}

	public int getOldPrice(){
		return oldPrice;
	}

	public int getCargoTime(){
		return cargoTime;
	}

	public Object getRejectReason(){
		return rejectReason;
	}

	public String getShareUrl(){
		return shareUrl;
	}

	public String getDifference(){
		return difference;
	}

	public boolean isIsApproved(){
		return isApproved;
	}

	public int getCommissionRate(){
		return commissionRate;
	}

	public Category getCategory(){
		return category;
	}

	public boolean isIsCargoFree(){
		return isCargoFree;
	}
}