package com.example.shared_preferences_you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEtFirstName,mEtLastName,mEtEmail,mEtPhoneNo;
    private Button mBtnProceedTo2nd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtFirstName=findViewById(R.id.etFistName);
        mEtLastName=findViewById(R.id.etLastName);
        mEtEmail=findViewById(R.id.etEmail);
        mEtPhoneNo=findViewById(R.id.etPhoneNo);
        mBtnProceedTo2nd=findViewById(R.id.BtnProceedTo2nd);

        mBtnProceedTo2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondAcivity.class);
                PreferenceHelper.writeStringToPreferences(MainActivity.this,"fname",mEtFirstName.getText().toString());
                PreferenceHelper.writeStringToPreferences(MainActivity.this,"lname",mEtLastName.getText().toString());
                PreferenceHelper.writeStringToPreferences(MainActivity.this,"email",mEtEmail.getText().toString());
                PreferenceHelper.writeIntToPreferences(MainActivity.this,"phoneNo", Integer.parseInt(mEtPhoneNo.getText().toString()));
                startActivity(intent);
            }
        });

    }
}