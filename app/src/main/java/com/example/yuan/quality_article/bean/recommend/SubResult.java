package com.example.yuan.quality_article.bean.recommend;

/**
 * Created by jarvis yuen
 * Date: 2019/9/9
 */
public class SubResult {
    /**
     * 一个数据类足矣
     *                "_id": "5d0bb09b9d21220321462135",
     *                 "createdAt": "2019-06-20T16:13:15.457Z",
     *                 "desc": "全网最全的 React Native 和 Flutter 的分析对比",
     *                 "publishedAt": "2019-07-26T08:00:44.245Z",
     *                 "source": "web",
     *                 "type": "前端",
     *                 "url": "https://juejin.im/post/5d0bac156fb9a07ec56e7f15",
     *                 "used": true,
     *                 "who": "bym"
     */

    String _id;
    String A;
    String desc;
    String publishedAt;
    String source;
    String type;
    String url;
    boolean used;
    String who;

    public String getDesc() {
        return desc;
    }

    public String getType() {
        return type;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getUrl() {
        return url;
    }
}
