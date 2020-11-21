package com.example.root.myapplication;

import android.widget.ListView;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class Category extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lst;
    String category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Bundle bundle=getIntent().getExtras();
        category=bundle.getString("name");
        if(category.equalsIgnoreCase("Clothing")) {

            String[] productname={"Tops","Bottomwear","Dresses"};
            String[] desc={" "," "," "};
            Integer[] imgid={R.drawable.clothing,R.drawable.footwear,R.drawable.accessories};
            lst = (ListView) findViewById(R.id.l);
            CustomListview customListview = new CustomListview(this, productname, desc, imgid);
            lst.setAdapter(customListview);
            lst.setOnItemClickListener(this);
        }
        else if(category.equalsIgnoreCase("Accessories")) {

            String[] productname={"Scarves","Hair Accessories","Jewellery"};
            String[] desc={" "," "," "};
            Integer[] imgid={R.drawable.scarf1,R.drawable.hair1,R.drawable.jwell1};
            lst = (ListView) findViewById(R.id.l);
            CustomListview customListview = new CustomListview(this, productname, desc, imgid);
            lst.setAdapter(customListview);
            lst.setOnItemClickListener(this);
        }
        else if(category.equalsIgnoreCase("Footwear")) {

            String[] productname={"Heels","Shoes","Flats"};
            String[] desc={" "," "," "};
            Integer[] imgid={R.drawable.heels1,R.drawable.shoes1,R.drawable.flats1};
            lst = (ListView) findViewById(R.id.l);
            CustomListview customListview = new CustomListview(this, productname, desc, imgid);
            lst.setAdapter(customListview);
            lst.setOnItemClickListener(this);
        }
        else if(category.equalsIgnoreCase("Programming")) {

            String[] productname={"JAVA","PHP","ANDROID"};
            String[] desc={"","",""};
            Integer[] imgid={R.drawable.java2,R.drawable.php1,R.drawable.android1};
            lst = (ListView) findViewById(R.id.l);
            CustomListview customListview = new CustomListview(this, productname, desc, imgid);
            lst.setAdapter(customListview);
            lst.setOnItemClickListener(this);
        }
        else if(category.equalsIgnoreCase("kids")) {

            String[] productname={"FairyTales","Picture Books"};
            String[] desc={"","",""};
            Integer[] imgid={R.drawable.fairy1,R.drawable.picture1};
            lst = (ListView) findViewById(R.id.l);
            CustomListview customListview = new CustomListview(this, productname, desc, imgid);
            lst.setAdapter(customListview);
            lst.setOnItemClickListener(this);
        }
        else if(category.equalsIgnoreCase("Other")) {

            String[] productname={"Novel","Sci-Fi"};
            String[] desc={"","",""};
            Integer[] imgid={R.drawable.novel,R.drawable.scifi};
            lst = (ListView) findViewById(R.id.l);
            CustomListview customListview = new CustomListview(this, productname, desc, imgid);
            lst.setAdapter(customListview);
            lst.setOnItemClickListener(this);
        }
        else if(category.equalsIgnoreCase("Mobiles")) {

            String[] productname={"OnePlus","Lenovo","Motorola"};
            String[] desc={" "," "," "};
            Integer[] imgid={R.drawable.one3,R.drawable.lenovo1,R.drawable.moto1};
            lst = (ListView) findViewById(R.id.l);
            CustomListview customListview = new CustomListview(this, productname, desc, imgid);
            lst.setAdapter(customListview);
            lst.setOnItemClickListener(this);
        }
        else if(category.equalsIgnoreCase("Computers")) {

            String[] productname={"Dell","HP","Lenovo"};
            String[] desc={" "," "," "};
            Integer[] imgid={R.drawable.dell1,R.drawable.hp2,R.drawable.lenovolappy1};
            lst = (ListView) findViewById(R.id.l);
            CustomListview customListview = new CustomListview(this, productname, desc, imgid);
            lst.setAdapter(customListview);
            lst.setOnItemClickListener(this);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


        Intent intent=new Intent(Category.this,Home.class);
        Bundle bundle=new Bundle();
        bundle.putString("name",lst.getItemAtPosition(i).toString());
        bundle.putString("category",category);
        intent.putExtras(bundle);

        startActivity(intent);

    }

}