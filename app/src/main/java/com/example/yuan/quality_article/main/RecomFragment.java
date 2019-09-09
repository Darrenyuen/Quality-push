package com.example.yuan.quality_article.main;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.yuan.quality_article.R;
import com.example.yuan.quality_article.RecomContentActivity;
import com.example.yuan.quality_article.adapter.RecomAdapter;
import com.example.yuan.quality_article.base.BaseFragment;
import com.example.yuan.quality_article.bean.recommend.RecommendBean;
import com.example.yuan.quality_article.bean.recommend.Results;
import com.example.yuan.quality_article.bean.recommend.SubResult;
import com.example.yuan.quality_article.util.HttpMethods;

import java.util.List;

import butterknife.BindView;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by jarvis yuen
 * Date: 2019/9/3
 */
public class RecomFragment extends BaseFragment {

    @BindView(R.id.listView)
    ListView listView;

    private Results results;
    private List<SubResult> subResultList;

    @Override
    protected int getContentView() {
        return R.layout.fragment_recom;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        HttpMethods.getInstance().getRecommendData(new Observer<RecommendBean>() {
            @Override
            public void onSubscribe(Disposable d) {
                
            }

            @Override
            public void onNext(RecommendBean recommendBean) {
                Log.d(TAG, "onNext: " + recommendBean.getCategory().size() + " " + recommendBean.isError());
                results = recommendBean.getResults();
                subResultList = results.getAndroid();
                Log.d(TAG, "onNext: " + results.getAndroid().size());
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                listView.setAdapter(new RecomAdapter(getContext(), R.layout.item_recom, subResultList));
                Log.d(TAG, "onComplete: ");
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), RecomContentActivity.class);
                intent.putExtra("url", subResultList.get(position).getUrl());
                Log.d(TAG, "onItemClick: " + subResultList.get(position).getUrl());
                startActivity(intent);
            }
        });
    }
}
