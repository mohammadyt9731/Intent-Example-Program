package com.test.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SupportActivity extends AppCompatActivity {

    Button btnSms;
    Button btnEmail;
    Button btnCall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        findViews();
        setOnclick();

    }

    private void findViews(){

        btnSms=findViewById(R.id.btn_sms);
        btnEmail=findViewById(R.id.btn_email);
        btnCall=findViewById(R.id.btn_call);

    }

    private void setOnclick(){

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri=Uri.parse("sms:09151234567");
                Intent intent=new Intent(Intent.ACTION_SENDTO,uri);
                startActivity(intent);

            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"exampleEmail@gmail.com"});
                startActivity(intent);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri=Uri.parse("tel:"+"09151234567");
                Intent intent=new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);

            }
        });


    }
}