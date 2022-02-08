package com.example.file5c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Gestore gest;
    EditText txtNomeFile;
    Button btnLeggi;
    Button btnScrivi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.ciao);

    btnLeggi.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
String righelette = gest.leggiFile("prova.txt", getApplicationContext());

            textView.setText(righelette);
            }

    });




    }
}