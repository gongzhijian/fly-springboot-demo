package com.example.flyspringbootdemo.test;

/**
 * @author GEEX616
 * @create 2019-08-06 10:59
 * @desc
 **/
public class TeacherReq {

    private Integer nid;

    private String name;

    private String code;

    private Integer age;

    private String  desc;

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TeacherReq{" +
                "nid=" + nid +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                ", nid=" + nid +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", age=" + age +
                '}';
    }
}
