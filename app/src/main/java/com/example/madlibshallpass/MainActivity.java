package com.example.madlibshallpass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    // public static final String EXTRA_MESSAGE = "com.example.madlibhallpass.MESSAGE";
    public static final String EXTRA_MName = "com.example.madlibhallpass.MName";
    public static final String EXTRA_MNoun = "com.example.madlibhallpass.MNoun";
    public static final String EXTRA_MEvent = "com.example.madlibhallpass.MEvent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clearButonClicked(View view) {
        // Clear the three input boxes when this button ic clicked
        EditText inputName = (EditText) findViewById(R.id.editTextEnterName);
        EditText inputNoun = (EditText) findViewById(R.id.editTextEnterNoun);
        EditText inputEvent = (EditText) findViewById(R.id.editTextEnterEvent);

        inputName.setText("");
        inputNoun.setText("");
        inputEvent.setText("");

        inputName.requestFocus();

    }

    public void displayHallPassButtonClicked (View view) {
        // Take the values of the three input boxes and give them to the display page

        Intent showHallPass = new Intent(this, DisplayHallPass.class);

        EditText inputName = (EditText) findViewById(R.id.editTextEnterName);
        EditText inputNoun = (EditText) findViewById(R.id.editTextEnterNoun);
        EditText inputEvent = (EditText) findViewById(R.id.editTextEnterEvent);

        String mName = inputName.getText().toString();
        String mNoun = inputNoun.getText().toString();
        String mEvent = inputEvent.getText().toString();

        /*
        showHallPass.putExtra(EXTRA_MESSAGE, mName);
        showHallPass.putExtra(EXTRA_MESSAGE, mNoun);
        showHallPass.putExtra(EXTRA_MESSAGE, mEvent);
        */

        showHallPass.putExtra(EXTRA_MName, mName);
        showHallPass.putExtra(EXTRA_MNoun, mNoun);
        showHallPass.putExtra(EXTRA_MEvent, mEvent);


        //showHallPass.putExtra(EXTRA_MESSAGE, new String[] {mName, mNoun, mEvent});

        startActivity(showHallPass);

    }




}