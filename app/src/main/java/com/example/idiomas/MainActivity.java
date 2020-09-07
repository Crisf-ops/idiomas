package com.example.idiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtbienvebido;
    private Button btn_cambiar_idioma;
    private Intent intent;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        txtbienvebido = (TextView) findViewById(R.id.txtbienvebido);
        btn_cambiar_idioma = (Button) findViewById(R.id.button);

        intent = new Intent (Intent.ACTION_MAIN);
        intent.setClassName("com.android.settings", "com.android.settings.LanguageSettings");

        btn_cambiar_idioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(intent);
            }
        });
    }
}