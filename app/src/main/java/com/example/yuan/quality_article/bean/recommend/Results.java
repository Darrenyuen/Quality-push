package com.example.yuan.quality_article.bean.recommend;

import java.util.LinkedList;
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

    List<SubResult> all;

    public List<SubResult> getAll() {
        all = new LinkedList<>();
        add(Android);
        add(iOS);
        add(休息视频);
        add(前端);
        add(拓展资源);
        add(瞎推荐);
        add(福利);
        return all;
    }

    public void add(List<SubResult> subResultList) {
        for (int i=0; i<subResultList.size(); i++)
            all.add(subResultList.get(i));
    }
}
