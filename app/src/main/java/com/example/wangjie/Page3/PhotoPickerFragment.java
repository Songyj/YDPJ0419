package com.example.wangjie.Page3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wangjie.R;

public class PhotoPickerFragment extends DialogFragment {
    public final static int REQUEST_IMAGE_SELECT = 2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
   /*     WindowManager m = getWindowManager();
        Display d = m.getDefaultDisplay(); // 获取屏幕宽、高用
        int h = (int) (d.getHeight() * 0.6); // 高度设置为屏幕的0.6
        int w = (int) (d.getWidth() * 0.65); // 宽度设置为屏幕的0.65*/
        View view = inflater.inflate(R.layout.activity_3_photopicker, container,false);
        view.findViewById(R.id.Btn_camera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        view.findViewById(R.id.Btn_album).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, REQUEST_IMAGE_SELECT);

            }
        });
        return view;
    }
        /*@Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (resultCode == RESULT_OK && requestCode == REQUEST_IMAGE_SELECT) {
                Log.i("qqliLog", "GalleryUri:    " + data.getData());
            }
        }*/
}
