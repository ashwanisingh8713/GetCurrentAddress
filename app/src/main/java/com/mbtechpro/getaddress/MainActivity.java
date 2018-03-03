package com.mbtechpro.getaddress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mbtechpro.callbacks.AppLocationListener;

public class MainActivity extends AppLocationActivity {

    private Button mFetchAddressBtn;
    private TextView mAddressTxt;

    @Override
    protected int getLayoutResFile() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mFetchAddressBtn = findViewById(R.id.getCurrAddressBtn);
        mAddressTxt = findViewById(R.id.addressTxt);


        mFetchAddressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getLocation(new AppLocationListener() {
                    @Override
                    public void locationReceived(String maxAddress, String pin, String state, String city, String subCity, String countryCode) {
                        mAddressTxt.setText(maxAddress);
                    }

                    @Override
                    public void locationFailed() {
                        mAddressTxt.setText("Failed");
                    }
                });
            }
        });
    }
}
