package com.example.yuan.quality_article.bean.recommend;

import java.util.List;

/**
 * Created by jarvis yuen
 * Date: 2019/9/7
 */
public class Results {
    List<SubResult> Android;
    List<SubResult> iOS;
    List<SubResult> 休息视频;
    List<SubResult> 前端;
    List<SubResult> 拓展资源;
    List<SubResult> 瞎推荐;
    List<SubResult> 福利;

    public List<SubResult> getAndroid() {
        return Android;
    }

    /**
     * 一个结果类足矣
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

    class Android {
        String _id;
        String createdAt;
        String desc;
        String publishedAt;
        String source;
        String type;
        String url;
        boolean used;
        String who;
    }

    class iOS {
        String _id;
        String createdAt;
        String desc;
        String publishedAt;
        String source;
        String type;
        String url;
        boolean used;
        String who;
    }

    class Rest {
        String _id;
        String createdAt;
        String desc;
        String publishedAt;
        String source;
        String type;
        String url;
        boolean used;
        String who;
    }

    /**
     * "_id": "5d425d1b9d2122031b7980f6",
     *                 "createdAt": "2019-08-01T03:31:39.163Z",
     *                 "desc": "Redux教程 2万字长文章 24集视频",
     *                 "publishedAt": "2019-08-01T03:32:05.7Z",
     *                 "source": "web",
     *                 "type": "前端",
     *                 "url": "https://juejin.im/post/5d3e3c42e51d45590a445c37",
     *                 "used": true,
     *                 "who": "bym"
     */

    class FrontEnd {
        String _id;
        String createdAt;
        String desc;
        String publishedAt;
        String source;
        String type;
        String url;
        boolean used;
        String who;
    }

    /**
     * "_id": "5d5cad199d2122031b798111",
     *                 "createdAt": "2019-09-06T11:04:09.774Z",
     *                 "desc": "如何使用 OpenGL 绘制贝塞尔曲线~~~",
     *                 "publishedAt": "2019-09-06T11:04:17.144Z",
     *                 "source": "web",
     *                 "type": "拓展资源",
     *                 "url": "https://mp.weixin.qq.com/s/m7BMF1dSiJ5BeHTU1etDqw",
     *                 "used": true,
     *                 "who": "潇湘剑雨"
     */

    class Expand {
        String _id;
        String createdAt;
        String desc;
        String publishedAt;
        String source;
        String type;
        String url;
        boolean used;
        String who;
    }

    /**
     * "_id": "5d647b929d2122774f0cd91f",
     *                 "createdAt": "2019-09-06T11:02:56.466Z",
     *                 "desc": "5分钟实现小姐姐喜欢的，抖音文字时钟--下",
     *                 "publishedAt": "2019-09-06T11:03:05.345Z",
     *                 "source": "web",
     *                 "type": "瞎推荐",
     *                 "url": "https://mp.weixin.qq.com/s/CKP6hrCDr6Sg_i-5-df3gA",
     *                 "used": true,
     *                 "who": "潇湘剑雨"
     */

    class Blind {
        String _id;
        String createdAt;
        String desc;
        String publishedAt;
        String source;
        String type;
        String url;
        boolean used;
        String who;
    }

    /**
     * "_id": "5ccdbc219d212239df927a93",
     *                 "createdAt": "2019-05-04T16:21:53.523Z",
     *                 "desc": "2019-05-05",
     *                 "publishedAt": "2019-05-04T16:21:59.733Z",
     *                 "source": "web",
     *                 "type": "福利",
     *                 "url": "http://ww1.sinaimg.cn/large/0065oQSqly1g2pquqlp0nj30n00yiq8u.jpg",
     *                 "used": true,
     *                 "who": "lijinshanmx"
     */
    class Welfare {
        String _id;
        String createdAt;
        String desc;
        String publishedAt;
        String source;
        String type;
        String url;
        boolean used;
        String who;
    }

}
