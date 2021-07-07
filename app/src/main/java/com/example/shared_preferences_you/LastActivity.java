package com.example.shared_preferences_you;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastActivity extends AppCompatActivity {

    private TextView mtvName,mtvLastN,mtvEmail,mtvPhoneNo,mtvNoOfSeats,mtvDate;
    private Button mbtnConfirm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);
        mtvName = findViewById(R.id.tvName);
        mtvLastN = findViewById(R.id.tvLastN);
        mtvEmail = findViewById(R.id.tvEmail);
        mtvPhoneNo = findViewById(R.id.tvPhoneNo);
        mtvNoOfSeats = findViewById(R.id.NoOfSeats);
        mtvDate = findViewById(R.id.tvDate);
        mbtnConfirm = findViewById(R.id.btnConfirm);

        String fname = PreferenceHelper.getStringFromPreferences(LastActivity.this, "fname");
        String lname = PreferenceHelper.getStringFromPreferences(LastActivity.this, "lname");
        String email = PreferenceHelper.getStringFromPreferences(LastActivity.this, "email");
        String phNO = PreferenceHelper.getFromPreferences(LastActivity.this, "phoneNo")+"";
        String seats = PreferenceHelper.getFromPreferences(LastActivity.this, "NoOfSeats")+"";
        String date = PreferenceHelper.getStringFromPreferences(LastActivity.this, "Date")+"";

        mtvName.setText(fname);
        mtvLastN.setText(lname);
        mtvEmail.setText(email);
        mtvPhoneNo.setText(phNO);
        mtvNoOfSeats.setText(seats);
        mtvDate.setText(date);

        mbtnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(LastActivity.this)
                        .setTitle("Event Conformation")
                        .setMessage( "the event is confirmed on "+mtvDate.getText().toString())
                        .show();


            }
        });

    }
}