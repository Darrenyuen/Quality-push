package com.example.yuan.quality_article;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ListView;

import com.example.yuan.quality_article.adapter.CategoryAdapter;
import com.example.yuan.quality_article.base.BaseActivity;
import com.example.yuan.quality_article.bean.category.Category;
import com.example.yuan.quality_article.bean.category.Result;
import com.example.yuan.quality_article.util.HttpMethods;

import java.util.List;

import butterknife.BindView;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class CategoryActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.listView)
    ListView listView;

    private String type;
    private List<Result> resultList;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        type = intent.getStringExtra("type");
        setToolbarTitle(type);
        getCategoryData(type);
        Log.d(TAG, "onCreate: " + type);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_category;
    }

    private void setToolbarTitle(String type) {
        switch (type) {
            case "wow":
                toolbar.setTitle(R.string.wow);
                break;
            case "apps":
                toolbar.setTitle(R.string.apps);
                break;
            case "imrich":
                toolbar.setTitle(R.string.imrich);
                break;
            case "funny":
                toolbar.setTitle(R.string.funny);
                break;
            case "android":
                toolbar.setTitle(R.string.android);
                break;
            case "diediedie":
                toolbar.setTitle(R.string.diediedie);
                break;
            case "thinking":
                toolbar.setTitle(R.string.thinking);
                break;
            case "iOS":
                toolbar.setTitle(R.string.iOS);
                break;
            case "teamblog":
                toolbar.setTitle(R.string.teamblog);
                break;
        }
    }

    private void getCategoryData(String type) {
        HttpMethods.getInstance().getCategoryData(new Observer<Category>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Category category) {
                Log.d(TAG, "onNext: " + category.getError());
                resultList = category.getResults();
                Log.d(TAG, "onNext: " + resultList.size());
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                categoryAdapter = new CategoryAdapter(CategoryActivity.this, R.layout.item_category, resultList);
                listView.setAdapter(categoryAdapter);
                Log.d(TAG, "onComplete: ");
            }
        }, type);
    }
}
