package com.cxx.pojo;

import java.util.Date;

/**
 * @author 陈喜喜
 * @date 2022-08-01 22:58
 */
public class Student {
    private String name;
    private Date Birthday;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Birthday=" + Birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public Student(String name, Date birthday) {
        this.name = name;
        Birthday = birthday;
    }
}
