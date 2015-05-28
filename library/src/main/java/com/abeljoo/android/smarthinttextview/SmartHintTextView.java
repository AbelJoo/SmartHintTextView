package com.abeljoo.android.smarthinttextview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by abel on 15-5-27.
 */
public class SmartHintTextView extends TextView {

    private CharSequence mHint;

    public SmartHintTextView(Context context) {
        super(context);
    }

    public SmartHintTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SmartHintTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SmartHintTextView(Context context, AttributeSet attrs, int defStyleAttr,
                             int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(text, type);
        if (TextUtils.isEmpty(text)
                && TextUtils.isEmpty(getHint())
                && !TextUtils.isEmpty(mHint)) {
            setHint(mHint);
        } else if (!TextUtils.isEmpty(text)
                && !TextUtils.isEmpty(getHint())) {
            mHint = getHint();
            setHint(null);
        }
    }
}
