package com.example.arisht.cubewallpaper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by ARISHT on 13-12-2016.
 */

public class ImageAdapter3 extends BaseAdapter {


    private Context context;

    public ImageAdapter3(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;

        if(convertView == null)
        {
            /*imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(350, 700));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(0, 0, 0, 0);*/



            imageView = new ImageView(context);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
            imageView.setLayoutParams(new GridView.LayoutParams(params));



            imageView.setLayoutParams(new LinearLayout.LayoutParams(GridLayout.LayoutParams.MATCH_PARENT, GridLayout.LayoutParams.MATCH_PARENT));

            //imageView.setLayoutParams(new GridView.LayoutParams(350, 700));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(0, 0, 0, 0);



        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.gt1, R.drawable.gt2,
            R.drawable.gt3, R.drawable.gt4,
            R.drawable.gt5,

            R.drawable.gt6, R.drawable.gt7,
            R.drawable.gt8, R.drawable.gt9,
            R.drawable.gt10,

            R.drawable.gt11, R.drawable.gt12,
            R.drawable.gt13, R.drawable.gt14,
            R.drawable.gt15,

            R.drawable.gt16, R.drawable.gt17,
            R.drawable.gt18, R.drawable.gt19,
            R.drawable.gt20,

            R.drawable.gt21, R.drawable.gt22,
            R.drawable.gt23, R.drawable.gt24,
            R.drawable.gt25,

            R.drawable.gt26, R.drawable.gt27,
            R.drawable.gt28, R.drawable.gt29,
            R.drawable.gt30,

            R.drawable.gt31, R.drawable.gt32,
            R.drawable.gt33, R.drawable.gt34,
            R.drawable.gt35,

            R.drawable.gt36, R.drawable.gt37,
            R.drawable.gt38, R.drawable.gt39,
            R.drawable.gt40,

            R.drawable.gt41, R.drawable.gt42,
            R.drawable.gt43, R.drawable.gt44,
            R.drawable.gt45,

            R.drawable.gt46, R.drawable.gt47,
            R.drawable.gt48, R.drawable.gt49,
            R.drawable.gt50


    };

}
