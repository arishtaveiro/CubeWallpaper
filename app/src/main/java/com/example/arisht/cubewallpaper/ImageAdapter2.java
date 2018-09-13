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

public class ImageAdapter2 extends BaseAdapter {


    private Context context;

    public ImageAdapter2(Context context) {
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
          /*  imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(350, 700));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
              imageView.setAdjustViewBounds(true);
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
            R.drawable.st1, R.drawable.st2,
            R.drawable.st3, R.drawable.st4,
            R.drawable.st5,
            R.drawable.st6, R.drawable.st7,
            R.drawable.st8, R.drawable.st9,
            R.drawable.st10,
            R.drawable.st11, R.drawable.st12,
            R.drawable.st13, R.drawable.st14,
            R.drawable.st15,
            R.drawable.st16, R.drawable.st17,
            R.drawable.st18, R.drawable.st19,
            R.drawable.st20,
            R.drawable.st21, R.drawable.st22,
            R.drawable.st23, R.drawable.st24,
            R.drawable.st25,

            R.drawable.st26, R.drawable.st27,
            R.drawable.st28, R.drawable.st29,
            R.drawable.st30,
            R.drawable.st31, R.drawable.st32,
            R.drawable.st33, R.drawable.st34,
            R.drawable.st35,
            R.drawable.st36, R.drawable.st37,
            R.drawable.st38, R.drawable.st39,
            R.drawable.st40,




            R.drawable.st41, R.drawable.st42,
            R.drawable.st43,
            R.drawable.st44, R.drawable.st45,
            R.drawable.st46, R.drawable.st47,
            R.drawable.st48,
            R.drawable.st49, R.drawable.st50,






    };
}
