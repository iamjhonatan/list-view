package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {
    EditText editTextSignIn;
    EditText editTextSignInPassword;
    EditText editTextConfirmPassword;
    TextView textViewPassDifferent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        editTextSignIn = findViewById(R.id.editTextSignIn);
        editTextSignInPassword = findViewById(R.id.editTextSignInPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        textViewPassDifferent = findViewById(R.id.textViewPassDifferent);
    }


    public void buttonSignInCreate(View view) {
        String editTextName = editTextSignIn.getText().toString();
        String editPassword = editTextSignInPassword.getText().toString();
        String editConfirmPassword = editTextConfirmPassword.getText().toString();
        TextView passDifferent = textViewPassDifferent;

        if (editPassword != editConfirmPassword){
            passDifferent.setVisibility(View.VISIBLE);
        }
        else {
            Intent intent = new Intent(SignIn.this,
                    MainActivity.class);
            startActivity(intent);

        }
    }
}