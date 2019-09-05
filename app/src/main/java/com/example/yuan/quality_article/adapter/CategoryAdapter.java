package com.example.yuan.quality_article.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.yuan.quality_article.R;
import com.example.yuan.quality_article.bean.category.Result;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jarvis yuen
 * Date: 2019/9/4
 */
public class CategoryAdapter extends ArrayAdapter<Result> {

    private String TAG = getContext().getClass().getSimpleName();

    private int resource;
    private List<Result> resultList;

    public CategoryAdapter(Context context, int resource, List<Result> objects) {
        super(context, resource, objects);
        this.resource = resource;
        resultList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        ViewHolder viewHolder;
        Result result = getItem(position);
        if (convertView != null) {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        } else {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_category, parent, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        Glide.with(getContext()).load(result.getIcon()).into(viewHolder.imageView);
        viewHolder.textView.setText(result.getTitle());
        return view;
    }
    class ViewHolder {

        @BindView(R.id.icon)
        ImageView imageView;
        @BindView(R.id.title)
        TextView textView;

        public ViewHolder(View view) {
            super();
            ButterKnife.bind(this, view);
        }
    }
}
