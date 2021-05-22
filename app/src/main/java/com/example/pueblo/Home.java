package com.example.pueblo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity
{
    ArrayList<ActividadTuristica> Tarjetas=new ArrayList<>();
    RecyclerView grafico;
    @Override
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        grafico=findViewById(R.id.listado);
        grafico.setHasFixedSize(true);
        grafico.setLayoutManager(new LinearLayoutManager( this,LinearLayoutManager.VERTICAL, false));

        listado();
        ListaAdaptador adaptador=new ListaAdaptador(Tarjetas);
        grafico.setAdapter(adaptador);
    }

    private void listado()
    {
        Tarjetas.add(new ActividadTuristica("es un municipio ubicado en el Departamento de Córdoba, Colombia, fundado en 1776 por Antonio de la Torre y Miranda, fue erigido como municipio en 1834. El clima es cálido y su temperatura promedio es 27 °C (80.6 °F), la ciudad se encuentra a 69 km de Montería. La ciudad es llamada la Ciudad Cultural de Córdoba.", "Sahagún ", R.drawable.sahagun2));
        Tarjetas.add((new ActividadTuristica("Sahagún se identifica con el mote de queso. Alrededor de este municipio se conocen las sopas de queso y que es diferente a este tradicional mote. Se conoce el famoso Mongo de yuca(un dulce típico) y los caballitos (dulce de papaya).", "Comida Típica",R.drawable.mote)));
        Tarjetas.add((new ActividadTuristica("Lugares que puedes visitar, -Arenas Del Norte, -Bajo Grande, -Colomboy, -Bajo El Limón, -Santa Catalina ", "Actividades Turisticas",R.drawable.sahagun)));
        Tarjetas.add((new ActividadTuristica("Hostal Villa Juliana, Hotel Mansion ","Alojamientos", R.drawable.hospedaje2)));
    }


}
