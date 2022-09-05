package com.cxx.controller.pojo;

/**
 * @author 陈喜喜
 * @date 2022-07-31 22:38
 */
public class Users {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Users() {
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
