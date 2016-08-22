package com.example.xzf.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    public static final int F_A = 0;
    public static final int F_B = 0;
    public static final int F_C = 0;
    public static final int F_D = 0;


    private int abc = 0;
    private String mName;

    public String getmName() {
        return mName;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A();
        A();
        debug2("");
        if (abc == 0) {

        }

        mName = "";
        

        if (abc == 0) {
            abc();
        }
    }

    public MainActivity() {
        super();
    }

    private void abc() {
        int a = 1;
        int b = 2;
        int c = 3;
    }

    private void debug2(String s) {
    }

    public void A() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            System.out.print(i);
        }
    }


}
