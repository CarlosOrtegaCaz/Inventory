package com.example.myinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button btnRegistrar, btnAsignar, btnVenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnAsignar = findViewById(R.id.btnAsignar);
        btnVenta = findViewById(R.id.btnVenta);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRegister = new Intent(Menu.this, RegistrarItem.class);
                Menu.this.startActivity(intentRegister);
                finish();
            }
        });
    }
}
