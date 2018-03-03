package com.example.ewaiter;

import java.util.Vector;
import android.widget.Button;
import android.view.MenuItem;


/**
 * Created by lugnu_000 on 3/2/2018.
 */

public class Manager {

    private Vector<FoodItem> menu;

    private String f_managerName;
    private String f_employeeId;
    private String f_Password;


    public Manager(String name, String employeeId, String password){
        this.f_managerName = name;
        this.f_employeeId = employeeId;
        this.f_Password = password;
    }

}

