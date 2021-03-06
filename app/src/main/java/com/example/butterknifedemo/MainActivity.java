package com.example.butterknifedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static class ViewHolder {
        @BindView(R.id.textView1)
        TextView textView1;
        @BindView(R.id.button1)
        Button button1;
        @BindView(R.id.button2)
        Button button2;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
