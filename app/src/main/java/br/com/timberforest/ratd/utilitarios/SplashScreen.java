package br.com.timberforest.ratd.utilitarios;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.webkit.WebView;

import br.com.timberforest.ratd.R;
import br.com.timberforest.ratd.dashboards.MainActivity;

public class SplashScreen extends Activity {

    WebView webView;
    private static int SPLASH_TIME_OUT = 2500;
    private String animacao = "file:///android_asset/animacao.html";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash_screen);

        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl(animacao);

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
