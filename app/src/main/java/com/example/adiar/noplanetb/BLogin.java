package com.example.adiar.noplanetb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class BLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        ImageView fondo=findViewById(R.id.ivFondoLogin);

        Glide.with(this)
                .load(R.drawable.planetearth)
                .apply(new RequestOptions()
                        .centerCrop()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(fondo);

    }
    public void siguiente(View v){
        Intent intent = new Intent(this, BMain.class);
        startActivity(intent);
        finish();
    }

}
