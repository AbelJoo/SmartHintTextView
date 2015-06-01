package com.abeljoo.android.smarthinttextviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.abeljoo.android.smarthinttextview.SmartHintTextView;

public class MainActivity extends Activity {

    private SmartHintTextView mSmart;

    private TextView mSimple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSmart = (SmartHintTextView) findViewById(R.id.smarthinttextview);
        mSmart.setText("Text");

        mSimple = (TextView) findViewById(R.id.textview);
        mSimple.setText("Text");
    }
}
