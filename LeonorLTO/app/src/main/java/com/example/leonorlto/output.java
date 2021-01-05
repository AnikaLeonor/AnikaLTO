package com.example.leonorlto;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class output extends AppCompatActivity {
    Button btnBack;
    TextView txtNameOutput, txtAddressOutput, txtBdateOutput, txtSexOutput, txtHeightOutput, txtWeightOutput, txtNationalityOutput, txtRestrictionsOutput, txtConditionsOutput, txtAGYOutput, txtExpirationOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        txtNameOutput = findViewById(R.id.txtNameOutput);
        txtAddressOutput = findViewById(R.id.txtAddressOutput);
        txtBdateOutput = findViewById(R.id.txtBdateOutput);
        txtSexOutput = findViewById(R.id.txtSexOutput);
        txtHeightOutput = findViewById(R.id.txtHeightOutput);
        txtWeightOutput = findViewById(R.id.txtWeightOutput);
        txtNationalityOutput = findViewById(R.id.txtNationalityOutput);
        txtRestrictionsOutput = findViewById(R.id.txtRestrictionsOutput);
        txtConditionsOutput = findViewById(R.id.txtConditionsOutput);
        txtAGYOutput = findViewById(R.id.txtAGYOutput);
        txtExpirationOutput = findViewById(R.id.txtExpirationOutput);

        String txtname, txtaddress, txtbdate, txtsex, txtheight, txtweight, txtnationality, txtrestrictions, txtconditions, txtagy, txtexpiration;

        txtname = getIntent().getExtras().getString("keyName");
        txtaddress = getIntent().getExtras().getString("keyAddress");
        txtbdate = getIntent().getExtras().getString("keyBdate");
        txtsex = getIntent().getExtras().getString("keySex");
        txtheight = getIntent().getExtras().getString("keyHeight");
        txtweight = getIntent().getExtras().getString("keyWeight");
        txtnationality = getIntent().getExtras().getString("keyNationality");
        txtrestrictions = getIntent().getExtras().getString("keyRestrictions");
        txtconditions = getIntent().getExtras().getString("keyConditions");
        txtagy = getIntent().getExtras().getString("keyAGY");
        txtexpiration = getIntent().getExtras().getString("keyExpiration");

        txtNameOutput.setText(txtname);
        txtAddressOutput.setText(txtaddress);
        txtBdateOutput.setText(txtbdate);
        txtSexOutput.setText(txtsex);
        txtHeightOutput.setText(txtheight);
        txtWeightOutput.setText(txtweight);
        txtNationalityOutput.setText(txtnationality);
        txtRestrictionsOutput.setText(txtrestrictions);
        txtConditionsOutput.setText(txtconditions);
        txtAGYOutput.setText(txtagy);
        txtExpirationOutput.setText(txtexpiration);



    }
    public void onClick(View view) {
        Intent intent = new Intent(output.this, MainActivity.class);
        startActivity(intent);
    }
}