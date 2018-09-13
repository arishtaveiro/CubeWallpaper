package com.example.arisht.cubewallpaper;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void sendEmail(View v){

        String TO[] = {"cubeDevelopers@gmail.com"};
        Intent em = new Intent(Intent.ACTION_SEND);

        em.setData(Uri.parse("mailto :"));
        em.setType("text/palin");

        em.putExtra(Intent.EXTRA_EMAIL, TO);
        em.putExtra(Intent.EXTRA_SUBJECT, "Subject");

        try{
            startActivity(Intent.createChooser(em, "Send mail ..."));
            finish();
        }catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }

    public void rateus(View v){

       // startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=PackageName")));
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("market://details?id=" + getPackageName()));
        startActivity(i);
    }
}
