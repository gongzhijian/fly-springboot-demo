package com.example.flyspringbootdemo.thread;

import lombok.extern.slf4j.Slf4j;

/**
 * 多线程抢票案例分析==>
 * 三个窗口抢20张票
 */
@Slf4j
public class MulThreadDemo implements Runnable {

    private volatile int  ticketNum = 20;


    @Override
    public void run() {
        while (true){
                if (ticketNum<=0) {break;}
                ticketNum--;
                log.info("当前线程名为 : {}, ticketNum :{}", Thread.currentThread().getName(), ticketNum);
        }

    }

    public static void main(String[] args) {
        MulThreadDemo threadMul1 = new MulThreadDemo();
        Thread thread1 = new Thread(threadMul1, "第一个窗口");
        Thread thread2 = new Thread(threadMul1, "第二个窗口");
        Thread thread3 = new Thread(threadMul1, "第三个窗口");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
