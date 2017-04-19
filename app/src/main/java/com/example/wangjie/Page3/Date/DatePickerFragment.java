package com.example.wangjie.Page3.Date;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
/**
 * Created by songyanjun on 2017/1/11.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    private String date;
    @Override
    public Dialog onCreateDialog(Bundle bundle) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        this.setCancelable(false);
        return new DatePickerDialog(getActivity(), this, year, month, day){
            @Override
            protected void onStop() {
            }
        };
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        //使用的时候只需直接调用DatePickerFragment的show()方法
        //即可选择完日期后选择时间//判断activity是否是DataCallBack(这是自己定义的一个接口)的一个实例
        if (getActivity() instanceof DateCallBack) {
            //将activity强转为DataCallBack
            DateCallBack dataCallBack = (DateCallBack) getActivity();
            date = year + "年" + (monthOfYear + 1) + "月" + dayOfMonth + "日";
            //调用activity的getData方法将数据传回activity显示
            dataCallBack.getData(date);
        }


    }
}



