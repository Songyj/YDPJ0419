package com.example.wangjie.Page1;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wangjie.Public.SucceedActivity1;
import com.example.wangjie.R;

/**
 * Created by songyanjun on 2017/4/16.
 */

public class DoubleCheck1 extends DialogFragment{

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = inflater.inflate(R.layout.doublecheck, container,false);
        /*builder.setView(view).setNegativeButton("a", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }).setPositiveButton("b", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        */
        builder.setView(view);

        Button btnyes = (Button)view.findViewById(R.id.Btn_Yes);
        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                Intent intent = new Intent();
                intent.setClass(getContext(),SucceedActivity1.class);
                startActivity(intent);

            }
        });
        Button btnno = (Button)view.findViewById(R.id.Btn_No);
        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dismiss();

            }
        });
        return view;


    }
}
