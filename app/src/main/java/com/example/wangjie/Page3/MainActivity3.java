import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.wangjie.Page3.Date.DateCallBack;
import com.example.wangjie.Page3.Date.DatePickerFragment;
import com.example.wangjie.Page3.PhotoPickerFragment;
import com.example.wangjie.Page3.TextArrayAdapter;
import com.example.wangjie.Public.DoubleCheckFragment;
import com.example.wangjie.R;
public class MainActivity3 extends AppCompatActivity implements DateCallBack {

    private Spinner spinner;
    private ArrayAdapter adapter;
    private String[] mStringArray;;
    TextView dateText;
    Button photo,check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_3_main);
        initSpinner();
        dateText = (TextView)findViewById(R.id.text_time);
        dateText.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                DatePickerFragment datePickerFragment = new DatePickerFragment();
                datePickerFragment.show(getSupportFragmentManager(), "date_picker");
            }
        });
        photo = (Button)findViewById(R.id.Btn_upload);
        photo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                new PhotoPickerFragment().show(getSupportFragmentManager(),"photo_picker");}
        }
        );
        check = (Button)findViewById(R.id.Btn_submit);
        check.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v){
                                         new DoubleCheckFragment().show(getSupportFragmentManager(),"activity_p_doublecheck");}
                                 }
        );
        /*Window dialogWindow = ;
        WindowManager m = getWindowManager();
        Display d = m.getDefaultDisplay(); // 获取屏幕宽、高用
        WindowManager.LayoutParams p = dialogWindow.getAttributes(); // 获取对话框当前的参数值
        p.height = (int) (d.getHeight() * 0.6); // 高度设置为屏幕的0.6
        p.width = (int) (d.getWidth() * 0.65); // 宽度设置为屏幕的0.65

        dialogWindow.setAttributes(p);*/


    }

    private void initSpinner() {

        spinner = (Spinner)findViewById(R.id.text_spinner);
        mStringArray =getResources().getStringArray(R.array.test_string_array);
        adapter = new TextArrayAdapter(this,mStringArray);
        spinner.setAdapter(adapter);

        spinner.setDropDownVerticalOffset(70);
        spinner.setPadding(30,0,0,0);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                //curyid = position;
                //showPrice(position);
                TextView tv = (TextView)view;
                tv.setTextColor(getResources().getColor(R.color.green));//设置颜色
                tv.setTextSize(15.0f);   //设置大小
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

