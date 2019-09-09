package com.example.yuan.quality_article.bean.recommend;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jarvis yuen
 * Date: 2019/9/3
 */
public class RecommendBean {
    ArrayList<String> category;
    boolean error;
    Results results;

    public ArrayList<String> getCategory() {
        return category;
    }

    public boolean isError() {
        return error;
    }

    public Results getResults() {
        return results;
    }
}
