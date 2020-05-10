package com.app.newslinkapp;

import android.net.http.SslError;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
//        progDailog.show();
        view.loadUrl(url);

        return true;
    }

    @Override
    public void onReceivedSslError(WebView view, SslErrorHandler handler,
                                   SslError error) {
        handler.proceed();
    }
    @Override
    public void onPageFinished(WebView view, final String url) {
//        progDailog.dismiss();
    }
}
