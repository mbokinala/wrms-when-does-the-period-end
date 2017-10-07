package com.mbokinala.wrmswhendoestheperiodend;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mbokinala.wrmswhendoestheperiodend.schedule.PeriodInfo;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        final int delay = 1000; //milliseconds

        final TextView currentPeriodTextView = (TextView) findViewById(R.id.currentPeriodTextView);

        handler.postDelayed(new Runnable(){
            public void run(){
                currentPeriodTextView.setText("It is currently " + PeriodInfo.getPeriod() +  " period.");
                handler.postDelayed(this, delay);
            }
        }, delay);
    }
}
