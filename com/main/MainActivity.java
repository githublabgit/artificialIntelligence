package com.main;

public class MainActivity extends android.app.Activity   
{
    @Override  
    public void onCreate(final android.os.Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        final var webView = new android.webkit.WebView(this);
        webView.loadUrl("file:///android_asset/index.html");
        super.setContentView(webView);
    }  
}
