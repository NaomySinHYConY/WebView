package com.example.webmemorama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView wv1;
    Button btn1, btn2, btn3, btn4;
    int contador = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv1 = findViewById(R.id.wv1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setVerticalScrollBarEnabled(true);
        wv1.loadUrl("http://serviciosdigitalesplus.com/cartas/");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click1(view);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click2(view);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click3(view);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click4(view);
            }
        });
    }

    public void click1(View v){
        wv1.loadUrl("https://www.msn.com/es-ar/noticias/tecnologia/hotmail");
    }

    public void click2(View v){
        wv1.loadUrl("https://www.google.com.mx/");
    }

    public void click3(View v){
        contador--;
        if(contador<1){
            contador = 1;
        }
        wv1.loadUrl("https://www.liverpool.com.mx/tienda/page-"+ contador +"?s=reloj");
    }

    public void click4(View v){
        contador++;
        wv1.loadUrl("https://www.liverpool.com.mx/tienda/page-"+ contador +"?s=reloj");
    }
}