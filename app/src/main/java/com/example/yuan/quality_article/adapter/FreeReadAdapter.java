package com.example.yuan.quality_article.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.yuan.quality_article.R;
import com.example.yuan.quality_article.bean.categories.Result;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by jarvis yuen
 * Date: 2019/9/3
 */
public class FreeReadAdapter extends ArrayAdapter<Result> {

    private String TAG = getContext().getClass().getSimpleName();

    private int resource;
    private List<Result> resultList;

    public FreeReadAdapter(Context context, int resource, List<Result> objects) {
        super(context, resource, objects);
        this.resource = resource;
        resultList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        ViewHolder viewHolder = null;
        final Result result = getItem(position);
        if (convertView != null) {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        } else {
            view = LayoutInflater.from(getContext()).inflate(resource, parent, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }
        viewHolder.textView.setText(result.getName());
        return view;
    }

    class ViewHolder {
        @BindView(R.id.text)
        TextView textView;

        public ViewHolder(View view) {
            super();
            ButterKnife.bind(this, view);
        }
    }
}
