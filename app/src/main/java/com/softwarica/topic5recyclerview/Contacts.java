package com.softwarica.topic5recyclerview;

public class Contacts {
    private String name;
    private String tvType;
    private int imageId;

    public Contacts(String name, String tvType, int imageId) {
        this.name = name;
        this.tvType = tvType;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTvType() {
        return tvType;
    }

    public void setTvType(String phoneNo) {
        this.tvType = tvType;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
