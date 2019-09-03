package com.example.yuan.quality_article.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuan.quality_article.base.BaseActivity;

import butterknife.ButterKnife;

/**
 * Created by jarvis yuen
 * Date: 2019/9/3
 */
public abstract class BaseFragment extends Fragment {
    public String TAG = this.getClass().getSimpleName();

    protected BaseActivity baseActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        baseActivity = (BaseActivity) getActivity();
        Log.d(TAG, "onCreate: ");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getContentView(), container, false);
        ButterKnife.bind(this, view);
        init(savedInstanceState);
        return view;
    }

    protected abstract int getContentView();

    protected abstract void init(Bundle savedInstanceState);
}
