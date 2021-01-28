package com.example.madlibshallpass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayHallPass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_hall_pass);

        // Get the intent
        Intent showHallPass = getIntent();

        String mName = showHallPass.getStringExtra(MainActivity.EXTRA_MName);
        String mNoun = showHallPass.getStringExtra(MainActivity.EXTRA_MNoun);
        String mEvent = showHallPass.getStringExtra(MainActivity.EXTRA_MEvent);

        // https://developer.android.com/reference/java/text/SimpleDateFormat
        String myOtherDate = new SimpleDateFormat("E MMMM dd").format(new Date());

        TextView textViewDateBox = findViewById(R.id.textViewDateBox);
        textViewDateBox.setText("Date: " + myOtherDate);

        TextView textViewFilledTextArea =findViewById(R.id.textViewFilledTextArea);
        textViewFilledTextArea.setText(mName + " is too cool for " + mNoun + " class.\nInstead, they will be attending the " + mEvent + " event.");



    }
}