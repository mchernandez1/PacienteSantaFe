package com.example.maria.pacientesantafe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Maria on 1/05/2017.
 */

public class EditarPerfilActivity extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);

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
