package com.example.arisht.cubewallpaper;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    LinearLayout anime, superhero, game, vector;
    ActionBar mActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    /*    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //initialisationof linear layout of view flipper
        anime = (LinearLayout) findViewById(R.id.anime);
        superhero = (LinearLayout) findViewById(R.id.superhero);
        game = (LinearLayout) findViewById(R.id.game);
        vector = (LinearLayout) findViewById(R.id.vector);
    }

    public void anime(View v){
        Toast.makeText(this, "anime", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, Card1.class);
        startActivity(i);
    }
    public void superhero(View v){
        Toast.makeText(this, "superhero", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, Card2.class);
        startActivity(i);

    }
    public void game(View v){
        Toast.makeText(this, "game", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, Card3.class);
        startActivity(i);

    }
    public void vector(View v){
        Toast.makeText(this, "vector", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, Card4.class);
        startActivity(i);

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {
            Intent i = new Intent(this, AboutUs.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.anime) {
            Toast.makeText(this, "anime", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Card1.class);
            startActivity(i);

        } else if (id == R.id.superhero) {
            Toast.makeText(this, "superhero", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Card2.class);
            startActivity(i);

        } else if (id == R.id.vector) {
            Toast.makeText(this, "vector", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Card4.class);
            startActivity(i);
        }   else if (id == R.id.game) {
                Toast.makeText(this, "game", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this, Card3.class);
                startActivity(i);

        } else if (id == R.id.nav_share) {
            Intent i = new Intent(this, AboutUs.class);
            startActivity(i);


        } else if (id == R.id.nav_send) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("market://details?id=" + getPackageName()));
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
