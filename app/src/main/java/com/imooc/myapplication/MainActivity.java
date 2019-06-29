package com.imooc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //这里是我的为了测试branch和 pull request，才加的注释，表示已经修改了代码
    }

    public void testV1(){
        String a="";
    }
}
