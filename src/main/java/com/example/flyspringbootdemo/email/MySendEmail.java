package com.example.flyspringbootdemo.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 * @author GEEX616
 * @create 2019-07-18 9:35
 * @desc
 **/
public class MySendEmail {


    public static void main(String[] agrs) throws EmailException {
        try{
            HtmlEmail email=new HtmlEmail();//创建电子邮件对象
            email.setSSL(true);
            email.setDebug(true);
            email.setHostName("SMTP.qq.com");//设置发送电子邮件使用的服务器主机名
            email.setSmtpPort(587);//设置发送电子邮件使用的邮件服务器的TCP端口地址
//            email.setAuthenticator(new DefaultAuthenticator("你的QQ邮箱号码", "你的QQ邮箱授权码，通过短信临时获取"));//邮件服务器身份验证
            email.setAuthenticator(new DefaultAuthenticator("545972892", "tkuvzmwioljtbchd"));//邮件服务器身份验证
            email.setFrom("545972892@qq.com");//设置发信人邮箱
            email.setSubject("一腔诗意喂了狗");//设置邮件主题
            email.setMsg("this is a test mali with attch");//设置邮件文本内容
            email.setMsg("this is mail with test1");
            email.addTo("1925634359@qq.com");//设置收件人
//            EmailAttachment attach =new EmailAttachment();//附件对象
//            attach.setPath("C:/temp/wenzhi.doc");//附件文件在系统中的路径
//            attach.setDescription(EmailAttachment.ATTACHMENT);
//            email.attach(attach);//添加附件
            email.send();//发送邮件
        }catch(EmailException e){
            e.printStackTrace();
        }

    }

}
