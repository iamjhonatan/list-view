package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdd extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    EditText editTextNameAdd;
    EditText editTextAddressAdd;
    EditText editTextPhoneAdd;
    TextView textViewAlertNewContact;
    //EnumType type;
    ContactRepository contactRepository;
    Agenda agenda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_add);
        editTextNameAdd = findViewById(R.id.editTextNameAdd);
        editTextAddressAdd = findViewById(R.id.editTextAddressAdd);
        editTextPhoneAdd = findViewById(R.id.editTextPhoneAdd);
        textViewAlertNewContact = findViewById(R.id.textViewAlertNewContact);
        Spinner spinner = findViewById(R.id.spinnerType);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        //spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void onClickButtonAgenda (View view) {
        Intent intent = new Intent(ListAdd.this,
                Agenda.class);
        startActivity(intent);
    }


    public void onClickButtonAdd (View view) {
        String name = editTextNameAdd.getText().toString();
        String address = editTextAddressAdd.getText().toString();
        String phone = editTextPhoneAdd.getText().toString();
        //String type = EnumType.valueOf(onItemSelected());

        if (name.isEmpty() || address.isEmpty() || phone.isEmpty()){
            textViewAlertNewContact.setVisibility(View.VISIBLE);
        }
        else {
            Contact contact = new Contact(name, address, phone);
            contactRepository.getInstance().addContact(contact);

            Intent intent = new Intent(ListAdd.this,
                    Agenda.class);
            startActivity(intent);
        }
    }


}