package com.arvin.demo_androidx;

import androidx.annotation.NonNull;

/**
 * Date：2019-05-05 14:32
 * Creator：arvin
 * Des：
 */

public class Test {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
