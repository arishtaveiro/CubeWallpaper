package com.example.arisht.cubewallpaper;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.WallpaperManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.widget.Toast.LENGTH_SHORT;

public class SingleView extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private AlertDialog dialog;
    private static final int REQUEST_WRITE_STORAGE = 112;
    FloatingActionButton fab_set, fab_save, fab_share ,fab_plus;
    Animation FabOpen, FabClose, FabRClockwise, FabRAnticlockwise;
    boolean isOpen = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_view);


        ///////////////

        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter1 imageAdapter1 = new ImageAdapter1(this);






        init();
        setupView();




        //////////database

         /*   SQLiteOpenHelper starbuzzDatabaseHelper = new WallDBHelper(this);
            db = starbuzzDatabaseHelper.getReadableDatabase();




            cursor = db.query("WALLPAPER",
                    new String[]{ "_id", "IMG_RES_ID"},
                    "_id = ?", new String[]{Integer.toString(position+1)}, null, null, null);*/


       try {
            SQLiteOpenHelper pkm = new WallDBHelper(this);
            SQLiteDatabase db = pkm.getReadableDatabase();




            if(position <= 25){

                int x1 = 1;
                Cursor c1 = db.query("WALLPAPER",
                        new String[]{"NAME", "IMAGE"},
                        "_id = ? AND TYPE = ?",
                        new String[]{Integer.toString(position), Integer.toString(x1)},
                        null, null, null);

                if (c1.moveToFirst())
                {
                   String nm = c1.getString(0);
                    ImageView imageView = (ImageView) findViewById(R.id.imageView);
                    //ImageView imageView1 = (ImageView) findViewById(R.id.SingleView);
                    // Toast.makeText(this, " no good man" + position, Toast.LENGTH_SHORT).show();
                    //imageView.setImageResource(pics);
                    //imageView.setContentDescription(nm);
                    Picasso.with(getApplicationContext()).load(nm).into(imageView);
                    Toast.makeText(this, " condition 1  " + position, Toast.LENGTH_SHORT).show();
                }
                c1.close();
                db.close();



            }
            else if(position > 25 && position <= 75){

                    int x2 = 2;
                    Cursor c2 = db.query("WALLPAPER",
                            new String[]{"NAME", "IMAGE"},
                            "_id = ? AND TYPE = ?",
                            new String[]{Integer.toString(position), Integer.toString(x2)},
                            null, null, null);

                    if (c2.moveToFirst())
                    {
                        String nm = c2.getString(0);
                        ImageView imageView = (ImageView) findViewById(R.id.imageView);
                        //ImageView imageView1 = (ImageView) findViewById(R.id.SingleView);
                        // Toast.makeText(this, " no good man" + position, Toast.LENGTH_SHORT).show();
                        //imageView.setImageResource(pics);
                        //imageView.setContentDescription(nm);
                        Picasso.with(getApplicationContext()).load(nm).into(imageView);
                        Toast.makeText(this, "condition 2 " + position, Toast.LENGTH_SHORT).show();
                    }
                c2.close();
                db.close();


                }
            else if(position > 75 && position <=125){

                        int x3 = 3;
                        Cursor c3 = db.query("WALLPAPER",
                                new String[]{"NAME", "IMAGE"},
                                "_id = ? AND TYPE = ?",
                                new String[]{Integer.toString(position), Integer.toString(x3)},
                                null, null, null);

                        if (c3.moveToFirst())
                        {
                            String nm = c3.getString(0);
                            ImageView imageView = (ImageView) findViewById(R.id.imageView);
                            //ImageView imageView1 = (ImageView) findViewById(R.id.SingleView);
                            // Toast.makeText(this, " no good man" + position, Toast.LENGTH_SHORT).show();
                            //imageView.setImageResource(pics);
                            //imageView.setContentDescription(nm);
                            Picasso.with(getApplicationContext()).load(nm).into(imageView);
                            Toast.makeText(this, "condition 3  " + position, Toast.LENGTH_SHORT).show();
                        }
                c3.close();
                db.close();


                    }

            else if(position > 125 ){

                int x4 = 4;
                Cursor c4 = db.query("WALLPAPER",
                        new String[]{"NAME", "IMAGE"},
                        "_id = ? AND TYPE = ?",
                        new String[]{Integer.toString(position), Integer.toString(x4)},
                        null, null, null);

                if (c4.moveToFirst())
                {
                    String nm = c4.getString(0);
                    ImageView imageView = (ImageView) findViewById(R.id.imageView);
                    //ImageView imageView1 = (ImageView) findViewById(R.id.SingleView);
                    // Toast.makeText(this, " no good man" + position, Toast.LENGTH_SHORT).show();
                    //imageView.setImageResource(pics);
                    //imageView.setContentDescription(nm);
                    Picasso.with(getApplicationContext()).load(nm).into(imageView);
                    Toast.makeText(this, "condition 4  " + position, Toast.LENGTH_SHORT).show();
                }
                c4.close();
                db.close();


            }


       } catch (Exception e) {
       Toast.makeText(this, " no good man" + position, Toast.LENGTH_SHORT).show();

}






        boolean hasPermission = (ContextCompat.checkSelfPermission(SingleView.this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);
        if (!hasPermission) {
            ActivityCompat.requestPermissions(SingleView.this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    REQUEST_WRITE_STORAGE);
        }




        fab_plus = (FloatingActionButton) findViewById(R.id.fab_plus);
        fab_set = (FloatingActionButton) findViewById(R.id.fab_set);
        fab_share = (FloatingActionButton) findViewById(R.id.fab_share);
        fab_save = (FloatingActionButton) findViewById(R.id.fab_save);
        FabOpen = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        FabClose = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        FabRClockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);
        FabRAnticlockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anticlockwise);
        fab_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isOpen) {
                    fab_set.startAnimation(FabClose);
                    fab_share.startAnimation(FabClose);
                    fab_save.startAnimation(FabClose);
                    fab_plus.startAnimation(FabRAnticlockwise);
                    fab_set.setClickable(false);
                    fab_share.setClickable(false);
                    fab_save.setClickable(false);
                    isOpen = false;

                } else {
                    fab_set.startAnimation(FabOpen);
                    fab_share.startAnimation(FabOpen);
                    fab_save.startAnimation(FabOpen);
                    fab_plus.startAnimation(FabRClockwise);
                    fab_set.setClickable(true);
                    fab_share.setClickable(true);
                    fab_save.setClickable(true);
                    isOpen = true;
                }
            }


        });

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

    }







