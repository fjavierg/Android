package com.phonegap.hellophonegap;


import android.app.Activity;
import android.os.Bundle;
import com.phonegap.ManusaAndroid.R;
import org.apache.cordova.*;

public class HelloPhoneGapActivity extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}

