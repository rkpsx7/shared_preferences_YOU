package com.example.shared_preferences_you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondAcivity extends AppCompatActivity {

    private TextView mTvFirstName,mTvLastName,mTvEmail,mTvPhoneNo;
    private EditText mEtNoOfSeat,mEtDate;
    private Button mBtnProceedTo3rd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acivity);
        mTvFirstName = findViewById(R.id.TvFistName);
        mTvLastName = findViewById(R.id.TvLastName);
        mTvEmail = findViewById(R.id.TvEmail);
        mEtNoOfSeat = findViewById(R.id.etSeat);
        mEtDate = findViewById(R.id.etDate);
        mBtnProceedTo3rd = findViewById(R.id.BtnProTo3rd);

        String fname = PreferenceHelper.getStringFromPreferences(SecondAcivity.this,"fname");
        String lname = PreferenceHelper.getStringFromPreferences(SecondAcivity.this,"lname");
        String email = PreferenceHelper.getStringFromPreferences(SecondAcivity.this,"email");
        mTvFirstName.setText(fname);
        mTvLastName.setText(lname);
        mTvEmail.setText(email);


        mBtnProceedTo3rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondAcivity.this,LastActivity.class);
                PreferenceHelper.writeIntToPreferences(SecondAcivity.this,"NoOfSeats", Integer.parseInt(mEtNoOfSeat.getText().toString()));
                PreferenceHelper.writeStringToPreferences(SecondAcivity.this,"Date",mEtDate.getText().toString());
                startActivity(intent);
            }
        });

    }
}