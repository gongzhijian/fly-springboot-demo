package com.example.flyspringbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author GEEX616
 * @create 2019-08-08 17:22
 * @desc
 **/
@Slf4j
public class StringMulThreadTest {


    @Test
    public void test(){
        ExecutorService pool = Executors.newFixedThreadPool(3);
        log.info("hello");
        for (int i = 0; i <5 ; i++) {
            pool.execute(getThread());
        }
//        pool.shutdown();

    }

    private static Runnable getThread() {
        return new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    StringBuilder builder=new StringBuilder();
                    long l = System.currentTimeMillis();
                    for (int i = 0; i <2; i++) {
                        builder.append("tomcat");
                    }
                    long l1 = System.currentTimeMillis();
                    System.out.println("hello");
                    log.info("操作后的时间：[{}]",l1);
                    log.info("操作间隔时间:[{}]",l1-l);
                    log.info("此对象为：[{}]",builder);
                }catch (Exception e){
                   log.error("操作失败",e);
                }

            }
        };
    }
}
