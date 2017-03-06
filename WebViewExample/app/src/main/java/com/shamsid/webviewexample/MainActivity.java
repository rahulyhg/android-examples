package com.shamsid.webviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
  WebView browser;

  @Override protected void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    setContentView (R.layout.activity_main);
    browser = (WebView) findViewById (R.id.webkit);

    browser.setWebViewClient (new Callback ());
    browser.getSettings ().setJavaScriptEnabled (true);

    loadUrl ();
  }

  private void loadUrl () {
    browser.loadUrl ("http://jupyter.readthedocs.io/en/latest/install.html");
  }

  private class Callback extends WebViewClient {
    @Override public boolean shouldOverrideUrlLoading (WebView view, String url) {
      loadUrl ();
      return (true);
    }
  }
}






