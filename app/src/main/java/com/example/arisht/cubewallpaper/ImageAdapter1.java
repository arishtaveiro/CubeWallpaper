package com.example.arisht.cubewallpaper;

import android.content.Context;
import android.view.LayoutInflater;
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

public class ImageAdapter1 extends BaseAdapter {

    private Context context;

    public ImageAdapter1(Context context) {
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



          //  imageView = new ImageView(context);

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
            R.drawable.at1, R.drawable.at2,
            R.drawable.at3, R.drawable.at4,
            R.drawable.at5,
            R.drawable.at6, R.drawable.at7,
            R.drawable.at8, R.drawable.at9,
            R.drawable.at10,
            R.drawable.at11, R.drawable.at12,
            R.drawable.at13, R.drawable.at14,
            R.drawable.at15,
            R.drawable.at16, R.drawable.at17,
            R.drawable.at18, R.drawable.at19,
            R.drawable.at20,
            R.drawable.at21, R.drawable.at22,
            R.drawable.at23, R.drawable.at24,
            R.drawable.at25,


          /* R.drawable.a26, R.drawable.a27,
            R.drawable.a28, R.drawable.a29,
            R.drawable.a30,
            R.drawable.a31, R.drawable.a32,
            R.drawable.a33, R.drawable.a34,
            R.drawable.a35,
            R.drawable.a36, R.drawable.a37,
            R.drawable.a38, R.drawable.a39,
            R.drawable.a40,
            R.drawable.a41, R.drawable.a42,
            R.drawable.a43, R.drawable.a44,
            R.drawable.a45,
            R.drawable.a46, R.drawable.a47,
            R.drawable.a48, R.drawable.a49,
            R.drawable.a50*/


    };

}
