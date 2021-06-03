package com.example.ngotrungkien_74458;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView buc1,buc2,buc3,buc4,buc5,buc6;
    private TextView hop1,hop2,hop3,hop4,hop5,hop6,hop7,hop8,hop9,hop10,hop11;
    public static int dem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.registerandControlEvents();
    }

    @Override
    protected void onStop() {
        Toast.makeText(MainActivity.this,"Tong gia tri chan trong mang la: "+TienIch.Tong_GT_Chan(),Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    private void registerandControlEvents(){
        this.buc1 = (TextView)findViewById(R.id.buc1);
        this.buc2 = (TextView)findViewById(R.id.buc2);
        this.buc3 = (TextView)findViewById(R.id.buc3);
        this.buc4 = (TextView)findViewById(R.id.buc4);
        this.buc5 = (TextView)findViewById(R.id.buc5);
        this.buc6 = (TextView)findViewById(R.id.buc6);
        this.hop1 = (TextView)findViewById(R.id.hop1);
        this.hop2 = (TextView)findViewById(R.id.hop2);
        this.hop3 = (TextView)findViewById(R.id.hop3);
        this.hop4 = (TextView)findViewById(R.id.hop4);
        this.hop5 = (TextView)findViewById(R.id.hop5);
        this.hop6 = (TextView)findViewById(R.id.hop6);
        this.hop7 = (TextView)findViewById(R.id.hop7);
        this.hop8 = (TextView)findViewById(R.id.hop8);
        this.hop9 = (TextView)findViewById(R.id.hop9);
        this.hop10 = (TextView)findViewById(R.id.hop10);
        this.hop11 = (TextView)findViewById(R.id.hop11);
    }
    public void cotClick(View view){
        dem++;
        switch (dem) {
            case 1:
                hop1.setVisibility(View.INVISIBLE);
                hop2.setVisibility(View.VISIBLE);
                break;
            case 2:
                hop2.setVisibility(View.INVISIBLE);
                hop3.setVisibility(View.VISIBLE);
                break;
            case 3:
                hop3.setVisibility(View.INVISIBLE);
                hop4.setVisibility(View.VISIBLE);
                break;
            case 4:
                hop4.setVisibility(View.INVISIBLE);
                hop5.setVisibility(View.VISIBLE);
                break;
            case 5:
                hop5.setVisibility(View.INVISIBLE);
                hop6.setVisibility(View.VISIBLE);
                break;
            case 6:
                hop11.setVisibility(View.VISIBLE);
                hop6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                hop11.setVisibility(View.INVISIBLE);
                hop10.setVisibility(View.VISIBLE);
                break;
            case 8:
                hop10.setVisibility(View.INVISIBLE);
                hop9.setVisibility(View.VISIBLE);
                break;
            case 9:
                hop9.setVisibility(View.INVISIBLE);
                hop8.setVisibility(View.VISIBLE);
                break;
            case 10:
                hop8.setVisibility(View.INVISIBLE);
                hop7.setVisibility(View.VISIBLE);
                break;

        }
        if(dem>10) dem = 10;
        TienIch.Push(TienIch.Random());

        DateTimeFormatter second = DateTimeFormatter.ofPattern("ss");
        LocalDateTime now = LocalDateTime.now();
        if(TienIch.KTChanLe(Integer.parseInt(second.format(now)))){
            hop1.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));
            hop2.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));
            hop3.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));
            hop4.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));
            hop5.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));
            hop6.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));
            hop7.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));
            hop8.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));
            hop9.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));
            hop10.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));
            hop11.setBackgroundColor(Color.argb(255,TienIch.Random(),TienIch.Random(),TienIch.Random()));

        }
        else{
            hop1.setAlpha(TienIch.Random());
            hop2.setAlpha(TienIch.Random());
            hop3.setAlpha(TienIch.Random());
            hop4.setAlpha(TienIch.Random());
            hop5.setAlpha(TienIch.Random());
            hop6.setAlpha(TienIch.Random());
            hop7.setAlpha(TienIch.Random());
            hop8.setAlpha(TienIch.Random());
            hop9.setAlpha(TienIch.Random());
            hop10.setAlpha(TienIch.Random());
            hop11.setAlpha(TienIch.Random());
        }
    }
    public void bucClick(View view) {
        dem--;
        switch (dem) {
            case 9:
                hop7.setVisibility(View.INVISIBLE);
                hop8.setVisibility(View.VISIBLE);
                break;
            case 8:
                hop8.setVisibility(View.INVISIBLE);
                hop9.setVisibility(View.VISIBLE);
                break;
            case 7:
                hop9.setVisibility(View.INVISIBLE);
                hop10.setVisibility(View.VISIBLE);
                break;
            case 6:
                hop10.setVisibility(View.INVISIBLE);
                hop11.setVisibility(View.VISIBLE);
                break;
            case 5:
                hop11.setVisibility(View.INVISIBLE);
                hop6.setVisibility(View.VISIBLE);
                break;
            case 4:
                hop6.setVisibility(View.INVISIBLE);
                hop5.setVisibility(View.VISIBLE);
                break;
            case 3:
                hop5.setVisibility(View.INVISIBLE);
                hop4.setVisibility(View.VISIBLE);
                break;
            case 2:
                hop4.setVisibility(View.INVISIBLE);
                hop3.setVisibility(View.VISIBLE);
                break;
            case 1:
                hop3.setVisibility(View.INVISIBLE);
                hop2.setVisibility(View.VISIBLE);
                break;
            case 0:
                hop2.setVisibility(View.INVISIBLE);
                hop1.setVisibility(View.VISIBLE);
                break;
        }
        if(dem<0) dem = 0;
    }
}