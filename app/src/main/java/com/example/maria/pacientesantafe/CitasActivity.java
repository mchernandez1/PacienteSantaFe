package com.example.maria.pacientesantafe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.login.LoginManager;

/**
 * Created by Maria on 1/05/2017.
 */

public class CitasActivity extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cita);

    }

    public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
            // lo ideal aquí sería hacer un intent para abrir una nueva clase como lo siguiente
            //  Log.i("ActionBar", "Settings!");
            //Intent about = new Intent(getApplicationContext(), EditarPerfilActivity.class);
            //startActivity(about);
            // return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
