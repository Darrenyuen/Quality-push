package com.example.yuan.quality_article.bean.categories;

/**
 * Created by jarvis yuen
 * Date: 2019/9/3
 */
public class Result {
    String _id;
    String en_name;
    String name;
    int rank;

    public Result(String _id, String en_name, String name, int rank) {
        super();
        this._id = _id;
        this.en_name = en_name;
        this.name = name;
        this.rank = rank;
    }

    public String get_id() {
        return _id;
    }

    public String getEn_name() {
        return en_name;
    }

    public String getName() {
        return name;
    }

    public int getLank() {
        return rank;
    }
}
