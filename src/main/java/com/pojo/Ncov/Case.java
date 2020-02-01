package com.pojo.Ncov;

public class Case {
        private int id;

        private int createTime;

        private int modifyTime;

        private String tags;

        private int countryType;

        private String continents;

        private String provinceId;

        private String provinceName;

        private String provinceShortName;

        private String cityName;

        private int confirmedCount;

        private int suspectedCount;

        private int curedCount;

        private int deadCount;

        private String comment;

        private int sort;

        private String operator;

        public void setId(int id){
        this.id = id;
    }
        public int getId(){
        return this.id;
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
        public void setTags(String tags){
        this.tags = tags;
    }
        public String getTags(){
        return this.tags;
    }
        public void setCountryType(int countryType){
        this.countryType = countryType;
    }
        public int getCountryType(){
        return this.countryType;
    }
        public void setContinents(String continents){
        this.continents = continents;
    }
        public String getContinents(){
        return this.continents;
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
        public void setProvinceShortName(String provinceShortName){
        this.provinceShortName = provinceShortName;
    }
        public String getProvinceShortName(){
        return this.provinceShortName;
    }
        public void setCityName(String cityName){
        this.cityName = cityName;
    }
        public String getCityName(){
        return this.cityName;
    }
        public void setConfirmedCount(int confirmedCount){
        this.confirmedCount = confirmedCount;
    }
        public int getConfirmedCount(){
        return this.confirmedCount;
    }
        public void setSuspectedCount(int suspectedCount){
        this.suspectedCount = suspectedCount;
    }
        public int getSuspectedCount(){
        return this.suspectedCount;
    }
        public void setCuredCount(int curedCount){
        this.curedCount = curedCount;
    }
        public int getCuredCount(){
        return this.curedCount;
    }
        public void setDeadCount(int deadCount){
        this.deadCount = deadCount;
    }
        public int getDeadCount(){
        return this.deadCount;
    }
        public void setComment(String comment){
        this.comment = comment;
    }
        public String getComment(){
        return this.comment;
    }
        public void setSort(int sort){
        this.sort = sort;
    }
        public int getSort(){
        return this.sort;
    }
        public void setOperator(String operator){
        this.operator = operator;
    }
        public String getOperator(){
        return this.operator;
    }
    }