package com.jcq;
import com.alibaba.fastjson.JSONObject;
import com.api.Request;
import com.github.houbb.markdown.toc.core.impl.AtxMarkdownToc;
import com.github.houbb.markdown.toc.vo.TocGen;
import org.junit.Test;
import org.meowy.cqp.jcq.entity.CoolQ;
import org.meowy.cqp.jcq.event.JcqApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.util.*;
public class Util {

    private static final CoolQ CQ =null ;

    public static String randWord(){
        String word[]={
                "如果你不给自己设限，世界上便没有限制你发挥的篱笆。",
                "敢行动，梦想才生动！",
                "大智若愚，求知若渴。",
                "Take is cheap,Show me your code",
                "博观而约取，厚积而薄发。",
                "博学之，审问之，慎思之，明辨之，笃行之",
                "不飞则已，一飞冲天；不鸣则已，一鸣惊人",
                "穷则独善其身，富则兼济天下",
                "Whatever is worth doing is worth doing well",
                "Jack of all trades and master of none"};
        Random random=new Random();
        return word[random.nextInt(word.length)];
    }
    public static  String Aicode(String str){
        str = str.replace("吗", "");
        str = str.replace("？", "!");
        str = str.replace("？ ", "! ");
        return str;
    }

    /**
     * 功能描述：返回月
     *
     * @param date
     *  Date 日期
     * @return 返回月份
     */
    public static int getMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * 功能描述：返回日期
     *
     * @param date
     * Date 日期
     * @return 返回日份
     */
    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }


    public static String getOwnDate(){
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR)+"年"+getMonth(new Date())+"月"+getDay(new Date())+"号";
    }
    public static int getHour(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
    @Test
    public void test(){
        List<TocGen> tocGens = AtxMarkdownToc.newInstance()
                .genTocDir("E:\\Java\\Robot");
        System.out.println(tocGens.size());
    }
    public static int getMinute(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MINUTE);
    }
}