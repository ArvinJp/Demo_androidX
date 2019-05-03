package com.arvin.demo_androidx;

/**
 * Date：2019/4/16 上午11:43
 * Creator：arvin
 * Des：
 */

public class User {
    private String name;
    private int age;

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

    public String getDes()
    {
        return name+"____"+age;
    }
}
