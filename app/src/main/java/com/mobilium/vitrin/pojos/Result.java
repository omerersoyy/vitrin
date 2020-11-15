package com.mobilium.vitrin.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("type")
    @Expose
    public String type;

    @SerializedName("title")
    @Expose
    public String title;

    @SerializedName("featured")
    @Expose
    public List<Featured> featured;

    @SerializedName("products")
    @Expose
    public List<NewProducts> products;

    @SerializedName("categories")
    @Expose
    public List<Categories> categories;

    @SerializedName("collections")
    @Expose
    public List<Collections> collections;

    @SerializedName("shops")
    @Expose
    public List<Shop> shops;
}
