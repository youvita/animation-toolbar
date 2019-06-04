package com.animation.library;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;

public class ToolBarAnimation {

    public static void tranAnimationUp(Context context, Toolbar toolbar) {
        Animation animation = new SlideAnimation(toolbar, getActionBarHeight(context), 0);
        animation.setInterpolator(new AccelerateInterpolator());
        animation.setDuration(300);
        toolbar.setAnimation(animation);
        toolbar.startAnimation(animation);
    }

    public static void tranAnimationDown(Context context, Toolbar toolbar) {
        Animation animation = new SlideAnimation(toolbar, 0, getActionBarHeight(context));
        animation.setInterpolator(new AccelerateInterpolator());
        animation.setDuration(300);
        toolbar.setAnimation(animation);
        toolbar.startAnimation(animation);
    }

    @SuppressLint("ObsoleteSdkInt")
    private static int getActionBarHeight(Context context) {
        int[] abSzAttr;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            abSzAttr = new int[] { android.R.attr.actionBarSize };
        } else {
            abSzAttr = new int[] { R.attr.actionBarSize };
        }
        @SuppressLint("Recycle") TypedArray a = context.obtainStyledAttributes(abSzAttr);
        return a.getDimensionPixelSize(0, -1);
    }
}
