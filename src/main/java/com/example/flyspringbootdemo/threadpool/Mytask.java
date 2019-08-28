package com.example.flyspringbootdemo.threadpool;

import lombok.extern.slf4j.Slf4j;

/**
 * @author GEEX616
 * @create 2019-08-19 9:42
 * @desc
 **/
@Slf4j
public class Mytask implements Runnable {

    @Override
    public void run() {
        log.info("当前线程为[{}]",Thread.currentThread().getName());
    }
}
