package com.example.root.myapplication;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by root on 10/5/17.
 */

public class books extends Fragment {
    View myView;
    TextView tv1,tv2,tv3;
    ImageView iv1,iv2,iv3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.books,container,false);
        tv1=(TextView) myView.findViewById(R.id.textView4);
        tv2=(TextView) myView.findViewById(R.id.textView5);
        tv3=(TextView) myView.findViewById(R.id.textView6);
        iv1=(ImageView) myView.findViewById(R.id.imageView3);
        iv2=(ImageView) myView.findViewById(R.id.imageView4);
        iv3=(ImageView) myView.findViewById(R.id.imageView5);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),Category.class);
                intent.putExtra("name","Programming");

                startActivity(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),Category.class);
                intent.putExtra("name","Kids");
                startActivity(intent);
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),Category.class);
                intent.putExtra("name","Other");
                startActivity(intent);
            }
        });
        return myView;

    }


}
