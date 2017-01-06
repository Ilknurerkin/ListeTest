package com.erkin.listetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    ImageView iv;
    private ListView liste;
    private String[] yemekler;
    private String pozisyonAnahtari="pozisyonAnahtari";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liste=(ListView)findViewById(R.id.anaListe);
        iv=(ImageView)findViewById(R.id.asci);
        yemekler=new String[]{"Ispanaklı Börek","Patlıcan Kebabı","İrmik Helvası" };
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,android.R.id
                .text1,yemekler);
        liste.setAdapter(adapter);
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(MainActivity.this,DetayActivity.class);
                intent.putExtra(pozisyonAnahtari,position);
                startActivity(intent);

                Toast.makeText(MainActivity.this,yemekler[position],Toast.LENGTH_SHORT).show();

            }
        });





    }





}



