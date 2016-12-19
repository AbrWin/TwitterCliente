package com.abrwsoftware.twittercliente.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abrwsoftware.twittercliente.R;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "v3Xu527gTJ01uzCXABEqyixHm";
    private static final String TWITTER_SECRET = "E8eiI4JegvVZlTzToiIViXO7BwnnYv1smJ6qWcqtznKzaqcz0q";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        setContentView(R.layout.activity_main);
    }
}
