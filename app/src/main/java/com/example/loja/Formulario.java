package com.example.loja;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ToggleButton;

public class Formulario extends AppCompatActivity {

    private Button somar, exit;
    private CheckBox cbbotas, cbsaia, cbjaqueta, cbcalca, cbcamisa, cbvestido;
    private ToggleButton cheap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_formulario);

        somar = (Button)(findViewById(R.id.somar));
        cbbotas = (CheckBox)(findViewById(R.id.botas));
        cbsaia = (CheckBox)(findViewById(R.id.saia));
        cbjaqueta = (CheckBox)(findViewById(R.id.jaquetas));
        cbcalca = (CheckBox)(findViewById(R.id.calças));
        cbcamisa = (CheckBox)(findViewById(R.id.camisetas));
        cbvestido = (CheckBox)(findViewById(R.id.vestidos));
        cheap = (ToggleButton)(findViewById(R.id.desconto));
        exit = (Button)(findViewById(R.id.sair));

        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = 0;
                if(cbbotas.isChecked()){
                    total += 120;
                }if(cbsaia.isChecked()) {
                    total += 55;
                }if(cbjaqueta.isChecked()) {
                    total += 110;
                }if(cbcalca.isChecked()) {
                    total += 90;
                }if(cbcamisa.isChecked()) {
                    total += 60;
                }if(cbvestido.isChecked()) {
                    total += 100;
                }
                if(cheap.isChecked()){
                    total *= 0.9;
                }
                AlertDialog.Builder msg = new AlertDialog.Builder(Formulario.this);
                msg.setTitle("Atenção");
                msg.setMessage("o valor total é : " + total);
                msg.setNeutralButton("ok", null);
                msg.show();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        cheap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cheap.isChecked()) {
                    cheap.setBackgroundResource(R.color.green);
                    cheap.setTextColor(getResources().getColor(R.color.black));
                }else {
                    cheap.setBackgroundResource(R.color.white);
                }
            }
        });
    }
}
