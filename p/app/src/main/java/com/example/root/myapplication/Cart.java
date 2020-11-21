package com.example.root.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cart extends AppCompatActivity {
    TextView name,price;
    TextView total;
    DatabaseHelper helper=new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle=getIntent().getExtras();
        setContentView(R.layout.activity_cart);
        name=(TextView) findViewById(R.id.editText_Name);
        price=(TextView) findViewById(R.id.editText_Price);
        total=(TextView)findViewById(R.id.total);
        name.setText(bundle.getString("name"));
        price.setText(bundle.getString("price"));
        Button show=(Button)findViewById(R.id.button_show);
        Button add=(Button)findViewById(R.id.button_add);
        Button order=(Button)findViewById(R.id.buttonOrder);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        Bill b = new Bill();

                       b.setname(name.getText().toString());
                        b.setPrice(Integer.parseInt(price.getText().toString()));
                        helper.insertInfoBill(b);

                        name.setText("");
                        price.setText("");

            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        int price= display();
                String temp=String.valueOf(price);
        total.setText(temp);

            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t=Integer.parseInt(total.getText().toString());
                if(t==0)
                {
                    Toast.makeText(Cart.this, "Your Cart is empty", Toast.LENGTH_LONG).show();
                }
                else {
                    helper.deleteTitle();
                    Toast.makeText(Cart.this, "Your Order has been successfully placed", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Cart.this, Navigation.class);
                    startActivity(intent);
                }
            }
        });

    }
    public int display() {
        String sname;
        Integer sprice;
        int totalPrice=0;
        SQLiteDatabase db = helper.getWritableDatabase();
        String selectQuery = "select name,price from bill";
        Cursor cursor = db.rawQuery(selectQuery, null);
        int c = cursor.getCount();
        StringBuffer buffer=new StringBuffer();
        if (c > 0) {
            if (cursor.moveToFirst()) {
                do {
                    sname = cursor.getString(0);
                    sprice = cursor.getInt(1);
                    totalPrice=totalPrice+sprice;
                    buffer.append("\nName:"+sname+"  Price:"+sprice);
                }
                while (cursor.moveToNext());
                showMessage("CART",buffer.toString());

            }
        } else {
            showMessage("Error","NO DATA FOUND");
        }
        return totalPrice;
    }
    public void showMessage(String title,String Message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}
