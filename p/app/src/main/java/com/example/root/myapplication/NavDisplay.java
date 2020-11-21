package com.example.root.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by root on 10/12/17.
 */

public class NavDisplay extends Fragment {
    View myView;
    ImageView iv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        myView=inflater.inflate(R.layout.navdisplay,container,false);
        iv=(ImageView) myView.findViewById(R.id.imageView6);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"You can avail this offer very soon",Toast.LENGTH_LONG).show();
            }
        });
        return myView;
    }
}
