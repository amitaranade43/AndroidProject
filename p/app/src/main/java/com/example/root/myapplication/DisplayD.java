package com.example.root.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import junit.framework.Assert;

public class DisplayD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_d);
        Bundle bundle=getIntent().getExtras();
        TextView t=(TextView)findViewById(R.id.textView);
        ImageView iv=(ImageView)findViewById(R.id.imageView2);
        TextView t1=(TextView)findViewById(R.id.textView2);
        iv.setImageDrawable(getResources().getDrawable(bundle.getInt("image")));
        final String name=bundle.getString("productname");
        final String desc=bundle.getString("desc");
        t.setText(name);
        t1.setText(desc);
        Button button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DisplayD.this,Cart.class);
                Bundle bundle=new Bundle();
                bundle.putString("name",name);
                bundle.putString("price",desc);
                intent.putExtras(bundle);

                startActivity(intent);

            }
        });

    }

}