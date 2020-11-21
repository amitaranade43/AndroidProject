package com.example.root.myapplication;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 10/4/17.
 */

public class CustomListview extends ArrayAdapter<String>{
    private  String[] productname={"Blue Top","Red Top","Black Top","White Top","Pink Top","Green Top"};
    String[] desc={"This is Blue Top \n Price:1000","This is Red Top\n Price:1000","This is Black Top\n Price:1000","This is White Top\n Price:1000","This is Pink Top\n Price:1000","This is Green Top\n Price:1000"};
    Integer[] imgid={R.drawable.clothing1,R.drawable.clothing2,R.drawable.clothing3,R.drawable.clothing4,R.drawable.clothing5,R.drawable.clothing6};
    private Activity context;
    public CustomListview( Activity context, String[] productname,String[] desc,Integer[] imgid) {
        super(context,R.layout.listview,productname);

        this.context=context;
        this.productname=productname;
        this.desc=desc;
        this.imgid=imgid;

    }
    public CustomListview(Activity context, ArrayList<String> productname, ArrayList<String> desc, ArrayList<Integer> imgid) {
        super(context,R.layout.listview,productname);

        this.context=context;
        this.productname=(String[]) productname.toArray();
        this.desc=(String[]) desc.toArray();
        this.imgid=(Integer[]) imgid.toArray();

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r=convertView;
        ViewHolder viewHolder=null;
        if(r==null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listview,null);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else
        {
            viewHolder=(ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(productname[position]);
        viewHolder.tvw2.setText(desc[position]);
        return r;
    }
    class ViewHolder{
        TextView tvw1,tvw2;
        ImageView ivw;
        ViewHolder(View v)
        {
            tvw1=(TextView) v.findViewById(R.id.name);
            tvw2=(TextView) v.findViewById(R.id.description);
            ivw=(ImageView)v.findViewById(R.id.imageView);
        }

    }
}
