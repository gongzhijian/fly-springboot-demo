package com.example.flyspringbootdemo.test;

/**
 * @author GEEX616
 * @create 2019-08-06 10:57
 * @desc
 **/
public class StudentReq {

    private Integer nid;

    private String name;

    private String code;

    private Integer age;

    private String book;


    public StudentReq(Integer nid, String name, String code, Integer age) {
        this.nid = nid;
        this.name = name;
        this.code = code;
        this.age = age;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public StudentReq() {
    }

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

    @Override
    public String toString() {
        return "StudentReq{" +
                "nid=" + nid +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", age=" + age +
                ", book='" + book + '\'' +
                '}';
    }
}
