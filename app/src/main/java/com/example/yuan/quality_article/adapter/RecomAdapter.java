package com.example.yuan.quality_article.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.yuan.quality_article.R;
import com.example.yuan.quality_article.bean.category.Result;
import com.example.yuan.quality_article.bean.recommend.Results;
import com.example.yuan.quality_article.bean.recommend.SubResult;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jarvis yuen
 * Date: 2019/9/9
 */
public class RecomAdapter extends ArrayAdapter<SubResult> {
    private int resoure;
    private List<SubResult> resultsList;

    public RecomAdapter(Context context, int resource, List<SubResult> objects) {
        super(context, resource, objects);
        this.resoure = resource;
        resultsList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final SubResult result = getItem(position);
        View view = null;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resoure, parent, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.desc.setText(result.getDesc());
        viewHolder.type.setText(result.getType());
        viewHolder.publish.setText(result.getPublishedAt());
        return view;
    }

    class ViewHolder {
        @BindView(R.id.desc)
        TextView desc;
        @BindView(R.id.type)
        TextView type;
        @BindView(R.id.publish)
        TextView publish;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
