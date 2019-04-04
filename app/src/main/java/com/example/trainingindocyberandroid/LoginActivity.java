package com.example.trainingindocyberandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        //setOnCLickListener untuk memberi aksi
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equalsIgnoreCase("") ||
                password.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(LoginActivity.this, "Harap Isi Username dan Password", Toast.LENGTH_SHORT).show();
                }
                else {
                    //startActivity untuk pindah halaman
                    startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                    //destroy activity
                    finish();
                    //bikin toast
                    Toast.makeText(LoginActivity.this, "SELAMAT ANDA BERHASIL LOGIN", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
