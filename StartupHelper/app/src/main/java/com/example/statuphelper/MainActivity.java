package com.example.statuphelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*상권 분석 버튼*/
        Button marketButton = findViewById(R.id.market_button);
        marketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 상권분석 Intent
                Intent market_intent = new Intent(getApplicationContext(),MarketActivity.class);
                startActivity(market_intent);
            }
        });

        /*우수 프랜차이즈 버튼*/
        Button franchiseButton = findViewById(R.id.franchise_button);
        franchiseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 우수프랜차이즈 Intent
                Intent franchise_intent = new Intent(getApplicationContext(), FranchiseActivity.class);
                startActivity(franchise_intent);
            }
        });

        /*창업 비용 안내 버튼*/
        Button startupcostButton = findViewById(R.id.startupcost_button);
        startupcostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 창업비용안내 Intent
                Intent startupcost_intent = new Intent(getApplicationContext(), StartupCostActivity.class);
                startActivity(startupcost_intent);
            }
        });

        /*부동산 매물 검색 버튼*/
        Button realtyButton = findViewById(R.id.realty_button);
        realtyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 부동산 매물 검색 Intent
                Intent realty_intent = new Intent(getApplicationContext(), RealtyActivity.class);
                startActivity(realty_intent);
            }
        });
    }
    /*창업 안내 포털 사이트 이동*/
    public void onClick_supporting(View v) {
        // 창업 안내 포털 사이트 이동 Intent
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.k-startup.go.kr/main.do"));
        startActivity(intent);
    }
}