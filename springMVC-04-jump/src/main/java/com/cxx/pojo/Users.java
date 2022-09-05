package com.cxx.pojo;

/**
 * @author 陈喜喜
 * @date 2022-08-01 16:46
 */
public class Users {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Users() {
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
