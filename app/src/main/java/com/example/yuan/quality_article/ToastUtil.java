package com.example.yuan.quality_article;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by jarvis yuen
 * Date: 2019/9/2
 * Time: 18:49
 */
public class ToastUtil {
    public void ToastShort(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }

    public void ToastLong(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
