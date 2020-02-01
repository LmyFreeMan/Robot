package com.pojo.Ncov;

public class News
{
    private int id;

    private int pubDate;

    private String pubDateStr;

    private String title;

    private String summary;

    private String infoSource;

    private String sourceUrl;

    private String provinceId;

    private String provinceName;

    private int createTime;

    private int modifyTime;

    private int entryWay;

    private int adoptType;

    private int infoType;

    private int dataInfoState;

    private String dataInfoOperator;

    private int dataInfoTime;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setPubDate(int pubDate){
        this.pubDate = pubDate;
    }
    public int getPubDate(){
        return this.pubDate;
    }
    public void setPubDateStr(String pubDateStr){
        this.pubDateStr = pubDateStr;
    }
    public String getPubDateStr(){
        return this.pubDateStr;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setSummary(String summary){
        this.summary = summary;
    }
    public String getSummary(){
        return this.summary;
    }
    public void setInfoSource(String infoSource){
        this.infoSource = infoSource;
    }
    public String getInfoSource(){
        return this.infoSource;
    }
    public void setSourceUrl(String sourceUrl){
        this.sourceUrl = sourceUrl;
    }
    public String getSourceUrl(){
        return this.sourceUrl;
    }
    public void setProvinceId(String provinceId){
        this.provinceId = provinceId;
    }
    public String getProvinceId(){
        return this.provinceId;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public String getProvinceName(){
        return this.provinceName;
    }
    public void setCreateTime(int createTime){
        this.createTime = createTime;
    }
    public int getCreateTime(){
        return this.createTime;
    }
    public void setModifyTime(int modifyTime){
        this.modifyTime = modifyTime;
    }
    public int getModifyTime(){
        return this.modifyTime;
    }
    public void setEntryWay(int entryWay){
        this.entryWay = entryWay;
    }
    public int getEntryWay(){
        return this.entryWay;
    }
    public void setAdoptType(int adoptType){
        this.adoptType = adoptType;
    }
    public int getAdoptType(){
        return this.adoptType;
    }
    public void setInfoType(int infoType){
        this.infoType = infoType;
    }
    public int getInfoType(){
        return this.infoType;
    }
    public void setDataInfoState(int dataInfoState){
        this.dataInfoState = dataInfoState;
    }
    public int getDataInfoState(){
        return this.dataInfoState;
    }
    public void setDataInfoOperator(String dataInfoOperator){
        this.dataInfoOperator = dataInfoOperator;
    }
    public String getDataInfoOperator(){
        return this.dataInfoOperator;
    }
    public void setDataInfoTime(int dataInfoTime){
        this.dataInfoTime = dataInfoTime;
    }
    public int getDataInfoTime(){
        return this.dataInfoTime;
    }
}