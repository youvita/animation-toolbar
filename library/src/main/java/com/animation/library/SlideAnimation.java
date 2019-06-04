package com.animation.library;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class SlideAnimation extends Animation {
    private int mFromHeight;
    private int mToHeigth;
    private View mView;

    public SlideAnimation(View view, int fromHeigth, int toHeigth) {
        this.mView = view;
        this.mFromHeight = fromHeigth;
        this.mToHeigth = toHeigth;
    }

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
    }

    @Override
    public boolean willChangeBounds() {
        return true;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        int newHeight;

        if (mView.getHeight() != mToHeigth) {
            newHeight = (int)(mFromHeight + ((mToHeigth - mFromHeight) * interpolatedTime));
            mView.getLayoutParams().height = newHeight;
            mView.requestLayout();
        }
    }
}
