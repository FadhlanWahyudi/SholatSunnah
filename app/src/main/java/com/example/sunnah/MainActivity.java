package com.example.sunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tahajud,witir,rawatib,dhuha,istikhoroh,tahiyyatulmasjid,syuruq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tahajud = findViewById(R.id.tahajud);
        witir = findViewById(R.id.witir);
        rawatib = findViewById(R.id.rawatib);
        dhuha = findViewById(R.id.dhuha);
        istikhoroh = findViewById(R.id.istikhoroh);
        tahiyyatulmasjid = findViewById(R.id.tahiyyatulmasjid);
        syuruq = findViewById(R.id.syuruq);

        tahajud.setOnClickListener(this);
        witir.setOnClickListener(this);
        rawatib.setOnClickListener(this);
        dhuha.setOnClickListener(this);
        istikhoroh.setOnClickListener(this);
        tahiyyatulmasjid.setOnClickListener(this);
        syuruq.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.tahajud:
                Intent tahajud = new Intent(MainActivity.this, Deskripsi.class);
                tahajud.putExtra("sunnah","https://wisatanabawi.com/sholat-tahajud/");
                startActivity(tahajud);

                break;
            case R.id.dhuha:
                Intent dhuha = new Intent(MainActivity.this, Deskripsi.class);
                dhuha.putExtra("sunnah","https://bersamadakwah.net/tata-cara-sholat-dhuha/");
                startActivity(dhuha);

                break;
            case R.id.rawatib:
                Intent rawatib = new Intent(MainActivity.this, Deskripsi.class);
                rawatib.putExtra("sunnah", "https://muslim.or.id/4602-tuntunan-shalat-sunnah-rawatib.html");
                startActivity(rawatib);

                break;
            case R.id.witir:
                Intent witir = new Intent(MainActivity.this, Deskripsi.class);
                witir.putExtra("sunnah", "https://bersamadakwah.net/sholat-witir/");
                startActivity(witir);


                break;

            case R.id.istikhoroh:
                Intent istikhoroh = new Intent(MainActivity.this, Deskripsi.class);
                istikhoroh.putExtra("sunnah", "https://bersamadakwah.net/shalat-istikharah/");
                startActivity(istikhoroh);


                break;

            case R.id.syuruq:
                Intent syuruq = new Intent(MainActivity.this, Deskripsi.class);
                syuruq.putExtra("sunnah", "http://karya-mandau.blogspot.com/2012/10/tata-lengkap-cara-shalat-isyroq.html");
                startActivity(syuruq);

                break;

            case R.id.tahiyyatulmasjid:
                Intent tahiyyatulmasjid = new Intent(MainActivity.this, Deskripsi.class);
                tahiyyatulmasjid.putExtra("sunnah", "https://muslim.or.id/18829-shalat-tahiyatul-masjid.html");
                startActivity(tahiyyatulmasjid);
                break;


                 

        }

    }
}
