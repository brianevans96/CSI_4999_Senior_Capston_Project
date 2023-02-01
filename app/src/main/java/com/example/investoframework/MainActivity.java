package com.example.investoframework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button getStartedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getStartedBtn = findViewById(R.id.getStartedBtn);




    }

    public void goTosignIn(View view) {
        startActivity(new Intent(getApplicationContext(), SignInActivity.class));
    }
}