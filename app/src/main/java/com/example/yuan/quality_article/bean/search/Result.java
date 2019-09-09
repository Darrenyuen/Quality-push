package com.example.yuan.quality_article.bean.search;

/**
 * Created by jarvis yuen
 * Date: 2019/9/9
 */
public class Result {
    /**
     *             "desc": "还在用ListView？",
     *             "ganhuo_id": "57334c9d67765903fb61c418",
     *             "publishedAt": "2016-05-12T12:04:43.857000",
     *             "readability": "",
     *             "type": "Android",
     *             "url": "http://www.jianshu.com/p/a92955be0a3e",
     *             "who": "陈宇明"
     */
    String desc;
    String ganhuo_id;
    String publishedAt;
    String readability;
    String type;
    String url;
    String who;

    public String getDesc() {
        return desc;
    }

    public String getWho() {
        return who;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getUrl() {
        return url;
    }
}
