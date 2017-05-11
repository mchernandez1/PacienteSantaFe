package com.example.maria.pacientesantafe;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;


/**
 * Created by Maria on 1/05/2017.
 */

public class MainActivity extends AppCompatActivity
{
    private Button btnCitas;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);



       if (AccessToken.getCurrentAccessToken() == null) {
          goLoginScreen();
        }

//public boolean onNavigationItemSelected(MenuItem item)
//{
  //  int id = item.getItemId();
   // FragmentManager fragmentManager = getFragmentManager();

    //if(id==R.id.nav_cita)
    //{
    //    fragmentManager.beginTransaction().replace(), new CitaFragment()).commit();
  //  }
//}

//       btnCitas = (Button) findViewById(R.id.btnCitas);

      // btnCitas.setOnClickListener(new View.OnClickListener()
      //  {

        //    public void onClick(View v)
       //   {
         //   Intent intent = new Intent(MainActivity.this, CitasActivity.class);
        //  startActivity(intent);
        //  }

      //  });

    }

    private void goConsejosScreen() {
        Intent intent = new Intent(this, ConsejosActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goEditarScreen() {
        Intent intent = new Intent(this, EditarPerfilActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goHistorialScreen() {
        Intent intent = new Intent(this, HistorialActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goInformacionScreen() {
        Intent intent = new Intent(this, InformacionMedicosActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void goLoginScreen() {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void citas(View view)
    {
        goCitasScreen();
    }

    private void goCitasScreen() {
        Intent intent = new Intent(this, CitasActivity.class);
        startActivity(intent);
    }
    public void consejos(View view)
    {
        goConsejosScreen();
    }

    public void editarPerfil(View view)
    {
        goEditarScreen();
    }

    public void historial(View view)
    {
        goHistorialScreen();
    }

    public void medicos(View view)
    {
        goInformacionScreen();
    }

    public void logout(View view)
    {
        LoginManager.getInstance().logOut();
        goLoginScreen();
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