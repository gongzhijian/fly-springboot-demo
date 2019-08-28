package com.example.flyspringbootdemo.mybio;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author GEEX616
 * @create 2019-08-05 12:21
 * @desc
 **/
public class BioServer {
    private static  final int PORT=8089;
    public static void main(String[] args) {
        ServerSocket server=null;

        try {
           server = new ServerSocket(PORT);
            System.out.println(server);
            System.out.println("the time server is start in port "+PORT);
            Socket socket=null;
            while (true){
                socket=server.accept();
                new Thread(new TimerServerHander(socket)).start();
            }

        }catch (Exception e){


        }


    }



}
