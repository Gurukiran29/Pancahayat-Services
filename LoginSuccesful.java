package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LoginSuccesful extends AppCompatActivity {
    private Button servicesButton;
    private Button feedbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_succesful);

        servicesButton = findViewById(R.id.servicesButton);
        feedbackButton = findViewById(R.id.feedbackButton);

        servicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSuccesful.this, ServicesActivity.class);
                startActivity(intent);
            }
        });

        feedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSuccesful.this, FeedbackActivity.class);
                startActivity(intent);
            }
        });
    }
}
