package com.example.flyspringbootdemo.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author GEEX616
 * @create 2019-08-08 18:16
 * @desc
 **/
@Slf4j
public class StringTest {

    public static void main(String[] args) {
        StringBuffer builder=new StringBuffer();
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            pool.execute(getThread(builder));
        }
    }
    private static Runnable getThread(StringBuffer builder) {
        return new Runnable() {
            @Override
            public void run() {
                try {

                    log.info("当前线程为：{}",Thread.currentThread().getName());
                    Thread.sleep(3000L);
                    long l = System.currentTimeMillis();
                        builder.append("1");
                    long l1 = System.currentTimeMillis();
                    log.info("此对象为：[{}]",builder);
                    Thread.sleep(1000L);
                }catch (Exception e){
                    log.error("操作失败",e);
                }

            }
        };
    }

}
