package com.example.fourthguidedexercise;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etUsernameGE4, etPasswordGE4;
    Button btnLoginGE4;
    TextView tvResultGE4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsernameGE4 = findViewById(R.id.etUsernameGE4);
        etPasswordGE4 = findViewById(R.id.etPasswordGE4);
        btnLoginGE4 = findViewById(R.id.btnLoginGE4);
        tvResultGE4 = findViewById(R.id.tvResultGE4);

        btnLoginGE4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsernameGE4.getText().toString().trim();
                String password = etPasswordGE4.getText().toString().trim();

                if (username.equals("papsi") && password.equals("papsi")) {
                    tvResultGE4.setText("WELCOME PAPSI!");
                    tvResultGE4.setTextColor(Color.GREEN);
                } else {
                    tvResultGE4.setText("USERNAME AND PASSWORD DOES NOT EXIST!");
                    tvResultGE4.setTextColor(Color.RED);
                }
            }
        });
    }
}
