package com.example.ewaiter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button f_button1;
    private Button f_button2;
    private Button f_createButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       f_button1 = (Button) findViewById(R.id.Table1);
        f_button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //creating pop up view
                PopupMenu popup = new PopupMenu(MainActivity.this, f_button1);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());


                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item){
                        f_button1.setText(item.getTitle());
                        return true;
                    }
                });

                popup.show();
            }
        });

        f_button2 = (Button) findViewById(R.id.Table2);
        f_button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //creating pop up view
                PopupMenu popup = new PopupMenu(MainActivity.this, f_button2);
                popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());


                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item){
                        f_button2.setText(item.getTitle());
                        return true;
                    }
                });

                popup.show();
            }
        });

        f_createButton = (Button) findViewById(R.id.menuCreator);
        f_createButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //creating pop up view
                PopupMenu popup = new PopupMenu(MainActivity.this, f_createButton);
                popup.getMenuInflater().inflate(R.menu.foodcreator, popup.getMenu());


                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item){
                        String f_name ="";
                        String f_ID ="";
                        float f_price;



                        return true;
                    }
                });

                popup.show();
            }
        });
    }




    }




