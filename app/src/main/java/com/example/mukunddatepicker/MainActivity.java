package com.example.mukunddatepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

//Create a resource file with new drawable file
public class MainActivity extends AppCompatActivity {
EditText ma_et;
DatePickerDialog datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ma_et=findViewById(R.id.edit_date);
        ma_et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c=Calendar.getInstance();
                int mYear=c.get(Calendar.YEAR);
                int mMonth=c.get(Calendar.MONTH);
                int mDay=c.get(Calendar.DAY_OF_MONTH);

                    datePicker=new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int yr, int mon, int day) {
                            ma_et.setText(day+"/"+(mon+1)+"/"+yr);
                        }
                    },mYear,mMonth,mDay);
                    datePicker.show();
            }
        });
    }
}
