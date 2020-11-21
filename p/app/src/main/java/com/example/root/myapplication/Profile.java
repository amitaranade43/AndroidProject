package com.example.root.myapplication;

/**
 * Created by root on 10/10/17.
 */

public class Profile {

    String fname,lname,email,phone,pass;


    String getFname()
    {
        return this.fname;
    }
    void setFname(String fname)
    {
        this.fname=fname;
    }

    String getLname()
    {
        return this.lname;
    }
    void setLname(String lname)
    {
        this.lname=lname;
    }

    String getEmail()
    {
        return this.email;
    }
    void setEmail(String email)
    {
        this.email=email;
    }

    String getPhone()
    {
        return this.phone;
    }
    void setPhone(String phone)
    {
        this.phone=phone;
    }

    String getPass()
    {
        return this.pass;
    }
    void setPass(String pass)
    {
        this.pass=pass;
    }
}