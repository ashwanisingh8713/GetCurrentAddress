package com.mbtechpro.getaddress;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ashwanisingh on 23/02/18.
 */

public abstract class BaseActivity extends AppCompatActivity {


    protected abstract int getLayoutResFile();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutResFile());
    }
}
