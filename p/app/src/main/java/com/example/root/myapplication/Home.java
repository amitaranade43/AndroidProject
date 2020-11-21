package com.example.root.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.String.*;

public class Home extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lst;
    String[] productname;
    String[] desc;
    Integer[] imgid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Bundle bundle=getIntent().getExtras();
        String i=bundle.getString("category");
        String name=bundle.getString("name");
        if(i.equalsIgnoreCase("Other"))
        {
            if(name.equalsIgnoreCase("Novel")) {
                productname =new String[] {"Middlemarch by George Eliot.","Anna Karenina by Leo Tolstoy","The Portrait of a Lady by Henry James","Heart of Darkness by Joseph Conrad","In Search of Lost Time by Marcel Proust","Jane Eyre by Charlotte Brontë"};
                desc = new String[]{"550","340","500","900","240","800"};
                imgid = new Integer[]{R.drawable.novel1, R.drawable.novel2, R.drawable.novel3, R.drawable.novel4, R.drawable.novel5, R.drawable.novel6};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Sci-Fi")) {
                productname =new String[] {"Farthing","Gemina","The Martian"};
                desc = new String[]{"1000","1400","1500"};
                imgid = new Integer[]{R.drawable.scifi1, R.drawable.scifi2,R.drawable.scifi3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
        }
        else if(i.equalsIgnoreCase("Mobiles"))
        {
            if(name.equalsIgnoreCase("OnePlus")) {
                productname =new String[] {"One Plus One","One Plus two","One Plus Three"};
                desc = new String[]{"18000","20000","28000"};
                imgid = new Integer[]{R.drawable.one1, R.drawable.one2, R.drawable.one3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Lenovo")) {
                productname =new String[] {"K6 Note","K6 Power","K5 Note"};
                desc = new String[]{"13000","11000","10000"};
                imgid = new Integer[]{R.drawable.lenovo1, R.drawable.lenovo2,R.drawable.lenovo3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Motorola")) {
                productname =new String[] {"G5","XPlay"};
                desc = new String[]{"15000","30000"};
                imgid = new Integer[]{R.drawable.moto1, R.drawable.moto2};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
        }
        else if(i.equalsIgnoreCase("Computers"))
        {
            if(name.equalsIgnoreCase("Dell")) {
                productname =new String[] {"Dell Inspiron Core i3 6th Gen","Dell Inspiron APU Dual Core A9"};
                desc = new String[]{"33000","30000"};
                imgid = new Integer[]{ R.drawable.dell1, R.drawable.dell2};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("HP")) {
                productname =new String[] {"HP Core i3 6th Gen ","HP Notebook 15","HP APU Quad Core A8"};
                desc = new String[]{"30000","27000","28000"};
                imgid = new Integer[]{R.drawable.hp2, R.drawable.hp3,R.drawable.hp2};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Lenovo")) {
                productname =new String[] {"Lenovo Core i3 6th Gen","Lenovo Ideapad 320E"};
                desc = new String[]{"30990","26000"};
                imgid = new Integer[]{R.drawable.lenovolappy1, R.drawable.lenovolappy2};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
        }
        else if(i.equalsIgnoreCase("Kids"))
        {
            if(name.equalsIgnoreCase("FairyTales")) {
                productname =new String[] {"Cinderella","Snow White","Rapunzel"};
                desc = new String[]{"200","200","200"};
                imgid = new Integer[]{R.drawable.fairy1, R.drawable.fairy2, R.drawable.fairy3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Picture Books")) {
                productname =new String[] {"Shapes in the Sky","Go away big green monster","Calm Down Time"};
                desc = new String[]{"100","100","100"};
                imgid = new Integer[]{R.drawable.picture1, R.drawable.picture2, R.drawable.picture3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }

        }
        else if(i.equalsIgnoreCase("Programming"))
        {
            if(name.equalsIgnoreCase("JAVA")) {
                productname =new String[] {"Head First Java","Thinking in Java","Learning java"};
                desc = new String[]{"700","550","600"};
                imgid = new Integer[]{R.drawable.java1, R.drawable.java2, R.drawable.java3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("PHP")) {
                productname =new String[] {"Head First PHP","Learning PHP 7"};
                desc = new String[]{"1070","1200"};
                imgid = new Integer[]{R.drawable.php1, R.drawable.php2};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("ANDROID")) {
                productname =new String[] {"Head First Android","Hello Android"};
                desc = new String[]{"2000","1460"};
                imgid = new Integer[]{R.drawable.android1, R.drawable.android2};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
        }
        else if(i.equalsIgnoreCase("clothing")) {
            if(name.equalsIgnoreCase("tops")) {
                productname = new String[]{"Blue Top", "Red Top", "Black Top", "White Top", "Pink Top", "Green Top"};
                desc = new String[]{"400","500","300","600","400","350"};
                imgid = new Integer[]{R.drawable.clothing2, R.drawable.clothing5, R.drawable.clothing1, R.drawable.clothing6, R.drawable.clothing4, R.drawable.clothing3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Bottomwear")) {
                productname = new String[]{"Blue Jeans", "Red Jeans", "Black Jeans", "White Jeans", "Shorts", "Skirt"};
                desc =new String[] {"800","780","607","506","560","700"};
                imgid = new Integer[]{R.drawable.jeans1, R.drawable.jeans2, R.drawable.jeans3, R.drawable.jeans4, R.drawable.jeans5, R.drawable.jeans6};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Dresses")) {
                productname = new String[]{"Blue Dress", "Red Dress", "Black Dress", "White Dress", "Pink Dress", "Orange Dress"};
                desc = new String[]{"1500","2000","2800","1600","800","1000"};
                imgid = new Integer[]{R.drawable.dress1, R.drawable.dress2, R.drawable.dress3, R.drawable.dress4, R.drawable.dress5, R.drawable.dress6};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
        }
        else if(i.equalsIgnoreCase("Footwear")) {

            if(name.equalsIgnoreCase("Heels")) {
                productname = new String[]{"Blue heels", "Black Heels", "White Heels"};
                desc = new String[]{"900","1000","800"};
                imgid = new Integer[]{R.drawable.heels1, R.drawable.heels2, R.drawable.heels3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Shoes")) {
                productname = new String[]{"Blue Shoes", "Black Shoes", "White Shoes"};
                desc = new String[]{"700","760","900"};
                imgid = new Integer[]{R.drawable.shoes1, R.drawable.shoes2, R.drawable.shoes3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Flats")) {
                productname = new String[]{"Blue Flats", "Black Flats", "White Flats"};
                desc =new String[] {"400","500","600"};
                imgid = new Integer[]{R.drawable.flats1, R.drawable.flats2, R.drawable.flats3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
        }
        else if(i.equalsIgnoreCase("Accessories")) {
            if(name.equalsIgnoreCase("Scarves")) {
                productname = new String[]{"Blue Scarf", "Red Scarf", "Black Scarf"};
                desc = new String[]{"200","150","100"};
                imgid = new Integer[]{R.drawable.scarf1, R.drawable.scarf2, R.drawable.scarf3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Hair Accessories")) {
                productname =new String[] {"Blue Hairband", "Red HairBand", "Black Hairband"};
                desc = new String[]{"80", "70", "60"};
                imgid =new Integer[]{R.drawable.hair1, R.drawable.hair2, R.drawable.hair3};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
            else if(name.equalsIgnoreCase("Jewellery")) {
                productname =new String[] {"Gold Earring", "Silver Earring", "Pearl Necklace", "Simple Bracelet", "Bracelet", "Ring"};
                desc = new String[]{"20000","6000","11000","100","150","100"};
                imgid = new Integer[]{R.drawable.jwell1, R.drawable.jwell2, R.drawable.jwell3, R.drawable.jwell4, R.drawable.jwell5, R.drawable.jwell6};
                lst = (ListView) findViewById(R.id.listview);
                CustomListview customListview = new CustomListview(this, productname, desc, imgid);
                lst.setAdapter(customListview);
            }
        }

        lst.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


        Intent intent=new Intent(Home.this,DisplayD.class);
        Bundle bundle=new Bundle();
        bundle.putString("productname",productname[i]);
        bundle.putString("desc",desc[i]);
        bundle.putInt("image",imgid[i]);
        intent.putExtras(bundle);

        startActivity(intent);


    }
}