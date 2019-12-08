package com.example.android.heartrate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private static TextView textView1;

    private static TextView hrtrate;
    private static int hrtratescore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent=getIntent();
        int HRR=intent.getIntExtra(CameraActivity.EXTRA_NUMBER,0);
        textView1=(TextView) findViewById(R.id.HRR);
        textView1.setText("HEART RATE: "+ HRR);


        ImageButton returnCamera=(ImageButton) findViewById(R.id.returnCamera);
        returnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCAM();
            }
        });
    }
    public  void resetCAM(){
        Intent intent =new Intent(this,CameraActivity.class);
        startActivity(intent);
        finish();
    }
}
