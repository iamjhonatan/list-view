package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Agenda extends AppCompatActivity {
    ListView listViewAgenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        listViewAgenda = (ListView) findViewById(R.id.listViewAgenda);
    }

    public void onClickAdd (View view) {
        Intent intent = new Intent(Agenda.this,
                ListAdd.class);
        startActivity(intent);
    }



}