package com.example.flyspringbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

import java.util.Date;

/**
 * @author GEEX616
 * @create 2019-08-08 15:15
 * @desc comon-lang工具类
 **/
@Slf4j
public class CommonUtilTest {

    /**
     * 测试时间
     */
    @Test
    public void test()throws Exception{
        String time="2019-8-06";
        Date date = new Date();
        log.info("当前时间:{}",date);
        date=DateUtils.addDays(date,2);
        log.info("推2天后的时间:{}",date);
        date=DateUtils.addHours(date,3);
        log.info("推3个小时的时间:{}",date);
        Date parseDate = DateUtils.parseDate(time, new String[]{ "yyyy-MM-dd","yyyy-MM-dd HH:mm:ss"});
        log.info("将String类型时间格式化为Date，{}",parseDate);
        String format = DateFormatUtils.format(date, "yyyy-MM-dd");
        log.info("格式化时间Date为String:[{}]",format);
        Date date1 = DateUtils.setDays(date, 9);
        log.info("setDays后为：[{}]",date1);
        log.info("此时的Date:[{}]",date);
        long time1 = DateUtils.toCalendar(date).getTime().getTime();
        long time2 = DateUtils.toCalendar(date1).getTime().getTime();
        log.info("转换的日期分别为：[{},{}]",time1,time2);
        long left = (time2 - time1) / 1000 / 60/60;
        log.info("两个时间相差:[{}]",left);
    }

    @Test
    public void testStrig(){
        String s="tomcat";
        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
        buffer.append("tomcat");
        buffer.insert(0,"hello,");
        log.info("buffer:[{}]",buffer);
    }
}
