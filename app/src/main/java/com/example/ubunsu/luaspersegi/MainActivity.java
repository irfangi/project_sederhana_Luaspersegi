package com.example.ubunsu.luaspersegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etPanjang,etLebar;
    private TextView tvHasil;
    private  Button btHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPanjang=(EditText) findViewById(R.id.etpanjang);
        etLebar=(EditText) findViewById(R.id.etlebar);
        tvHasil =(TextView) findViewById(R.id.tvhasil);
        btHasil=(Button) findViewById(R.id.bhitung);

        btHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang= etPanjang.getText().toString().trim();
                String lebar= etLebar.getText().toString().trim();

                Double p=Double.parseDouble(panjang);
                Double l=Double.parseDouble(lebar);

                Double luas = p*l;

                tvHasil.setText("Luas : "+luas);

            }
        });
    }
}
