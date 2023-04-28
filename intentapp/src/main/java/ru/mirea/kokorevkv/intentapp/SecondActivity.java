package ru.mirea.kokorevkv.intentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            String value  = bundle.getString("time");
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Квадрат моего номера по списку составляет " + 10 * 10 + " а текущее время: "+ value);
        }
    }
}
