package br.com.timberforest.ratd.utilitarios;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.facebook.drawee.backends.pipeline.Fresco;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dashboards.MainActivity;

public class SplashScreen extends AppCompatActivity {

    WebView webView;
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("file:///android_asset/animacao.html");

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
