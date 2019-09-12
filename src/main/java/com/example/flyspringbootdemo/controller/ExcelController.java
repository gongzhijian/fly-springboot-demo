package com.example.flyspringbootdemo.controller;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Font;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.metadata.Table;
import com.alibaba.excel.metadata.TableStyle;
import com.example.flyspringbootdemo.domain.User;
import com.example.flyspringbootdemo.domain.WriterModel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author GEEX616
 * @create 2019-09-05 11:57
 * @desc
 **/
@Slf4j
@RestController
@RequestMapping("/excle")
public class ExcelController {


    /**
     * 有模型.组合数据的导出
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/doExcle")
    public void doExcle(HttpServletRequest request, HttpServletResponse response) throws Exception{
        // 文件输出位置
        String fileName=new String("first("+ DateFormatUtils.format(new Date(),"yyyy.MM.dd")+").xlsx");
        setResponseHeader(response,fileName);
        OutputStream out=response.getOutputStream();
        ExcelWriter writer = EasyExcelFactory.getWriter(out);

        // 写仅有一个 Sheet 的 Excel 文件, 此场景较为通用
        Sheet sheet1 = new Sheet(1, 0, WriterModel.class);

        // 第一个 sheet 名称
        sheet1.setSheetName("第一个sheet");

        // 写数据到 Writer 上下文中
        // 入参1: 创建要写入的模型数据
        // 入参2: 要写入的目标 sheet
        writer.write(createModelList(), sheet1);
        // 将上下文中的最终 outputStream 写入到指定文件中
        writer.finish();

        // 关闭流
        out.close();
    }



    /**
     * 无模型.自定义表头,自组合数据的导出(通用点)
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/doExcle1")
    public void doExcle1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 文件输出位置
        String fileName=new String("first("+ DateFormatUtils.format(new Date(),"yyyy.MM.dd")+").xlsx");
        setResponseHeader(response,fileName);
        OutputStream out= null;
        try {
            out = response.getOutputStream();

        ExcelWriter writer = EasyExcelFactory.getWriter(out);

        // 写仅有一个 Sheet 的 Excel 文件, 此场景较为通用
        Sheet sheet1 = new Sheet(1, 0);

        // 第一个 sheet 名称
        sheet1.setSheetName("第一个sheet");

        Table table = new Table(1);
        table.setHead(createTestListStringHead());
        /**设置样式*/
        /*TableStyle style = new TableStyle();
        Font font = new Font();
        font.setFontHeightInPoints((short) 11);
        font.setBold(false);
        style.setTableHeadFont(font);
        style.setTableContentFont(font);
        style.setTableContentBackGroundColor();
        table.setTableStyle(style);*/
        // 写数据到 Writer 上下文中
        // 入参1: 创建要写入的模型数据
        // 入参2: 要写入的目标 sheet
        writer.write1(createDynamicModelList(), sheet1,table);
        // 将上下文中的最终 outputStream 写入到指定文件中
        writer.finish();

        // 关闭流
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            out.close();
        }
    }


    private List createModelList(){
        ArrayList<WriterModel> list = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            WriterModel writerModel=WriterModel.builder()
                    .name("黄"+i).age(12+i).password("123"+i).build();
            list.add(writerModel);
        }
        return list;
    }

    //发送响应流方法
    public void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(),"ISO8859-1");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



    public static List<List<String>> createTestListStringHead(){
        // 模型上没有注解，表头数据动态传入
        List<List<String>> head = new ArrayList<List<String>>();
        List<String> headCoulumn1 = new ArrayList<String>();
        List<String> headCoulumn2 = new ArrayList<String>();
        List<String> headCoulumn3 = new ArrayList<String>();
        List<String> headCoulumn4 = new ArrayList<String>();
        List<String> headCoulumn5 = new ArrayList<String>();

        /*headCoulumn1.add("第一列");headCoulumn1.add("第一列");headCoulumn1.add("第一列");
        headCoulumn2.add("第一列");headCoulumn2.add("第一列");headCoulumn2.add("第一列");

        headCoulumn3.add("第二列");headCoulumn3.add("第二列");headCoulumn3.add("第二列");
        headCoulumn4.add("第三列");headCoulumn4.add("第三列2");headCoulumn4.add("第三列2");
        headCoulumn5.add("第一列");headCoulumn5.add("第3列");headCoulumn5.add("第4列");*/

        headCoulumn1.add("第一列");
        headCoulumn2.add("第二列");
        headCoulumn3.add("第三列");
        headCoulumn4.add("第四列");
        headCoulumn5.add("第五列");

        head.add(headCoulumn1);
        head.add(headCoulumn2);
        head.add(headCoulumn3);
        head.add(headCoulumn4);
        head.add(headCoulumn5);
        return head;
    }


   private List<List<Object>>  createDynamicModelList(){
       ArrayList<List<Object>> list= new ArrayList<>();
       for (int i = 0; i <100 ; i++) {
           ArrayList<Object> arrs = new ArrayList<>();
           arrs.add("字符串"+i);
           arrs.add(i+1);
           arrs.add(i);
           arrs.add("犬夜叉");
           arrs.add("微信公共号");
           list.add(arrs);
       }
     return list;
   }
}
