package me.aflak.arduinousbchat.ui.view;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import me.aflak.arduinousbchat.R;

public class webpiew extends AppCompatActivity {
    private  WebView view;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webpiew);
        view = (WebView) this.findViewById(R.id.webpiew_id);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("http://teknojurnal.com");
    }
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    //public boolean onKeyDown(int keyCode, KeyListener event) {
        //ketika disentuh tombol back
       // if ((keyCode == KeyEvent.KEYCODE_BACK) && view.canGoBack()) {
          //  if (view.canGoBack()) {
          //      view.goBack(); //method goback(),untuk kembali ke halaman sebelumnya
          //      return true;
          //  }
       // }
        // Jika tidak ada halaman yang pernah dibuka
        // maka akan keluar dari activity (tutup aplikasi)
       // return super.onKeyDown(keyCode, event);
   // }

}
