package com.erkin.listetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    private int detayPozisyon;
    private String[] webLinkleri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = (WebView) findViewById(R.id.detayWebView);

        webLinkleri = new String[] {"https://www.youtube.com/watch?v=c35cZ-IZAfY", "https://www.youtube.com/watch?v=QdX2_gwbVmo\",", "https://www.youtube.com/watch?v=v_RYmS0zWhc"};

        detayPozisyon = getIntent().getIntExtra("pozisyon", -1);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl(webLinkleri[detayPozisyon]);

    }
}
