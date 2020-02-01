package com.api;
import	java.util.ArrayList;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.pojo.Ncov.*;
import com.pojo.Ncov.NewsList;
import com.pojo.hotcomment.HotComment;
import com.pojo.itnews.ItNews;
import com.pojo.itnews.Newslist;
import com.pojo.morning.*;
import com.pojo.night.Night;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;

import static com.jcq.Util.getOwnDate;

public class Request {
    protected static String key="Your Key";
    protected static String nCoVUrl="http://api.tianapi.com/txapi/ncov/index";
    protected static String morningUrl="http://api.tianapi.com/txapi/zaoan/index";
    protected static String nightUrl="http://api.tianapi.com/txapi/wanan/index";
    protected static String hotcommentUrl="http://api.tianapi.com/txapi/hotreview/index";
    protected static String itUrl="http://api.tianapi.com/it/index";
    /**
     * @param httpUrl :请求接口
     * @param httpArg  :参数
     * @return 返回结果
     */
    public static String request(String httpUrl, String httpArg) {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?key=" + httpArg;

        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setRequestMethod("GET");
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sbf.append(strRead);
                sbf.append("\r\n");
            }
            reader.close();
            result = sbf.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @name:getnCoVInfo
     * @describe:获取nCoV疫情信息
     * @return:java.lang.String
     * @date:2020/2/1 13:27
     */
      public static String getnCoVInfo() {
          JSONObject ncovJson = JSONObject.parseObject(request(nCoVUrl,key));
          Ncov ncov = JSON.toJavaObject(ncovJson,Ncov.class);
          NewsList newsList=ncov.getNewslist().get(0);
          //获得详细的新闻列表
          ArrayList Datailnews= (ArrayList) newsList.getNews();
          //获得详细的数据
          ArrayList DatailData= (ArrayList) newsList.getCase();
          //获得总共数据
          Desc desc=newsList.getDesc();
          //获得湖北省数据
          Case hubei= (Case) DatailData.get(33);
          //获得河南省数据
          Case henan= (Case) DatailData.get(30);
          //获得河北数据
          Case hebei= (Case) DatailData.get(17);
          //字符串拼接
          StringBuffer sb = new StringBuffer();
          sb.append("病毒名称:"+desc.getVirus()+"\r\n"+"确诊病例"+desc.getConfirmedCount()+",");
          sb.append("疑似病例"+desc.getSuspectedCount()+","+"治愈病例"+desc.getCuredCount()+","+"死亡病例"+desc.getDeadCount()+"\r\n");
          sb.append(desc.getRemark1()+","+desc.getRemark2()+"\r\n\n");
          sb.append(desc.getGeneralRemark()+"\r\n");
          sb.append(hubei.getProvinceName()+"确诊病例"+hubei.getConfirmedCount()+",");
          sb.append("疑似病例"+hubei.getSuspectedCount()+","+"治愈病例"+hubei.getCuredCount()+","+"死亡病例"+hubei.getDeadCount()+"\r\n");
          sb.append(henan.getProvinceName()+"确诊病例"+henan.getConfirmedCount()+",");
          sb.append("疑似病例"+henan.getSuspectedCount()+","+"治愈病例"+henan.getCuredCount()+","+"死亡病例"+henan.getDeadCount()+"\r\n");
          sb.append(hebei.getProvinceName()+"确诊病例"+hebei.getConfirmedCount()+",");
          sb.append("疑似病例"+hebei.getSuspectedCount()+","+"治愈病例"+hebei.getCuredCount()+","+"死亡病例"+hebei.getDeadCount()+"\r\n\n");
          sb.append("疫情热点新闻如下："+"\n");
          for(int i=0;i<Datailnews.size();i++){
            News news= (News) Datailnews.get(i);
            sb.append(i+1+":"+news.getTitle()+"\n"+news.getSummary()+"\n原文地址"+news.getSourceUrl()+"\n\n");
          }
           return  sb.toString();
      }

       public static String getMorning(){
           JSONObject morningJson = JSONObject.parseObject(request(morningUrl,key));
           Morning morning = JSON.toJavaObject(morningJson, Morning.class);
           com.pojo.morning.NewsList newsList=morning.getNewslist().get(0);
           String sb="早上好,今天是"+getOwnDate()+"\r\n"+newsList.getContent();
           return sb;
       }
    public static String  getNight(){
        JSONObject nightJson = JSONObject.parseObject(request(nightUrl,key));
        Night night = JSON.toJavaObject(nightJson, Night.class);
        com.pojo.night.NewsList newsList=night.getNewslist().get(0);
        String sb="不早了，早点休息！\r\n"+newsList.getContent();
        return sb;
    }
    public static String  itNews(){
        StringBuffer stringBuffer=new StringBuffer();
        JSONObject itNewsJson = JSONObject.parseObject(request(itUrl,key));
        ItNews itNews = JSON.toJavaObject(itNewsJson, ItNews.class);
        ArrayList arrayList = (ArrayList) itNews.getNewslist();
        stringBuffer.append("汇华IT行业精英交流群今日新闻\r\n\n");
        for (int i = 0; i <arrayList.size() ; i++) {
            Newslist newslist= (Newslist) arrayList.get(i);
            stringBuffer.append(i+1+":"+newslist.getTitle()+"\r\n"+"详情请看"+newslist.getUrl()+"\r\n\n");
        }
        return stringBuffer.toString();
    }
    public static String hotComment(){
        JSONObject hotCommentJson = JSONObject.parseObject(request(hotcommentUrl,key));
        HotComment hotComment = JSON.toJavaObject(hotCommentJson, HotComment.class);
        com.pojo.hotcomment.NewsList newsList=hotComment.getNewslist().get(0);
        String sb="来自网易云热评："+newsList.getContent()+"----"+newsList.getSource();
        return sb;
    }

}