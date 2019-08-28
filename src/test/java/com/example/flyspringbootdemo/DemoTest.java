package com.example.flyspringbootdemo;

import geex.gong.springbootdemo.controller.UserController;
import geex.gong.springbootdemo.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author GEEX616
 * @create 2019-07-18 10:16
 * @desc
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoTest {

    @Autowired
    UserController userController;

    @Test
    public void test() throws Exception {
//        String s = userController.get();
        log.info("*****************************************");
//        log.info(s);
        log.info("*****************************************");

    }


    @Test
    public void test1() throws Exception {
        String dt = "2018-7-1";
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        Calendar c = Calendar.getInstance(Locale.CHINA);
        /*c.setTime(f.parse(dt));
//        c.add(Calendar.YEAR, -1);//拨回去年
        c.set(Calendar.DAY_OF_YEAR,c.getActualMaximum(Calendar.DAY_OF_YEAR));//最后一天
        System.out.println("去年最后一天:"+f.format(c.getTime()));*/
        c.setTime(f.parse(dt));
        c.add(Calendar.MONTH, 3);
        c.add(Calendar.DATE, -1);
        Date date = c.getTime();
        log.info(f.format(date));
        /*double   f   =   111231.5585;
        *//*BigDecimal b   =   new   BigDecimal(f);
        double   f1   =   b.setScale(0,   BigDecimal.ROUND_HALF_UP).doubleValue();
        log.info(f1+"");*//*
        Double d1  = new Double(5.5) ;
        int i1 = d1.intValue() ;
        log.info(i1+"");*/
       /* float size = (float)15/90;
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数，不足的补0
        String filesize = df.format(size);//返回的是String类型的
        System.out.println(Double.parseDouble(filesize));*/
    }


    @Test
    public void test2() throws Exception {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.add(4);
        int a = 5;
        objects.add(++a);
        log.info(objects.get(objects.size() - 1).toString());
    }


    @Test
    public void test3() {
        String content = "we are friends";
        User user = new User();
        try {
            log.info("test log first:[{}],second[{}]", userController.get(), user);
            String s = null;
            s.toString();
        } catch (Exception e) {
            log.error("returnning first:[{}],scrond[{}]", userController.get(), user, e);
        }


    }

}
