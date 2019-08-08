package com.example.social_media;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void web1(View view){

        Intent intent=new Intent(MainActivity.this,Web1Activity.class);





    }
    public void web2(View view){
        Intent intent=new Intent(MainActivity.this,Web2Activity.class);




    }
    public void web3(View view){
        Intent intent=new Intent(MainActivity.this,Web3Activity.class);




    }
    public void web4(View view){
        Intent intent=new Intent(MainActivity.this,Web3Activity.class);




    }

}