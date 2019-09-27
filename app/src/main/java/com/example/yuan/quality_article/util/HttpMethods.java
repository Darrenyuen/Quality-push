package com.example.yuan.quality_article.util;

import com.example.yuan.quality_article.bean.categories.Categories;
import com.example.yuan.quality_article.bean.category.Category;
import com.example.yuan.quality_article.bean.recommend.RecommendBean;
import com.example.yuan.quality_article.bean.search.SearchBean;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jarvis yuen
 * Date: 2019/9/3
 */
public class HttpMethods {

    private final String BASE_URL = "http://gank.io/api/";
    private final long TIMEOUT = 5;

    private API api;

    private static final HttpMethods ourInstance = new HttpMethods();

    public static HttpMethods getInstance() {
        return ourInstance;
    }

    private HttpMethods() {
        OkHttpClient.Builder client = new OkHttpClient.Builder();
        client.connectTimeout(TIMEOUT, TimeUnit.SECONDS);

        Retrofit retrofit = new Retrofit.Builder()
                .client(client.build())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        api = retrofit.create(API.class);
    }

    public void getRecommendData(Observer<RecommendBean> observer) {
        api.getRecommendData()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getSearchData(Observer<SearchBean> observer, String category, int page) {
        api.getSearchData(category, page)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getCategoriesData(Observer<Categories> observer) {
        api.getCategoriesData()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void getCategoryData(Observer<Category> observer, String type) {
        api.getCategoryData(type)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
