package com.example.root.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText name, pass;
    DatabaseHelper helper = new DatabaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        name = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.lpass);

        Button signin = (Button) findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sname, spass;
                int flag1 = 0, flag2 = 0;
                sname = name.getText().toString();
                spass = pass.getText().toString();

                if (sname.equals(""))
                    name.setError("Enter valid Name");
                else if (!sname.equals(""))
                    flag1 = 1;
                if (spass.equals(""))
                    pass.setError("Password cannot be blank");
                else if (!spass.equals(""))
                    flag2 = 1;

                if (flag1 == 1 && flag2 == 1) {
                    int loginresult = helper.searchpass(sname, spass);

                    if (loginresult == 1) {
                        Toast.makeText(getApplicationContext(), "successfully logged in", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, Navigation.class);
                        startActivity(intent);
                    } else if (loginresult == 2) {
                        Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Not present in DB", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}