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

public class ImageAdapter4 extends BaseAdapter {


    private Context context;

    public ImageAdapter4(Context context) {
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
            R.drawable.v1, R.drawable.v2,
            R.drawable.v3, R.drawable.v4,
            R.drawable.v5,

            R.drawable.v6, R.drawable.v7,
            R.drawable.v8, R.drawable.v9,
            R.drawable.v10,

            R.drawable.v11, R.drawable.v12,
            R.drawable.v13, R.drawable.v14,
            R.drawable.v15,

            R.drawable.v16, R.drawable.v17,
            R.drawable.v18, R.drawable.v19,
            R.drawable.v20,

            R.drawable.v21, R.drawable.v22,
            R.drawable.v23, R.drawable.v24,
            R.drawable.v25,

            R.drawable.v26, R.drawable.v27,
            R.drawable.v28, R.drawable.v29,
            R.drawable.v30,

            R.drawable.v31, R.drawable.v32,
            R.drawable.v33, R.drawable.v34,
            R.drawable.v35,

            R.drawable.v36, R.drawable.v37,
            R.drawable.v38, R.drawable.v39,
            R.drawable.vt40,

            R.drawable.v41, R.drawable.v42,
            R.drawable.v43, R.drawable.v44,
            R.drawable.v45,

            R.drawable.v46, R.drawable.v47,
            R.drawable.v48, R.drawable.v49,
            R.drawable.v50,


    };

}
