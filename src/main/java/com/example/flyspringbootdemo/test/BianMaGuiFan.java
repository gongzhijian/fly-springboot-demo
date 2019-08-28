package com.example.flyspringbootdemo.test;

import geex.gong.springbootdemo.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author GEEX616
 * @create 2019-08-16 14:58
 * @desc  编码规范
 **/
@Slf4j
public class BianMaGuiFan {

    public static void main(String[] args) {
        String req=null;
        log.info("isNull用法：result[{}]",Objects.isNull(req));
        if(!Objects.isNull(req))
            log.info("结果为null");
        else
            log.info("结果不为null");
        ArrayList<Object> list = new ArrayList<>();
        log.info("判断是否为空集合[{}]",CollectionUtils.isEmpty(list));
        User user=new User();
        user.setId(200);
        User user1=new User();
        log.info("判断是否为相同对象[{}]",Objects.equals(user,user1));
    }


}
