package com.example.adiar.noplanetb;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class BMain extends AppCompatActivity {
    private SwipeRefreshLayout swipeLayout;
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView foto= findViewById(R.id.ivfoto);
        Glide.with(this)
                .load(R.drawable.planetearth)
                .apply(new RequestOptions()

//                        .override(50, 50)
                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(foto);




        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast toast = Toast.makeText(BMain.this, "Refresh", Toast.LENGTH_LONG);
                toast.show();
                swipeLayout.setRefreshing(false);
            }
        });


    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.call) {
            Toast toast = Toast.makeText(this,"Calling...",Toast.LENGTH_LONG );
            toast.show();
        }
        return super.onOptionsItemSelected(item);
    }

}

