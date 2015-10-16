package com.horvat.demoapplication01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NovoOkno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_okno);
    }

    public void pojdiNazaj(View view) {
        finish();
    }

    public void toastaj(View view) {
        EditText stev=(EditText)findViewById(R.id.stevilo1);

        int val=Integer.parseInt(stev.getText().toString());

        Toast msg=Toast.makeText(this, "Komentar "+val*2, Toast.LENGTH_LONG);
        msg.show();
    }
}
