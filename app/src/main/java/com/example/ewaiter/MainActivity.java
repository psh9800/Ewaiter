package com.example.ewaiter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button f_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f_login = (Button) findViewById(R.id.login);

        f_login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent myIntent = new Intent(MainActivity.this, RoleScreen.class);
                startActivity(myIntent);
            }
        });

    }
}




