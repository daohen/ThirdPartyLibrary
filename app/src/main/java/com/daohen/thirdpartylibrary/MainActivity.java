package com.daohen.thirdpartylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private String img2Url = "http://i.zeze.com/attachment/forum/201610/30/150453u3oo7n3c702j7f08.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.img1);



    }
}
