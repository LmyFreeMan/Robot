package com.pojo.morning;

import java.util.List;

public class Morning {
    private String msg;
    private int code;
    private List<NewsList> newslist;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setNewslist(List<NewsList> newslist) {
        this.newslist = newslist;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public List<NewsList> getNewslist() {
        return newslist;
    }
}