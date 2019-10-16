package com.example.sunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Deskripsi extends AppCompatActivity {

    WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        WebView = findViewById(R.id.WebView);

        Intent deskripsi = getIntent();
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        String link = deskripsi.getStringExtra("sunnah");

        // agar javascripts nya bisa terbaca
        WebView.getSettings().setJavaScriptEnabled(true);
        // agar gambarnya automatis di masukkan
        WebView.getSettings().setLoadsImagesAutomatically(true);
        // untuk memasukkan linknya
        WebView.loadUrl(link);

    }
}
