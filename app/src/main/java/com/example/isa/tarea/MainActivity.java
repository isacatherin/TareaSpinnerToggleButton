package com.example.isa.tarea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner nombres;
    ToggleButton toggle;
    Spinner apellido;

    @Override

    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres= (Spinner) findViewById(R.id.nombres);
        List list = new ArrayList();
        list.add("Jhonny");
        list.add("Mauricio");
        list.add("Juan Pablo");
        list.add("Andres Felipe");
        list.add("Diego");
        list.add("Isabel");
        list.add("Camilo");
        list.add("Juan Camilo");
        list.add("Diego Andres");
        list.add("Edward");
        list.add("David");
        list.add("Johana");
        list.add("Erika");
        list.add("Juan Gabriel");
        list.add("Jhonatan");
        list.add("Hector");

        apellido= (Spinner) findViewById(R.id.apellidos);
        List list2 = new ArrayList();
        list2.add("Ospina");
        list2.add("Zuluaga");
        list2.add("Ocampo");
        list2.add("Montoya");
        list2.add("Londoño");
        list2.add("Zapata");
        list2.add("Quintero");
        list2.add("Salinas");
        list2.add("Londoño");
        list2.add("Salazar");
        list2.add("Montoya");
        list2.add("Tangarife");
        list2.add("Garcia");
        list2.add("Herrera");
        list2.add("Alzate");
        list2.add("Alzate");

        toggle = (ToggleButton) findViewById(R.id.togglenombres);

        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final ArrayAdapter arr = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list2);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Oprimido", Toast.LENGTH_SHORT).show();

                    nombres.setAdapter(arrayAdapter);


                }else {
                    Toast.makeText(MainActivity.this, "No Oprimido", Toast.LENGTH_SHORT).show();

                    apellido.setAdapter(arr);

                }
            }
        });
    }




    }

