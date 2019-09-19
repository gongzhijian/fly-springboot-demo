package com.example.flyspringbootdemo.test;

import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author GEEX616
 * @create 2019-09-18 15:45
 * @desc
 **/
public class CompareTest {

    private static Logger logger=LoggerFactory.getLogger(CompareTest.class);

    public static String[] arr= new String[]{"HH:mm"};

    public Map<String,Long> compareToLate(String object, String middleStart, String middleStop) throws Exception {
        HashMap<String, Long> map = new HashMap<>();
        int i = DateUtils.parseDate(object, arr).compareTo(DateUtils.parseDate(middleStart, arr));
        if(i==1){
           if(DateUtils.parseDate(object, arr).compareTo(DateUtils.parseDate(middleStop, arr))==1){
               map.put(object,1*1000*60L);
           }else {
               map.put(middleStart,0L);
           }
        }else  {
           map.put(object,0L);
        }
        return map;
    }


    public Map<String,Long> compareToEarly(String object, String middleStart, String middleStop) throws Exception {
        HashMap<String, Long> map = new HashMap<>();
        int i = DateUtils.parseDate(object, arr).compareTo(DateUtils.parseDate(middleStop, arr));
        if(i==1){
            map.put(object,0L);
        }else  {
            if(DateUtils.parseDate(object, arr).compareTo(DateUtils.parseDate(middleStart, arr))==1){
                map.put(middleStop,0L);
            }else {
                map.put(object,1*1000*60L);
            }
        }
        return map;
    }

    public static void main(String[] args) throws Exception {
        CompareTest compareTest = new CompareTest();
       /* int i = DateUtils.parseDate("12:00", arr).compareTo(DateUtils.parseDate("12:00", arr));
        logger.info("结果为："+i);
        Map<String, Long> map = compareTest.compareToLate("13:20", "12:00", "13:00");
        logger.info("10:30 结果为：{}",map);
        long l = DateUtils.parseDate("12:00", arr).getTime() - DateUtils.parseDate("11:00", arr).getTime();
        logger.info("差为：{}",l/1000/60/60);*/
        Map<String, Long> map = compareTest.compareToEarly("11:30", "12:00", "13:00");
        logger.info("结果为：{}",map);
    }
}
