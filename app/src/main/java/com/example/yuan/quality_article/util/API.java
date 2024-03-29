package com.example.yuan.quality_article.util;

import com.example.yuan.quality_article.bean.categories.Categories;
import com.example.yuan.quality_article.bean.category.Category;
import com.example.yuan.quality_article.bean.recommend.RecommendBean;
import com.example.yuan.quality_article.bean.search.SearchBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jarvis yuen
 * Date: 2019/9/3
 */
public interface API {
    @GET("today")
    Observable<RecommendBean> getRecommendData();

    @GET("search/query/listview/category/{category}/count/10/page/{page}")
    Observable<SearchBean> getSearchData(@Path("category") String category, @Path("page") int page);

    @GET("xiandu/categories")
    Observable<Categories> getCategoriesData();

    @GET("xiandu/category/{type}")
    Observable<Category> getCategoryData(@Path("type") String type);
}
