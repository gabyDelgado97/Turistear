package com.example.gaby.turistear.capaPresentacion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gaby.turistear.R;

public class VentanaInfo1 extends Activity {

    private Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_info1);

        sig = (Button)findViewById(R.id.botonSiguiente);
        sig.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent inten = new Intent(VentanaInfo1.this,VentanaInfo2.class);
                startActivity(inten);

            }
        });
    }

}
