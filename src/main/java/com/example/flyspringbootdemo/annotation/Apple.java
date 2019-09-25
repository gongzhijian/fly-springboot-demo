package com.example.flyspringbootdemo.annotation;

import lombok.Data;

/**
 * @author GEEX616
 * @create 2019-09-25 15:12
 * @desc
 **/
@Data
public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor = FruitColor.Color.Green)
    private String appleColor;

    @FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
    private String appleProvider;



    public static void main(String[] args) {
        FruitInfoUtil.getFruitInfo(Apple.class);
    }
}
