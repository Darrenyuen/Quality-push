package com.example.yuan.quality_article.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.yuan.quality_article.R;
import com.example.yuan.quality_article.CategoryActivity;
import com.example.yuan.quality_article.adapter.FreeReadAdapter;
import com.example.yuan.quality_article.base.BaseFragment;
import com.example.yuan.quality_article.bean.categories.Categories;
import com.example.yuan.quality_article.bean.categories.Result;
import com.example.yuan.quality_article.bean.category.Category;
import com.example.yuan.quality_article.util.HttpMethods;

import java.util.List;

import butterknife.BindView;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by jarvis yuen
 * Date: 2019/9/3
 */
public class FreeReadFragment extends BaseFragment {
    @BindView(R.id.listView)
    ListView listView;

    private List<Result> resultList;
    private FreeReadAdapter freeReadAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    protected int getContentView() {
        return R.layout.fragment_freeread;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        HttpMethods.getInstance().getCategoriesData(new Observer<Categories>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Categories categories) {
                Log.d(TAG, "onNext: " + categories.getError());
                Log.d(TAG, "onNext: " + categories.getResultList().size());
                resultList = categories.getResultList();
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                freeReadAdapter = new FreeReadAdapter(getContext(), R.layout.item_categories, resultList);
                listView.setAdapter(freeReadAdapter);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                Result result = resultList.get(position);
                switch (result.getEn_name()) {
                    case "wow":
                        intent = new Intent(getContext(), CategoryActivity.class);
                        intent.putExtra("type", "wow");
                        startActivity(intent);
                        break;
                    case "apps":
                        intent = new Intent(getContext(), CategoryActivity.class);
                        intent.putExtra("type", "apps");
                        startActivity(intent);
                        break;
                    case "imrich":
                        intent = new Intent(getContext(), CategoryActivity.class);
                        intent.putExtra("type", "imrich");
                        startActivity(intent);
                        break;
                    case "funny":
                        intent = new Intent(getContext(), CategoryActivity.class);
                        intent.putExtra("type", "funny");
                        startActivity(intent);
                        break;
                    case "android":
                        intent = new Intent(getContext(), CategoryActivity.class);
                        intent.putExtra("type", "android");
                        startActivity(intent);
                        break;
                    case "diediedie":
                        intent = new Intent(getContext(), CategoryActivity.class);
                        intent.putExtra("type", "diediedie");
                        startActivity(intent);
                        break;
                    case "thinking":
                        intent = new Intent(getContext(), CategoryActivity.class);
                        intent.putExtra("type", "thinking");
                        startActivity(intent);
                        break;
                    case "iOS":
                        intent = new Intent(getContext(), CategoryActivity.class);
                        intent.putExtra("type", "iOS");
                        startActivity(intent);
                        break;
                    case "teamblog":
                        intent = new Intent(getContext(), CategoryActivity.class);
                        intent.putExtra("type", "teamblog");
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
