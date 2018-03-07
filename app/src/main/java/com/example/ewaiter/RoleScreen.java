package com.example.ewaiter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class RoleScreen extends AppCompatActivity {

    Button f_hostButton;
    Button f_managerButton;
    Button f_serverButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_screen);

        f_hostButton = (Button) findViewById(R.id.host);

        f_hostButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent myIntent = new Intent(RoleScreen.this, FloorScreen.class);
                startActivity(myIntent);
            }
        });

        f_managerButton = (Button) findViewById(R.id.manager);

        f_managerButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent myIntent = new Intent(RoleScreen.this, FloorScreen.class);
                startActivity(myIntent);
            }
        });

        f_serverButton = (Button) findViewById(R.id.server);

        f_serverButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent myIntent = new Intent(RoleScreen.this, FloorScreen.class);
                startActivity(myIntent);
            }
        });

    }

}
