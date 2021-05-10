package sg.edu.rp.c346.id20004713.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    TimePicker timePicker;
    Button btnDisDate;
    Button btnDisTime;
    TextView tvOutput;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        btnDisDate = findViewById(R.id.btnDisDate);
        btnDisTime = findViewById(R.id.btnDisTime);
        tvOutput = findViewById(R.id.tvOutput);
        btnReset = findViewById(R.id.btnReset);

        // ___________________   When Button Time is Click.   ___________________________
        btnDisTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int getTimeHour = timePicker.getCurrentHour();
                int getTimeMinute = timePicker.getCurrentMinute();

                String output = String.format("Time is %d:%d", getTimeHour, getTimeMinute);
                tvOutput.setText(output);
            }
        });

        // ___________________ Then Button Date is Clicked. ___________________________
        btnDisDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int getDateYear = datePicker.getYear();
                int getDateMonth = datePicker.getMonth() + 1;
                int getDateDay = datePicker.getDayOfMonth();

                String output = String.format("Date is %d/%d/%d",getDateDay, getDateMonth,
                        getDateYear);

                tvOutput.setText(output);
            }
        });
    }
}