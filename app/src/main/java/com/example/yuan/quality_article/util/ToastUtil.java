package com.example.yuan.quality_article.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by jarvis yuen
 * Date: 2019/9/2
 */
public class ToastUtil {
    public static void ToastShort(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }

    public static void ToastLong(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
