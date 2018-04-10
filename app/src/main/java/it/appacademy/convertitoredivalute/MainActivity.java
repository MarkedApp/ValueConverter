package it.appacademy.convertitoredivalute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


EditText moneyEuro;
TextView moneyDollari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moneyEuro = (EditText)findViewById(R.id.moneyEuro);

        moneyDollari = (TextView)findViewById(R.id.moneyDollari);


    }



    public void convertiValuta(View view) {

        Log.d("convertiValuta", "Click bottone Converti");

        String soldieuro = moneyEuro.getText().toString();

        Log.d("convertiValuta", "Lettura euro");

        double euro = Integer.parseInt(soldieuro);

        // dollari = euro * 1.18213;

        double dollari = euro * 1.18213;

        moneyDollari.setText(Double.toString(dollari));

        String soldidollari = moneyDollari.getText().toString();

        Log.d("convertiValuta", soldieuro + " Euro sono " + soldidollari + " Dollari!");

    }
}
