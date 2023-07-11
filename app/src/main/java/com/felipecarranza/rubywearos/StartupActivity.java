package com.felipecarranza.rubywearos;

import android.os.Bundle;

public class StartupActivity extends MainActivity {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
    }
}
