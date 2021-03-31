package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextLogin;
    EditText editTextPassword;
    TextView textViewWrong;
    UserRepository user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextLogin = findViewById(R.id.editTextLogin);
        editTextPassword = findViewById(R.id.editTextPassword);
        textViewWrong = findViewById(R.id.textViewWrong);
    }

    public void onClickSignIn (View view) {
        Intent intent = new Intent(MainActivity.this,
                SignIn.class);
        startActivity(intent);
    }

    public void onClickLogin (View view) {
        String name = editTextLogin.getText().toString();
        String password = editTextPassword.getText().toString();
        TextView message = textViewWrong;

        if (user.getInstance().ifContains(name, password)){
            Intent intent = new Intent(MainActivity.this,
                    Agenda.class);
            startActivity(intent);
        }
        else {
            message.setVisibility(View.VISIBLE);
        }
    }


    
}