/*    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);


    }*/





    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode)
        {
            case REQUEST_WRITE_STORAGE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    //reload my activity with permission granted or use the features what required the permission
                } else
                {
                    Toast.makeText(SingleView.this, "The app was not allowed to write to your storage. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show();
                }
            }
        }

    }
    public void setupView(){
        fab_set.setOnClickListener(this);
        fab_save.setOnClickListener(this);
        fab_share.setOnClickListener(this);
    }


  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_wallpaper, menu);
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

        return super.onOptionsItemSelected(item);
    }*/

    private void init(){
       imageView =(ImageView) findViewById(R.id.imageView);
        fab_set = (FloatingActionButton) findViewById(R.id.fab_set);
        fab_share =(FloatingActionButton) findViewById(R.id.fab_share);
        fab_save = (FloatingActionButton) findViewById(R.id.fab_save);

    }






    public static Bitmap viewToBitmap(View view, int width, int height){

        Bitmap bitmap = Bitmap.createBitmap(width,height,Bitmap.Config.ARGB_8888);
        Canvas canvas =new Canvas(bitmap);
        view.draw(canvas);
        return bitmap;
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){

            case R.id.fab_set:{startWall();break;}
            case R.id.fab_save:{dialog= new AlertDialog.Builder(this).create(); dialog.setTitle("Save image");
                dialog.setMessage("Save image?");
                dialog.setButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startSave();
                    }
                });
                dialog.setButton2("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
                break;}
            case R.id.fab_share:{ startShare();   break;}

        }
    }

    public void startShare(){

        Bitmap bitmap= viewToBitmap(imageView,imageView.getWidth(),imageView.getHeight()) ;
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/jpeg");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG,100,byteArrayOutputStream);
        File file = new File(Environment.getExternalStorageDirectory()+File.separator+"ImageDemo.jpg");
        try {
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("file:///sdcard/ImageDemo.jpg"));
        startActivity(Intent.createChooser(shareIntent,"share image"));
    }


    public void  startSave(){

        FileOutputStream fileOutputStream=null;
        File file= getDisc();
        if(!file.exists() && !file.mkdirs()){

            Toast.makeText(this,"Can't create directory to save image",LENGTH_SHORT).show();
            return;
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyymmsshhmmss");
        String date = simpleDateFormat.format(new Date());
        String name = "Img"+date+".jpg";
        String file_name=file.getAbsolutePath()+"/"+name;
        File new_file = new File(file_name);
        try{ fileOutputStream = new FileOutputStream(new_file);
            Bitmap bitmap = viewToBitmap(imageView,imageView.getWidth(),imageView.getHeight());
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,fileOutputStream);
            Toast.makeText(this,"Wallpaper Saved",Toast.LENGTH_SHORT).show();
            fileOutputStream.flush();;
            fileOutputStream.close();
        }
        catch (FileNotFoundException e){e.printStackTrace();}
        catch (IOException e){e.printStackTrace();}
        refreshGallery(new_file);
    }
    public void refreshGallery(File file){

        Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        intent.setData(Uri.fromFile(file));
        sendBroadcast(intent);

    }





    private File getDisc(){

        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        return new File (file,"Image Demo");
    }







    
    public void startWall(){

        WallpaperManager wallpaperManager= WallpaperManager.getInstance(getApplicationContext());
        try{

            wallpaperManager.setBitmap(viewToBitmap(imageView,imageView.getWidth(),imageView.getHeight()));
            Toast.makeText(this,"Wallpaper Set",Toast.LENGTH_SHORT).show();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
