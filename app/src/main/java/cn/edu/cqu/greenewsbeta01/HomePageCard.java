package cn.edu.cqu.greenewsbeta01;

import android.content.Context;

public class HomePageCard {
    String arcticle_title;
    String pic_path;
    int pic_id;

    public HomePageCard(String title,int picid){
        this.arcticle_title=title;
        this.pic_id=picid;
    }
    public HomePageCard(String title,String pic_path){
        this.arcticle_title=title;
        this.pic_path=pic_path;
    }

    public void setTitle(String title){
        this.arcticle_title=title;
    }

    public void setPic_path(String content){
        this.pic_path=content;
    }
    public void setPic_id(int id) {
        this.pic_id=id;
    }

    public int getPic_id() {
        return pic_id;
    }
    public String getPic_path(){
        return pic_path;
    }

    public String getArcticle_title(){
        return arcticle_title;
    }



}
