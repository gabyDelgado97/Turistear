package com.example.gaby.turistear.capaPresentacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gaby.turistear.R;

public class VentanaInfo2 extends AppCompatActivity {

    private Button sig2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_info2);

        sig2=(Button)findViewById(R.id.botonSiguiente2);
        sig2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent inten = new Intent(VentanaInfo2.this,VentanaInfo3.class);
                startActivity(inten);

            }
        });
    }
}
