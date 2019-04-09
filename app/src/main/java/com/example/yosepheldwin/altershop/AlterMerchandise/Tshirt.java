package com.example.yosepheldwin.altershop.AlterMerchandise;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.yosepheldwin.altershop.AlterMerchandise.HargaBaju.KaosOblong;
import com.example.yosepheldwin.altershop.R;

import java.util.ArrayList;

import Adapter.CustomListAdapter;
import Model.HargaPOJO;

public class Tshirt extends AppCompatActivity {

    ListView listView;

    int[] daftarGambar = {R.drawable.tshirt, R.drawable.tshirt, R.drawable.tshirt, R.drawable.tshirt, R.drawable.tshirt};

    String[] daftarKaos ={"Kaos Oblong","Kaos","Tshirt","Kemeja","Kaos Polo"};

    String[] daftarHarga = {"30.000","15.000","50.000","70.000","65.000"};

    SwipeRefreshLayout swp_layout;

    CustomListAdapter cadAdapter;
    ArrayList<HargaPOJO> finalHargaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirt);

        finalHargaList = new ArrayList<>();
        listView = findViewById(R.id.lv);
        swp_layout = findViewById(R.id.swp_layout);

        swp_layout.setRefreshing(true);

        for ( int i = 0; i < daftarKaos.length; i++){

            if (i == daftarKaos.length - 1){


                swp_layout.setRefreshing(false);
            }

            Log.d("trace_handphone",daftarKaos[i]);

            finalHargaList.add(new HargaPOJO(daftarKaos[i],daftarHarga[i],daftarGambar[i]));



            cadAdapter = new CustomListAdapter(Tshirt.this,finalHargaList);
        }


        swp_layout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                cadAdapter.notifyDataSetChanged();
                swp_layout.setRefreshing(false);
            }
        });

        listView.setAdapter(cadAdapter);
        cadAdapter.notifyDataSetChanged();


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Tshirt.this, daftarKaos[i],Toast.LENGTH_SHORT).show();


            }
        });
    }
}
