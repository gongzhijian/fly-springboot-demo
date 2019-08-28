package com.example.flyspringbootdemo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author GEEX616
 * @create 2019-08-19 9:43
 * @desc
 **/
public class Demo {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3,Executors.defaultThreadFactory());
        Mytask mytask = new Mytask();
        for (int i = 0; i < 5; i++) {
            executorService.submit(mytask);
        }
        executorService.shutdown();
    }
}
