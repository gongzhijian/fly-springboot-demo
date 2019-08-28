package com.example.flyspringbootdemo.easyexcle;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import java.util.Date;

/**
 * @author GEEX616
 * @create 2019-08-06 11:54
 * @desc
 **/
public class ImportInfo extends BaseRowModel {
    private Integer id;
    @ExcelProperty(value = "姓名",index = 0)
    private String name;
    @ExcelProperty(value = "年龄",index =1)
    private Integer age;
    @ExcelProperty(value = "邮箱",index = 2)
    private String email;
    @ExcelProperty(value = "创建时间",format = "yyyy/MM/dd",index = 3)
    private Date createTime;

    @ExcelProperty(value = "门店名称",index = 4)
    private String cStoreCode;

    /**
     * 工商名称
     */
    @ExcelProperty(value = "工商名称",index = 5)
    private String cIcName;

    /**
     * 工商类型
     */
    @ExcelProperty(value = "工商类型",index = 6)
    private String cIcType;

    /**
     * 统一社会代码
     */
    @ExcelProperty(value = "社会统一代码",index = 7)
    private String cGbCode;

    /**
     *工商注册号
     */
    @ExcelProperty(value = "工商注册号",index = 8)
    private String cBrNo;

    /**
     *组织机构代码
     */
    @ExcelProperty(value = "组织机构代码",index = 9)
    private String cOrCode;

    /**
     * 税务登记证号
     */
    @ExcelProperty(value = "税务登记证号",index = 10)
    private String cTrNo;

    /**
     * 开户许可核准号
     */
    @ExcelProperty(value = "开户许可核准号",index = 11)
    private String cApNo;

    /**
     * 经营时间
     */
    @ExcelProperty(value = "经营时间",index = 12,format = "yyyy/MM/dd")
    private Integer nBusTime;

    /**
     * 经营开始时间
     */
    @ExcelProperty(value = "经营开始时间",index = 13,format = "yyyy/MM/dd")
    private Date dBusStartDate;

    /**
     * 经营结束时间
     */
    @ExcelProperty(value = "经营结束时间",index = 14,format = "yyyy/MM/dd")
    private Date dBusEndDate;

    /**
     * 注册资本
     */
    @ExcelProperty(value = "注册资本",index = 15)
    private String cRegisterCapital;

    /**
     * 注册地址
     */
    @ExcelProperty(value = "注册地址",index = 16)
    private String cRegisterAdd;

    /**
     * 股东背景
     */
    @ExcelProperty(value = "股东背景",index = 17)
    private String cShareholders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public String getcStoreCode() {
        return cStoreCode;
    }

    public void setcStoreCode(String cStoreCode) {
        this.cStoreCode = cStoreCode;
    }

    public String getcIcName() {
        return cIcName;
    }

    public void setcIcName(String cIcName) {
        this.cIcName = cIcName;
    }

    public String getcIcType() {
        return cIcType;
    }

    public void setcIcType(String cIcType) {
        this.cIcType = cIcType;
    }

    public String getcGbCode() {
        return cGbCode;
    }

    public void setcGbCode(String cGbCode) {
        this.cGbCode = cGbCode;
    }

    public String getcBrNo() {
        return cBrNo;
    }

    public void setcBrNo(String cBrNo) {
        this.cBrNo = cBrNo;
    }

    public String getcOrCode() {
        return cOrCode;
    }

    public void setcOrCode(String cOrCode) {
        this.cOrCode = cOrCode;
    }

    public String getcTrNo() {
        return cTrNo;
    }

    public void setcTrNo(String cTrNo) {
        this.cTrNo = cTrNo;
    }

    public String getcApNo() {
        return cApNo;
    }

    public void setcApNo(String cApNo) {
        this.cApNo = cApNo;
    }

    public Integer getnBusTime() {
        return nBusTime;
    }

    public void setnBusTime(Integer nBusTime) {
        this.nBusTime = nBusTime;
    }

    public Date getdBusStartDate() {
        return dBusStartDate;
    }

    public void setdBusStartDate(Date dBusStartDate) {
        this.dBusStartDate = dBusStartDate;
    }

    public Date getdBusEndDate() {
        return dBusEndDate;
    }

    public void setdBusEndDate(Date dBusEndDate) {
        this.dBusEndDate = dBusEndDate;
    }

    public String getcRegisterCapital() {
        return cRegisterCapital;
    }

    public void setcRegisterCapital(String cRegisterCapital) {
        this.cRegisterCapital = cRegisterCapital;
    }

    public String getcRegisterAdd() {
        return cRegisterAdd;
    }

    public void setcRegisterAdd(String cRegisterAdd) {
        this.cRegisterAdd = cRegisterAdd;
    }

    public String getcShareholders() {
        return cShareholders;
    }

    public void setcShareholders(String cShareholders) {
        this.cShareholders = cShareholders;
    }

    @Override
    public String toString() {
        return "ImportInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", cStoreCode='" + cStoreCode + '\'' +
                ", cIcName='" + cIcName + '\'' +
                ", cIcType='" + cIcType + '\'' +
                ", cGbCode='" + cGbCode + '\'' +
                ", cBrNo='" + cBrNo + '\'' +
                ", cOrCode='" + cOrCode + '\'' +
                ", cTrNo='" + cTrNo + '\'' +
                ", cApNo='" + cApNo + '\'' +
                ", nBusTime=" + nBusTime +
                ", dBusStartDate=" + dBusStartDate +
                ", dBusEndDate=" + dBusEndDate +
                ", cRegisterCapital='" + cRegisterCapital + '\'' +
                ", cRegisterAdd='" + cRegisterAdd + '\'' +
                ", cShareholders='" + cShareholders + '\'' +
                '}';
    }
}
