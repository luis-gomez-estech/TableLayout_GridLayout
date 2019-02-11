package com.example.tablelayout_gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //////// BOTON QUE ENLAZA CON Main2Activity

        // Como queremos que un boton que está en este activity, vaya a otro activity.
        // declaramos un nuevo objeto Button llamado boton1 y en la parte morada ponemos el id del boton

        final Button boton1 = findViewById(R.id.boton_intent1);

        /* Ahora tenemos que decirle que va a  hacer algo con:

         boton1.setOnClickListener(new View.OnClickListener() {

        y tambien decirle que es lo que va a hacer,

        @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

        y es una funcion que al hacer click, mediante el comando Intent le decimos
        que vaya de una activity a otra, por tanto le decimos el MainActivitity que estamos y el MainActivity a donde queremos ir
        Por ultimo, para iniciarlo ponemos startActivity(intent);

        */

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });


        /////// FINAL DE QUE ENLAZA CON Main2Activity

    }
}
