package com.mobilium.vitrin.pojos;

public class ImagesItem{
	private Thumbnail thumbnail;
	private int width;
	private Medium medium;
	private String url;
	private int height;

	public Thumbnail getThumbnail(){
		return thumbnail;
	}

	public int getWidth(){
		return width;
	}

	public Medium getMedium(){
		return medium;
	}

	public String getUrl(){
		return url;
	}

	public int getHeight(){
		return height;
	}
}
