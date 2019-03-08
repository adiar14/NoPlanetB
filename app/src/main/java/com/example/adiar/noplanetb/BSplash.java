package com.example.adiar.noplanetb;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class BSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splashscreen);
        ImageView logo= findViewById(R.id.ivLogo);
        ImageView fondo=findViewById(R.id.ivFondo);

        Glide.with(this)
                .load(R.drawable.planetearth)
                .apply(new RequestOptions()
                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(fondo);


        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        logo.startAnimation(myanim);
        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash.this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}

