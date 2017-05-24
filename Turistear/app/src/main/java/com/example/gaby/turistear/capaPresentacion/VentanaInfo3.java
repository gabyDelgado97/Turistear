package com.example.gaby.turistear.capaPresentacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gaby.turistear.capaLogica.MapsActivity;
import com.example.gaby.turistear.R;

public class VentanaInfo3 extends AppCompatActivity {

    private Button sig3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_info3);

        sig3=(Button)findViewById(R.id.botonSiguiente3);
        sig3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent inten = new Intent(VentanaInfo3.this,MapsActivity.class);
                startActivity(inten);

            }
        });
    }
}
