package com.example.flyspringbootdemo.test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmumDemo {


    /*public enum  MyEmumDemo{
    BASKETBALL("Basketball is one of the most popular sports around the world."),
    SOCCOR("SOCCOR is not the same in England and America."),
    PINGPONG("PingPong is the best sports items in China.");

    private String description;

    private MyEmumDemo(String description){
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    }


    public enum  Gender {

        MAN(0, "男性"), WOMAN(1, "女性"), UNKNOWN(2, "不明");

        private int code;

        private String msg;

        private Gender(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }

    public static void main(String[] args) {
        MyEmumDemo emumDemo = MyEmumDemo.valueOf("BASKETBALL");
        log.info("emumDemo:[{}]",emumDemo.description);
        Gender man = EnumUtils.getEnum(Gender.class, "MAN");
        log.info("返回值为：{}",man.msg);
        List<Gender> enumList = EnumUtils.getEnumList(Gender.class);
        log.info("返回值为：{}",enumList);
        Map<String, Gender> enumMap = EnumUtils.getEnumMap(Gender.class);
        log.info("是否包含：{}",enumMap.get("MAN"));
        boolean flag = EnumUtils.isValidEnum(Gender.class, "MAN");
        log.info("是否包含此枚举对象：{}",flag);


        for (int i = 0; i <5 ; i++) {
            get(i);

        }
    }

   static    void get(int i){
       System.out.println("i"+i+"|start");
        if(i==2){
            return;
        }
       System.out.println("i"+i+"|stop");
    }

*/

}

