package com.istiak.admob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class FullScreenAdsActivity extends AppCompatActivity {

    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_ads);

        MobileAds.initialize(this, "ca-app-pub-4761500786576152~8215465788");
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        AdRequest request = new AdRequest.Builder().build();
        interstitialAd.loadAd(request);


        interstitialAd.setAdListener(new AdListener(){
            public void onAdLoaded(){
                if (interstitialAd.isLoaded()) {
                    interstitialAd.show();
                }
            }
        });
    }
    }

