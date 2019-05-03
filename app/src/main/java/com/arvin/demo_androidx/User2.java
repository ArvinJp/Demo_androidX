package com.arvin.demo_androidx;

import android.util.Log;

/**
 * Date：2019/4/16 上午11:44
 * Creator：arvin
 * Des：
 */

public class User2 extends User {

    @Override
    public String getDes() {
        Log.i("","");
        return getAge()+"_____"+getName();
    }
}
