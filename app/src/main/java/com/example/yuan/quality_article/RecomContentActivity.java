package com.example.yuan.quality_article;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.yuan.quality_article.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by jarvis yuen
 * Date: 2019/9/9
 */
public class RecomContentActivity extends BaseActivity {
    @BindView(R.id.webView)
    WebView webView;

    private String url;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_recom_content;
    }

}
