package com.example.root.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText fname,lname,email,phone,pass,cpass;
    DatabaseHelper helper=new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fname=(EditText)findViewById(R.id.fname);
        lname=(EditText)findViewById(R.id.lname);
        email=(EditText)findViewById(R.id.email);
        phone=(EditText)findViewById(R.id.phone);
        pass=(EditText)findViewById(R.id.pass);
        cpass=(EditText)findViewById(R.id.cpass);

        Button register=(Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String sfname, slname, semail, sphone, spass, scpass;
                int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0, flag5 = 0, flag6 = 0;
                sfname = fname.getText().toString();
                slname = lname.getText().toString();
                semail = email.getText().toString();
                sphone = phone.getText().toString();
                spass = pass.getText().toString();
                scpass = cpass.getText().toString();


                if (sfname.equals(""))
                    fname.setError("Enter valid Name");
                else if (!sfname.equals(""))
                    flag1 = 1;
                if (slname.equals(""))
                    lname.setError("Enter valid Name");
                else if (!sfname.equals(""))
                    flag2 = 1;
                if (!semail.contains("@"))
                    email.setError("Enter valid Email");
                else if (semail.contains("@"))
                    flag3 = 1;
                if (sphone.length() < 10 || sphone.length() >10)
                    phone.setError("Enter valid Phone Number");
                else if (!(sphone.length() < 3))
                    flag4 = 1;
                if (spass.equals(""))
                    pass.setError("Password cannot be blank");
                else if (!spass.equals(""))
                    flag5 = 1;
                if (scpass.equals(""))
                    cpass.setError("Password cannot be blank");
                else if (!scpass.equals(""))
                    flag6 = 1;

                if (spass.equals(scpass)) {
                    if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1 && flag5 == 1 && flag6 == 1) {
                        Profile p = new Profile();

                        p.setFname(sfname);
                        p.setLname(slname);
                        p.setEmail(semail);
                        p.setPhone(sphone);
                        p.setPass(spass);
                        helper.insertInfoProfile(p);

                        fname.setText("");
                        lname.setText("");
                        email.setText("");
                        phone.setText("");
                        pass.setText("");
                        cpass.setText("");

                        Toast.makeText(getApplicationContext(), "inserted successfully", Toast.LENGTH_SHORT).show();
                    }


                }
                else {
                    Toast.makeText(getApplicationContext(), "Password didn't match", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}