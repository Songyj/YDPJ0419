package com.example.wangjie.Page3;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import com.example.wangjie.Page3.Date.DateCallBack;
import com.example.wangjie.Page3.Date.DatePickerFragment;
import com.example.wangjie.Public.DoubleCheckFragment;
import com.example.wangjie.R;
import static android.content.ContentValues.TAG;
public class MyFragment3 extends Fragment implements DateCallBack {
    private Spinner spinner;
    private ArrayAdapter adapter;
    private String[] mStringArray;
    TextView dateText;
    Button photo, check;
    View view;
    public MyFragment3() {
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onAttach: ");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_3_main, container, false);
        Log.e(TAG, "第三个页面");
        initSpinner();
        dateText = (TextView)view.findViewById(R.id.text_time);
        dateText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                DatePickerFragment datePickerFragment = new DatePickerFragment();
                datePickerFragment.show(getFragmentManager(), "date_picker");
            }
        });
        photo = (Button) view.findViewById(R.id.Btn_upload);
        photo.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         new PhotoPickerFragment().show(getChildFragmentManager(), "photo_picker");
                                     }
                                 }
        );
        check = (Button) view.findViewById(R.id.Btn_submit);
        check.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         new DoubleCheckFragment().show(getChildFragmentManager(), "doublecheck");
                                     }
                                 }
        );
        return view;
    }

    private void initSpinner() {

        spinner = (Spinner) view.findViewById(R.id.text_spinner);
        mStringArray = getResources().getStringArray(R.array.test_string_array);
        adapter = new TextArrayAdapter(getActivity(), mStringArray);
        spinner.setAdapter(adapter);

        spinner.setDropDownVerticalOffset(70);
        spinner.setPadding(30, 0, 0, 0);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //curyid = position;
                //showPrice(position);
                /*TextView tv = (TextView) view;
                tv.setTextColor(getResources().getColor(R.color.green));//设置颜色
                tv.setTextSize(16.0f);   //设置大小*/


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

    }

    //实现DataCallBack的getData方法
    @Override
    public void getData(String data) {
        //data即为fragment调用该函数传回的日期时间
        dateText.setText(data);
    }
}
