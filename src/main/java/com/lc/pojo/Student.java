package com.lc.pojo;

import java.util.Date;

public class Student {
    private Integer id;
    private String name;
    private Short sex;
    private Short age;
    private String address;
    private Date createDate;
    private Date updateDate;
    private Short flag;

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

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Short getFlag() {
        return flag;
    }

    public void setFlag(Short flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "User:[" +
                "id = " + id +
                        ",name = " + name +
                        ",age = " + age +
                        ",address = " + address +
                        ",flag = " + flag +
                "]";
    }
}
