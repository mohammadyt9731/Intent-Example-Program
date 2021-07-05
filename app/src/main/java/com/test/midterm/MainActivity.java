package com.test.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    ImageButton ibBasteInternet;
    ImageButton ibCharge;
    ImageButton ibSoftware;
    ImageButton ibKhalafi;
    ImageButton ibSupport;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setOnclick();

    }

    private void findViews(){

        ibBasteInternet=findViewById(R.id.btn_baste);
        ibCharge=findViewById(R.id.btn_charge);
        ibSoftware=findViewById(R.id.btn_software);
        ibKhalafi=findViewById(R.id.btn_khalafi);
        ibSupport=findViewById(R.id.btn_support);

    }

    private void setOnclick(){

        ibBasteInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uri="https://irancell.ir/p/10059/%D8%A8%D8%B3%D8%AA%D9%87-%D9%87%D8%A7";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                startActivity(intent);

            }
        });

        ibCharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uri="https://shop.irancell.ir/fa/charge";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                startActivity(intent);
            }
        });

        ibSoftware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uri="https://cafebazaar.ir/";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                startActivity(intent);

            }
        });

        ibKhalafi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uri="https://itoll.ir/query/khalafi";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                startActivity(intent);


            }
        });

        ibSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,SupportActivity.class);
                startActivity(intent);
            }
        });


    }
}