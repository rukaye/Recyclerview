package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView.LayoutManager layoutManager;
    List<mesajModel>list;

    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        listeDoldur();

    }
    public void tanimla()
    {
        RecyclerView rcv = findViewById(R.id.rcv);
        layoutManager=new LinearLayoutManager(this);

        rcv.setLayoutManager(layoutManager);
    }
    public void listeDoldur()
    {
        list=new ArrayList<>();
        mesajModel m1=new mesajModel("kedi","ben kedi",R.drawable.kedi);
        mesajModel m2=new mesajModel("köpek","ben rex",R.drawable.dog);
        mesajModel m3=new mesajModel("zürafa","ben giraffe",R.drawable.giraffe);
        list.add(m1);
        list.add(m2);
        list.add(m3);

        mesajAdapter adp=new mesajAdapter(list,this);
       rcv.setAdapter(adp);


    }
}
