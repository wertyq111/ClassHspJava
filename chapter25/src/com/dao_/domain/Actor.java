package com.dao_.domain;

import java.util.Date;

/**
 * @author zhouxufeng
 * @version 1.0
 * Actor 对象和 actor 表的记录对应,映射
 */
@SuppressWarnings({"all"})
public class Actor { //Javabean, POJO, Domain 对象
    private Integer id;
    private String name;
    private String sex;
    private Date bornDate;
    private Integer phone;

    public Actor() { //一定要给一个无参构造器, 隐射需要
    }

    public Actor(Integer id, String name, String sex, Date bornDate, Integer phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.bornDate = bornDate;
        this.phone = phone;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", bornDate=" + bornDate +
                ", phone=" + phone +
                '}';
    }
}
