package com.example.flyspringbootdemo.controller;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.flyspringbootdemo.domain.User;
import com.example.flyspringbootdemo.easyexcle.ImportInfo;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author GEEX616
 * @create 2019-07-18 10:18
 * @desc
 **/
@RequestMapping("/user")
@RestController
@Slf4j
public class UserController {

    static String TESTSTRING;


    @RequestMapping("/get")
    public User get(){
        User user = new User();
        user.setCreareDate(new Date());
        return user;
    }

    @RequestMapping("/set")
    public User set(@RequestBody User user){
        log.info("此人为：{}",user);
        return user;
    }



    @RequestMapping("/export")
    public void export(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String fileName="easyexcle";
        OutputStream out = null;
        InputStream is = null;
        out = response.getOutputStream();// 取得输出流
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Disposition", "attachment; filename="
                + new String(fileName.getBytes("UTF-8"), "UTF-8")+".xlsx");//fileName为下载时用户看到的文件名利用jxl 将数据从后台导出为excel
        response.setHeader("Content-Type", "application/msexcel");
        try {
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            //写第一个sheetSS
            Sheet sheet = new Sheet(1,3,ImportInfo.class);
            writer.write(getDate(),sheet);
            writer.finish();
            response.flushBuffer();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }

    @RequestMapping("/append")
    public String append(){
        long l = System.currentTimeMillis();
       /* log.info("操作前的时间：[{}]",l);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <1000000 ; i++) {
            builder.append("tomcat");
        }
        long l1 = System.currentTimeMillis();
        log.info("操作后的时间：[{}]",l1);
        log.info("操作间隔时间:[{}]",l1-l);
        return builder.toString();*/
       StringBuilder builder=new StringBuilder();
        for (int i = 0; i <1000000 ; i++) {
            builder.append("tomcat");
        }
        long l1 = System.currentTimeMillis();
        log.info("操作后的时间：[{}]",l1);
        log.info("操作间隔时间:[{}]",l1-l);
        return builder.toString();
    }


    @RequestMapping("/getQrCode")
    public void getQrCode(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String fileName="QrCode";
        OutputStream out = null;
        InputStream is = null;
        out = response.getOutputStream();
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Disposition", "attachment; filename="
                + new String(fileName.getBytes("UTF-8"), "UTF-8")+".png");
        response.setHeader("Content-Type", "image/png");
        generateQRCodeImage("This is my first QR Code", 350, 350, out);
        log.info("导出图片success");
    }

    private static void generateQRCodeImage(String text, int width, int height, OutputStream  outputStream) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

//        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToStream(bitMatrix, "PNG", outputStream);
    }



    public List<ImportInfo> getDate(){
        List<ImportInfo> list = new ArrayList<ImportInfo>();
        for (int i = 1; i <=600000 ; i++) {
            ImportInfo info = new ImportInfo();
            info.setAge(12+i);
            info.setName("zhangsan"+i);
            info.setEmail("11111@qq.com"+i);
            info.setCreateTime(new Date());
            list.add(info);
        }
        return list;
    }

    public List<List<ImportInfo>> getDate2(){
        List<List<ImportInfo>> list2 = new ArrayList<>();
        List<ImportInfo> list = new ArrayList<>();
        ImportInfo info = new ImportInfo();
        info.setAge(12);
        info.setName("zhangsan");
        info.setEmail("11111@qq.com");
        ImportInfo info1 = new ImportInfo();
        info1.setAge(12);
        info1.setName("zhangsan1");
        info1.setEmail("11111@qq.com");
        ImportInfo info2 = new ImportInfo();
        info2.setAge(12);
        info2.setName("zhangsan2");
        info2.setEmail("11111@qq.com");
        list.add(info);
        list.add(info1);
        list.add(info2);
        list2.add(list);
        return list2;
    }


    private InputStream getInputStream(String fileName) {
        try {
            return new FileInputStream(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
