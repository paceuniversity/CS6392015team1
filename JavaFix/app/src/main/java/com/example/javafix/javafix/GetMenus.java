package com.example.javafix.javafix;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.URL;


public class GetMenus extends ActionBarActivity {

    private static Button bucks;
    private static ImageView starBorder;
    private static Bitmap star;
    private static ProgressDialog One_Moment;

    private static Button dunkin;
    private static ImageView dunkinBorder;
    private static Bitmap dunk;
    private static ProgressDialog wait;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_menus);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_get_menus, menu);
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
    }

    public void getStarMenu(View view) {
        bucks = (Button) findViewById(R.id.starbucksMenu);
        starBorder = (ImageView) findViewById(R.id.starbucksImage);
        bucks.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new getStarMenu().execute("http://www.gwcampusdining.com/dining/images/CoffeeStop2.jpg");
            }
        });
    }

    private class getStarMenu extends AsyncTask<String, String, Bitmap> {
        @Override
        protected void onPreExecute() {
            One_Moment = new ProgressDialog(GetMenus.this);
            One_Moment.setMessage("Your request is being processed, Please Wait");
            One_Moment.show();
        }// end onPreExecute

        protected Bitmap doInBackground(String... args) {
            try {

                star = BitmapFactory.decodeStream((InputStream) new URL(args[0]).getContent());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return star;
        } // end doInBackground

        protected void onPostExecute(Bitmap download) {
            if (download != null) {
                starBorder.setImageBitmap(download);
                One_Moment.dismiss();
            } else {
                One_Moment.dismiss();

                Toast.makeText(GetMenus.this, "Error, Try Again", Toast.LENGTH_SHORT).show();

            }
        }

    }//ends async

    public void getDunkinMenu(View view) {
        dunkin = (Button) findViewById(R.id.dunkinMenu);
        dunkinBorder = (ImageView) findViewById(R.id.dunkinImage);
        dunkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new getDunkinMenu().execute("http://www.cspinet.org/new/images/dunkin2.gif");
            }

        });
    }

    private class getDunkinMenu extends AsyncTask<String, String, Bitmap> {
        @Override
        protected void onPreExecute() {
            wait = new ProgressDialog(GetMenus.this);
            wait.setMessage("Your request is being processed, Please Wait");
            wait.show();
        }// end onPreExecute

        protected Bitmap doInBackground(String... args) {
            try {
                dunk = BitmapFactory.decodeStream((InputStream) new URL(args[0]).getContent());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return dunk;
        } // end doInBackground

        protected void onPostExecute(Bitmap download) {
            if (download != null) {
                dunkinBorder.setImageBitmap(download);
                wait.dismiss();
            } else {
                wait.dismiss();

                Toast.makeText(GetMenus.this, "Error, Try Again", Toast.LENGTH_SHORT).show();
            }
        }
    }//ends async

} //ends class
