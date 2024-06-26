package com.example.sumarrestarnumeros;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    EditText et1, et2;
    TextView tv1;
    Button btnsuma, btnresta, btnmultiplicar, btndividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.txtnumero1);
        et2=(EditText)findViewById(R.id.txtnumero2);
        tv1=(TextView) findViewById(R.id.lblresultado);

        btnsuma=(Button) findViewById(R.id.btnsuma);
        btnsuma.setOnClickListener(this);

        btnresta=(Button) findViewById(R.id.btnrestar);
        btnresta.setOnClickListener(this::resta);

        btnmultiplicar=(Button) findViewById(R.id.btnmultiplicar);
        btnmultiplicar.setOnClickListener(this::multiplicar);

        btndividir=(Button) findViewById(R.id.btndividir);
        btndividir.setOnClickListener(this::dividir);
    }
    @Override
    public void onClick(View v) {
        et1=(EditText)findViewById(R.id.txtnumero1);
        et2=(EditText)findViewById(R.id.txtnumero2);
        float n1,n2,res;
        n1=Float.parseFloat(et1.getText().toString());
        n2=Float.parseFloat(et2.getText().toString());
        res=n1+n2;
        tv1.setText("El resultado es: " + res);

        Toast.makeText(getApplicationContext(), "Ha Presionado el boton",Toast.LENGTH_SHORT).show();
    }
    public void resta(View view){
        et1=(EditText)findViewById(R.id.txtnumero1);
        et2=(EditText)findViewById(R.id.txtnumero2);
        float n1,n2,res;
        n1=Float.parseFloat(et1.getText().toString());
        n2=Float.parseFloat(et2.getText().toString());
        res=n1-n2;
        tv1.setText("El resultado es: " + res);

        Toast.makeText(getApplicationContext(), "Ha Presionado el boton",Toast.LENGTH_SHORT).show();
    }
    public void multiplicar(View view){
        et1=(EditText)findViewById(R.id.txtnumero1);
        et2=(EditText)findViewById(R.id.txtnumero2);
        float n1,n2,res;
        n1=Float.parseFloat(et1.getText().toString());
        n2=Float.parseFloat(et2.getText().toString());
        res=n1*n2;
        tv1.setText("El resultado es: " + res);

        Toast.makeText(getApplicationContext(), "Ha Presionado el boton",Toast.LENGTH_SHORT).show();
    }
    public void dividir(View view){
        et1=(EditText)findViewById(R.id.txtnumero1);
        et2=(EditText)findViewById(R.id.txtnumero2);
        float n1,n2,res;
        n1=Float.parseFloat(et1.getText().toString());
        n2=Float.parseFloat(et2.getText().toString());
        res=n1/n2;
        tv1.setText("El resultado es: " + res);

        Toast.makeText(getApplicationContext(), "Ha Presionado el boton",Toast.LENGTH_SHORT).show();
    }
}