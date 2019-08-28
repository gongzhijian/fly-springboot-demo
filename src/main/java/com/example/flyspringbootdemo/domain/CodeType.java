package com.example.flyspringbootdemo.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum CodeType {
    OA_GEEX_LEAVE("请假"),
    OA_GEEX_TRANSLATE("加班"),
    HR_GEEX_SALE_LEAVE("销假"),
    HR_GEEX_ZSTNJ("正式人员初始剩余年假"),
    HR_GEEX_SYTNJ("试用人员初始剩余年假"),
    HR_GEEX_XGNJ("修改年假"),
    HR_GEEX_XGTX("修改调休"),
    HR_GEEX_XGCSNJ("修改初始年假");

    private String typeName;
    CodeType(String typeName){
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public  static List<String> getValuesList(){
        ArrayList<String> arrayList = new ArrayList<>();
        for (CodeType em:CodeType.values()) {
            arrayList.add(em.toString());
        }
        return arrayList;
    }


    public  static Map<String,String> getValuesMap(){
        Map<String,String > map=new HashMap<>();
        for (CodeType em:CodeType.values()) {
            map.put(em.toString(),em.getTypeName());
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getValuesList());


    }
}
