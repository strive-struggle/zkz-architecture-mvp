package com.zkz.architecture.mvp.model.entity;

/**
 * 用户信息实体类
 * Created by Zhangkui on 2017/9/30.
 */
public class UserInfo {

    private String name;
    private String pwd;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
