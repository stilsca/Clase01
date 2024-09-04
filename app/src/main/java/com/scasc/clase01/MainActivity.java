package com.scasc.clase01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnEnviar=findViewById(R.id.btEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et=findViewById(R.id.etNombre);
                Toast.makeText(getApplicationContext(), "Hola "+et.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        Button btnSumar=findViewById(R.id.btSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etNum1=findViewById(R.id.etNum1);
                EditText etNum2=findViewById(R.id.etNum2);
                String sumaFalsa=etNum1.getText().toString()+etNum2.getText().toString();
                int num1=Integer.parseInt(etNum1.getText().toString());
                int num2=Integer.parseInt(etNum2.getText().toString());
                int suma=num1+num2;
                Toast.makeText(getApplicationContext(), "La suma es: "+sumaFalsa+" 😂 mentira es: "+suma, Toast.LENGTH_SHORT).show();
            }
        });
    }


}