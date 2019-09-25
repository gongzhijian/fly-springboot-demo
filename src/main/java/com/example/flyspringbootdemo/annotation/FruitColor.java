package com.example.flyspringbootdemo.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {

    /**
     * 颜色类型
     */
    enum Color{Blue,Green,Yellow};

    /**
     * 颜色属性
     * @return
     */
    Color fruitColor() default Color.Green;
}
