package com.example.flyspringbootdemo.test;


import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author GEEX616
 * @create 2019-08-06 11:00
 * @desc
 **/
public class Demo {


    public static void main(String[] args) throws Exception{
        StudentReq studentReq = new StudentReq(1,"tomcat","101",23);
        TeacherReq teacherReq = new TeacherReq();
        BeanUtils.copyProperties(studentReq,teacherReq);
        System.out.println(teacherReq);


        /*HashSet<String> dates = new HashSet<>();
        dates.add( DateFormatUtils.format(new Date(),"yyyy/MM/dd"));
        if(dates.contains( DateFormatUtils.format(new Date(),"yyyy/MM/dd"))){
            System.out.println("AAAAAA");
        }else {
            System.out.println("BBBBBBBB");
        }*/
        String a="8:00";
        String b="12:00";
        Date datea = DateUtils.parseDate(a, new String[]{"HH:mm"});
        Date dateb = DateUtils.parseDate(b, new String[]{"HH:mm"});
        Long c=dateb.getTime()-datea.getTime();
        System.out.println(c);
        long hours = (c % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (c % (1000 * 60 * 60)) / (1000 * 60);
        System.out.println("小时："+hours);
        System.out.println("分钟:"+minutes);
        Double paiBanLate=0.0;

        paiBanLate= div(minutes, 60, 2)+hours;
        paiBanLate=(double)Math.round(paiBanLate*100)/100;
        System.out.println(paiBanLate);
        /*Calendar calendar = Calendar.getInstance(Locale.CHINA);
        System.out.println(calendar.getTime());
        Date date = new Date();
        date.setTime(c);
        System.out.println(date);
        calendar.setTime(date);
        System.out.println(calendar.getTime());*/
    }

    public static double div(double v1,double v2,int scale){
        if(scale<0){
            throw new IllegalArgumentException("scale不能小于0");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
