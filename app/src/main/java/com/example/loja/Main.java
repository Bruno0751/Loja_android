package com.example.loja;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main extends AppCompatActivity {

    private Button btOk, btComras;
    private RadioGroup rg;
    private RadioButton btVermelho, btAzul, btVerde;
    private ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        btOk = (Button)(findViewById(R.id.ok));
        btComras = (Button)(findViewById(R.id.comras));
        rg = (RadioGroup) (findViewById(R.id.rg));
        btVermelho = (RadioButton) (findViewById(R.id.vermelho));
        btAzul = (RadioButton)(findViewById(R.id.azul));
        btVerde = (RadioButton) (findViewById(R.id.verde));
        img1 = (ImageView) (findViewById(R.id.img1));
        img2 = (ImageView) (findViewById(R.id.img2));

        btVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setBackgroundResource(R.color.red);
            }
        });
        btVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setBackgroundResource(R.color.green);

            }
        });
        btAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setBackgroundResource(R.color.blue);

            }
        });
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int op = rg.getCheckedRadioButtonId();
                switch(op) {
                    case R.id.vermelho:
                        img2.setBackgroundResource(R.color.red);
                        break;
                    case R.id.verde:
                        img2.setBackgroundResource(R.color.green);
                        break;
                    case R.id.azul:
                        img2.setBackgroundResource(R.color.blue);
                        break;
                }
            }
        });
        btComras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*AlertDialog.Builder msg = new AlertDialog.Builder(Main.this);
                msg.setTitle("Atenção");
                msg.setMessage("opção ainda não implementada");
                msg.setNeutralButton("ok", null);
                msg.show();*/
                Intent form = new Intent(Main.this, Formulario.class);
                startActivity(form);
            }
        });
    }
}
