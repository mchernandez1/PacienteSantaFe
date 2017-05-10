package com.example.maria.pacientesantafe;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import models.Medico;
import models.Paciente;
import models.PacienteComplejo;

import static com.example.maria.pacientesantafe.R.id.tvCiudad;
import static com.example.maria.pacientesantafe.R.id.tvPais;

/**
 * Created by Maria on 9/05/2017.
 */

public class InformaciónMedicosActivity extends Activity
{
    private EditText textId;

    private TextView infoMedico;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicos);

        textId = (EditText) findViewById(R.layout.perfil);

       // prepareUI();

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


    private class LoadFilmTask extends AsyncTask<String, Long, String> {
        protected String doInBackground(String... urls) {
            try {
                return HttpRequest.get(urls[0]).accept("application/json")
                        .body();
            } catch (HttpRequest.HttpRequestException exception) {
                return null;
            }
        }
    }


}
