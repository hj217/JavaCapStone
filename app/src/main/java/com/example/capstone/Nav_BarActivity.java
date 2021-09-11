package com.example.capstone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Nav_BarActivity extends AppCompatActivity {
TextView nav_ex;
TextView nav_info;
TextView nav_help;
TextView nav_logout;

int i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_bar);

        nav_ex = findViewById(R.id.nav_ex);



        nav_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), pp_mange.class);
                startActivity(intent);
            }
        });
    }

}
