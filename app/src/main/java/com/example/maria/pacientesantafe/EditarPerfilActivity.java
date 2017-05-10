package com.example.maria.pacientesantafe;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
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
import java.util.Arrays;
import java.util.List;

import models.Paciente;

/**
 * Created by Maria on 1/05/2017.
 */

public class EditarPerfilActivity extends Activity
{
    private EditText textId;

    private TextView tvPais;

    private TextView tvCiudad;

    private TextView tvTelefono;

    private TextView tvCelular;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);

        textId = (EditText) findViewById(R.layout.perfil);

        prepareUI();

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

        protected void onPostExecute(String response)
        {
            List<Paciente> pacientes = getPacientes(response);

            if (!pacientes.isEmpty()) {
                mostrarPaciente(pacientes.get(0));
            }
        }
    }

    private String prettyfyJSON(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser parser = new JsonParser();
        JsonElement element = parser.parse(json);
        return gson.toJson(element);
    }

    public void buscarPaciente(View view)
    {
        String identificacion = String.valueOf(textId.getText());
        if(!TextUtils.isEmpty(identificacion))
        {
            String url = new String(
                    "http://localhost:9000/"+ "identificacion");
            new LoadFilmTask().execute(url);
        }
    }

    private List<Paciente> getPacientes (String json)
    {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Paciente>>(){}.getType();
        return gson.fromJson(json,type);
    }

    private void prepareUI()
    {
        textId = (EditText) findViewById(R.id.textId);

        tvPais = (TextView) findViewById(R.id.tvPais);
        tvCiudad = (TextView) findViewById(R.id.tvCiudad);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvCelular = (TextView) findViewById(R.id.tvCelular);
    }

    private void mostrarPaciente(Paciente paciente) {

        tvPais.setText(paciente.getPais());
        tvCiudad.setText(paciente.getCiudad());
        Long tele = paciente.getTelefono();
        tvTelefono.setText(String.valueOf(tele));
        tvCelular.setText(String.valueOf(paciente.getCelular()));

    }
}
