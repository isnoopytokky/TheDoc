package com.project.thedoc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Pariwat on 10/3/2558.
 */
public class Web_view extends Fragment{
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.web_view, container, false);

        WebView webview =  (WebView) rootview.findViewById(R.id.activity_main_webview);

        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://deafhelper.parseapp.com/get_queue");
        webview.setWebViewClient(new WebViewClient());
        return rootview;
    }

}
