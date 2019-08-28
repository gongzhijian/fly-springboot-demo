package com.example.flyspringbootdemo.mybio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 * @author GEEX616
 * @create 2019-08-05 12:28
 * @desc
 **/
public class TimerServerHander implements Runnable {

    private Socket socket;

    public TimerServerHander(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        BufferedReader in=null;
        PrintWriter out=null;
        try {
           in= new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
           out=new PrintWriter(this.socket.getOutputStream(),true);
           String body=null;

           while ((body=in.readLine())!=null&&body.length()!=0){
               System.out.println("the time server receive msg :"+body);
               out.print(new Date().toString());
           }
        }catch (Exception e){
            e.getStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.close();
        }
    }
}
