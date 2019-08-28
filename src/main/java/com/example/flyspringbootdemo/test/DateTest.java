package com.example.flyspringbootdemo.test;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;

/**
 * @author GEEX616
 * @create 2019-08-23 12:46
 * @desc 时间比较
 **/
@Slf4j
public class DateTest {



    public static void main(String[] args) throws Exception {
       /* Date date0=new Date();
        Date date1=new Date();
        String signTime="9:30";
        String signOutTime="9:25";
        String[] arrs = {"HH:mm"};
        log.info("date[{}]date1",date0.compareTo(date1)>0?">":"<");
        log.info("{} [{}] {}",signTime, DateUtils.parseDate(signTime,arrs).compareTo(DateUtils.parseDate(signOutTime,arrs))>0?">":"<",signOutTime);
        log.info("{} [{}] {}",signTime, DateUtils.parseDate(signTime,arrs).compareTo(DateUtils.parseDate(signOutTime,arrs)),signOutTime);
        //获取年月日用日历方法
        Calendar calendar = Calendar.getInstance();
        log.info("当前时间：{}",calendar.getTime());
        log.info("当前时间 年{}月{}日{}时{}分{}秒{}",calendar.YEAR,calendar.MONTH,calendar.DAY_OF_MONTH,calendar.HOUR,calendar.MINUTE,calendar.MILLISECOND);
        log.info("**********************************************************************************");
        *//**获取年月日的正确方法*//*
        Calendar cal = Calendar.getInstance(Locale.CHINA);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(cal.toString());
        System.out.println(sdf.format(cal.getTime()));
        int year = cal.get(Calendar.YEAR);
        //比当前月份少1
        int month = cal.get(Calendar.MONTH)+1;
        //date表示日期，day表示天数，所以date与day_of_month相同
        int date = cal.get(Calendar.DATE);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int firstDay = cal.getFirstDayOfWeek();
        //public final static int SUNDAY = 1;表示一周开始的第一天为周日
        System.out.println("firstDay:" + firstDay);
        //表示本周的第几天，从周日开始计算
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
        //12小时制
        int hour = cal.get(Calendar.HOUR);
        //24小时制
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int millisecond = cal.get(Calendar.MILLISECOND);
        int maxDate = cal.getActualMaximum(Calendar.DATE);
        System.out.println("现在的年份为:" + year);
        System.out.println("现在的月份为:" + month);
        //2018年12月18号
        System.out.println("现在的号为:" + date);
        System.out.println("现在的号为:" + dayOfMonth);
        System.out.println("现在是星期:" + dayOfWeek);
        System.out.println("现在过了的天数为:" + dayOfYear);
        System.out.println("现在几点:" + hour);
        System.out.println("现在几点:" + hourOfDay);
        System.out.println("现在几分:" + minute);
        System.out.println("现在几秒:" + second);
        System.out.println("现在几毫秒:" + millisecond);
        System.out.println("本月最后一天是:" + maxDate);
        System.out.println("Hello World!");*/
        /*String a="-04:50";
        String b="00:00";
        String max = max(a, b);
        log.info("max{}",max);*/
        System.out.println("input a Integer ");
        int num=5;
        int len= LengthNum(num);
        log.info("位数为："+len);
//        log.info("时间格式化为：{}",DateUtils.parseDate("4:30",new String[]{"HH:mm"}));

    }
    public  static String  max(String arg0,String arg1) throws  Exception{
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        return  format.parse(arg0).getTime()-format.parse(arg1).getTime()>=0?arg0:arg1;
    }
 	public static int LengthNum(int num) {
        int count=0; //计数
        while(num>=1) {
            num/=10;
            count++;
        }
        return count;
    }

}
