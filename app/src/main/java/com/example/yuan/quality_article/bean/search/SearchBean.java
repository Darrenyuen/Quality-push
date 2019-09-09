package com.example.yuan.quality_article.bean.search;

import java.util.List;

/**
 * Created by jarvis yuen
 * Date: 2019/9/3
 */
public class SearchBean {
    int count;
    boolean error;
    List<Result> results;

    public boolean isError() {
        return error;
    }

    public List<Result> getResults() {
        return results;
    }
}
