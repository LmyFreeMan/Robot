package com.pojo.Ncov;

import java.util.List;

public class Ncov {
    private int code;

    private String msg;

    private List<NewsList> newslist;

    public void setCode(int code){
        this.code = code;
    }
    public int getCode(){
        return this.code;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return this.msg;
    }
    public void setNewslist(List<NewsList> newslist){
        this.newslist = newslist;
    }
    public List<NewsList> getNewslist(){
        return this.newslist;
    }
}