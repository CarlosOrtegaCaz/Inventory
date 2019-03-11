package com.example.myinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {
    Button btnLogIn, btnExit;
    EditText usu, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        btnExit = findViewById(R.id.btnExit);
        btnLogIn = findViewById(R.id.btnLogIn);

        usu = findViewById(R.id.txtUsu);
        pass = findViewById(R.id.txtPass);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                finish();
            }
        });
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Log",usu.getText().toString());
                if(usu.getText().toString().equals("Admin") && pass.getText().toString().equals("123")){
                    Intent intentMenu = new Intent(LogInActivity.this, Menu.class);
                    LogInActivity.this.startActivity(intentMenu);
                    finish();
                } else {
                    Toast.makeText(LogInActivity.this, "Credenciales incorrectas, intentalo nuevamente", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
