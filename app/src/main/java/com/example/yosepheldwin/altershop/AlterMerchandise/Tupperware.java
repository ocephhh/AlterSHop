package com.example.yosepheldwin.altershop.AlterMerchandise;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.yosepheldwin.altershop.R;

import java.util.ArrayList;

import Adapter.CustomListAdapter;
import Model.HargaPOJO;

public class Tupperware extends AppCompatActivity {

    ListView listView;

    int[] daftarGambar = {R.drawable.tupperware, R.drawable.tupperware, R.drawable.tupperware, R.drawable.tupperware, R.drawable.tupperware};

    String[] daftarHandphone ={"Tupperware Emak","Tupperware Botol","Tupperware","Tupperware Besar","Tupperware Kecil"};

    String[] daftarHarga = {"30.000","15.000","50.000","70.000","65.000"};

    SwipeRefreshLayout swp_layout;

    CustomListAdapter cadAdapter;
    ArrayList<HargaPOJO> finalHargaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tupperware);

        finalHargaList = new ArrayList<>();
        listView = findViewById(R.id.lv);
        swp_layout = findViewById(R.id.swp_layout);

        swp_layout.setRefreshing(true);

        for ( int i = 0; i < daftarHandphone.length; i++){

            if (i == daftarHandphone.length - 1){


                swp_layout.setRefreshing(false);
            }

            Log.d("trace_handphone",daftarHandphone[i]);

            finalHargaList.add(new HargaPOJO(daftarHandphone[i],daftarHarga[i],daftarGambar[i]));



            cadAdapter = new CustomListAdapter(Tupperware.this,finalHargaList);
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
                Toast.makeText(Tupperware.this, daftarHandphone[i],Toast.LENGTH_SHORT).show();



            }
        });
    }
}
