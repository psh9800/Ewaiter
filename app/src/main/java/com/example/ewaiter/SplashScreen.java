package com.example.ewaiter;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    private static boolean f_splashLoaded;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(!f_splashLoaded){
            setContentView(R.layout.activity_splash_screen);
            int f_secondsDelayed = 5;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                }
            }, f_secondsDelayed * 500);
            f_splashLoaded = true;
        }else{
            Intent f_goToMainActivity = new Intent(SplashScreen.this, MainActivity.class);
            f_goToMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(f_goToMainActivity);
            finish();
        }
    }
}
