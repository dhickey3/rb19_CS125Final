    package com.example.rb19_cs125final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONObject;

    public class MainActivity extends AppCompatActivity {

        private TextView ratingsBox, nameBox, hoursBox;
        private ImageView imageBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Start menu activity
        Intent menuIntent = new Intent(this, GameActivity.class);
        startActivity(menuIntent);

        ImageView imageBox = findViewById(R.id.imageBox);
        ratingsBox = findViewById(R.id.ratingsBox);
        nameBox = findViewById(R.id.nameBox);
        hoursBox = findViewById(R.id.hoursBox);

        Button passButton = findViewById(R.id.passButton);
        Button chooseButton = findViewById(R.id.chooseButton);

        passButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getNewCommerce();
            }
        });

        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseCommerce();
            }
        });
    }

    private JSONObject getNewCommerce() {
        // Get new commerce info.

        return new JSONObject();
    }

    private void chooseCommerce() {
        return;
    }
}
