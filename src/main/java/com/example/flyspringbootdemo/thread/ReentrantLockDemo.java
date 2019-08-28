package com.example.flyspringbootdemo.thread;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author GEEX616
 * @create 2019-08-09 18:22
 * @desc ReentrantLock
 **/
@Slf4j
public class ReentrantLockDemo implements Runnable {

    ReentrantLock reentrantLock=new ReentrantLock();

    private int count=5;


    public void add(){
        try {
            reentrantLock.lock();
            count--;
            log.info("此时的count: "+count);
            log.info(Thread.currentThread().getName()+"执行了");
            Date date = new Date();
            String format = DateFormatUtils.format(date, "HH:mm");
            if(format!=null){
                throw new RuntimeException("运营异常");
            }
            log.info("hello world");
            return;
        }catch (Exception e){
           log.error ("添加失败",e);
        }finally {
            reentrantLock.unlock();
            log.info("解锁了");
        }

    }


    @Override
    public void run() {
        add();
    }

    public static void main(String[] args) {
        ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
        for (int i = 0; i <1 ; i++) {
            new Thread(reentrantLockDemo,"线程"+i).start();
        }

    }
}
