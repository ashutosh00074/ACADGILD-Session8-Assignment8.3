package com.tech.gigabyte.customgridview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {

    GridView gridview;

    public static String[] names = {                              //Define Name for TextView
            "GingerBread",
            "Honeycomb",
            "IceCream",
            "JellyBean",
            "Kitkat",
            "Lollipop",
    };
    public static int[] Images = {                                     //Images Path from drawable folder
            R.drawable.image_1,                                      //Always Take lower case latter
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);                        //Passing layout
        gridview = (GridView) findViewById(R.id.customgrid);           //Custom Grid initialization
        gridview.setAdapter(new CustomGVActivity(this, names, Images));
        gridview.setFastScrollEnabled(true);
    }
}
