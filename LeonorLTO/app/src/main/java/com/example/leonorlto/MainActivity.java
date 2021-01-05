package com.example.leonorlto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button btnSubmits;
    EditText editNames, editAddresss, editBdates, editSexs, editHeights, editWeights, editNationalitys, editRestrictionss, editConditionss, editAGYs, editExpirations;
    TextView txtError;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmits = findViewById(R.id.btnSubmits);
        editNames = findViewById(R.id.editName);
        editAddresss = findViewById(R.id.editAddress);
        editBdates = findViewById(R.id.editBdate);
        editSexs = findViewById(R.id.editSex);
        editHeights = findViewById(R.id.editHeight);
        editWeights = findViewById(R.id.editWeight);
        editNationalitys = findViewById(R.id.editNationality);
        editRestrictionss = findViewById(R.id.editRestrictions);
        editConditionss = findViewById(R.id.editConditions);
        editAGYs = findViewById(R.id.editAGY);
        editExpirations = findViewById(R.id.editExpiration);
        txtError = findViewById(R.id.txtError);

    }

    public void onClick(View view) {
        String name = editNames.getText().toString();
        String address = editAddresss.getText().toString();
        String bdate = editBdates.getText().toString();
        String sex = editSexs.getText().toString();
        String height = editHeights.getText().toString();
        String weight = editWeights.getText().toString();
        String nationality = editNationalitys.getText().toString();
        String restrictions = editRestrictionss.getText().toString();
        String conditions = editConditionss.getText().toString();
        String agy = editAGYs.getText().toString();
        String expiration = editExpirations.getText().toString();


        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(address) ||
                TextUtils.isEmpty(bdate) || TextUtils.isEmpty(sex) || TextUtils.isEmpty(height) ||
                TextUtils.isEmpty(weight) || TextUtils.isEmpty(nationality) || TextUtils.isEmpty(restrictions) || TextUtils.isEmpty(conditions) || TextUtils.isEmpty(agy) ||
                TextUtils.isEmpty(expiration)){
            txtError.setText("You must enter all fields!");
        }
        else{
            Intent intent = new Intent(MainActivity.this, output.class);
            intent.putExtra("keyNames", name);
            intent.putExtra("keyAddresss", address);
            intent.putExtra("keyBdates", bdate);
            intent.putExtra("keySexs", sex);
            intent.putExtra("keyHeights", height);
            intent.putExtra("keyWeights", weight);
            intent.putExtra("keyNationalitys", nationality);
            intent.putExtra("keyRestrictionss", restrictions);
            intent.putExtra("keyConditionss", conditions);
            intent.putExtra("keyAGYs", agy);
            intent.putExtra("keyExpirations", expiration);
            startActivity(intent);

        }
    }
}