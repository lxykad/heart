package com.lxy.heart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private BezierView mHeartView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHeartView = (BezierView) findViewById(R.id.heart_view);
    }

    public void clickLike(View view) {
        //Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();

        mHeartView.addHeartView();

    }
}
