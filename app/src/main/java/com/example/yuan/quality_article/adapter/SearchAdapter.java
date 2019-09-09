package com.example.yuan.quality_article.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.yuan.quality_article.R;
import com.example.yuan.quality_article.bean.search.Result;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jarvis yuen
 * Date: 2019/9/9
 */
public class SearchAdapter extends ArrayAdapter<Result> {
    private int source;
    private List<Result> resultList;

    public SearchAdapter(Context context, int resource, List<Result> objects) {
        super(context, resource, objects);
        this.source = resource;
        this.resultList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Result result = getItem(position);
        View view = null;
        ViewHolder viewHolder = null;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_search, parent, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.desc.setText(result.getDesc());
        viewHolder.who.setText(result.getWho());
        viewHolder.publishedAt.setText(result.getPublishedAt().substring(0, 10));
        return view;
    }
    class ViewHolder {
        @BindView(R.id.desc)
        TextView desc;
        @BindView(R.id.who)
        TextView who;
        @BindView(R.id.publishedAt)
        TextView publishedAt;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
