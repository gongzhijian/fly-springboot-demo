package com.example.flyspringbootdemo.test;

/**
 * @author GEEX616
 * @create 2019-08-05 13:26
 * @desc
 **/
public class Deo {

    public static void main(String[] args) {
       /* String[] arr={"a","b","c"};
        Object[] arr2=null;
        LinkedList arrList = new LinkedList();
        for (int i = 0; i <arr.length ; i++) {
            if("a".equals(arr[i])){

            }else {
                arrList.add(arr[i]);
            }
        }
        System.out.println(arrList);*/
       /* String b="b";
        String a=b+"c";*/
       StringBuilder sb=new StringBuilder("b");
       String a=sb.append("c").toString();

    }
}
