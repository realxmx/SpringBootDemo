package com.example.demo.model;

import java.io.Serializable;

public class Movie implements Serializable{
    
    private int id;
    private String name;
    private int hot;
    private String img;
    private String info;
    private String profile;
    private String site;
    
    public Movie(){
        super();
    }
    
    public Movie(String name, int hot, String img, String info, String profile, String site) {
        this.name = name;
        this.hot = hot;
        this.img = img;
        this.info = info;
        this.profile = profile;
        this.site = site;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", name=" + name + ", hot=" + hot + ", img=" + img + ", info=" + info + ", profile="
                + profile + ", site=" + site + "]";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

}
