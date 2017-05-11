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

public class InformacionMedicosActivity extends Activity
{
    private EditText editTextMedicos;

    private TextView txtMedico;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medicos);

        editTextMedicos  = (EditText) findViewById(R.layout.medicos);

       // prepareUI();

    }


}
