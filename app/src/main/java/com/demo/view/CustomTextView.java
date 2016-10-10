package com.demo.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by chen_fulei on 2016/10/8.
 */
public class CustomTextView extends TextView {

    public CustomTextView(Context context){
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs){
        super(context , attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle){
        super(context , attrs , defStyle);
    }

    @Override
    protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
        if(focused) super.onFocusChanged(focused, direction, previouslyFocusedRect);
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        if(hasWindowFocus) super.onWindowFocusChanged(hasWindowFocus);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
