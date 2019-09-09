package com.example.yuan.quality_article.main;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.yuan.quality_article.R;
import com.example.yuan.quality_article.adapter.SearchAdapter;
import com.example.yuan.quality_article.base.BaseFragment;
import com.example.yuan.quality_article.bean.search.Result;
import com.example.yuan.quality_article.bean.search.SearchBean;
import com.example.yuan.quality_article.util.HttpMethods;

import java.util.List;

import butterknife.BindView;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by jarvis yuen
 * Date: 2019/9/3
 */
public class SearchFragment extends BaseFragment {

    @BindView(R.id.spinner)
    Spinner spinner;
    @BindView(R.id.search)
    Button button;
    @BindView(R.id.listView)
    ListView listView;

    private List<Result> resultList;

    private String category;
    private int page = 1;

    @Override
    protected int getContentView() {
        return R.layout.fragment_search;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        spinner.setAdapter(ArrayAdapter.createFromResource(getContext(), R.array.category, android.R.layout.simple_spinner_item));
        spinner.setVisibility(View.VISIBLE);
        
        loadData("all", page);
    }

    private void loadData(String category, int page) {
        Log.d(TAG, "loadData: ");
        HttpMethods.getInstance().getSearchData(new Observer<SearchBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(SearchBean searchBean) {
                resultList = searchBean.getResults();
                Log.d(TAG, "onNext: " + resultList.size());
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: ");
                listView.setAdapter(new SearchAdapter(getContext(), R.layout.item_search, resultList));
            }
        }, category, page);
    }
}
