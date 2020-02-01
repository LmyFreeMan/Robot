package com.pojo.Ncov;


import java.util.List;

public class NewsList
{
    private List<News> news;

    private List<Case> cases;

    private Desc desc;

    public void setNews(List<News> news){
        this.news = news;
    }
    public List<News> getNews(){
        return this.news;
    }
    public void setCase(List<Case> cases){
        this.cases = cases;
    }
    public List<Case> getCase(){
        return this.cases;
    }
    public void setDesc(Desc desc){
        this.desc = desc;
    }
    public Desc getDesc(){
        return this.desc;
    }
}