package com.example.ma4tt.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ChildActivity extends AppCompatActivity {
    Button buttonSetResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Bundle bundle = this.getIntent().getExtras();
        String messageFromParent = bundle.getString("infoId");


        Toast.makeText(getApplicationContext(), messageFromParent, Toast.LENGTH_LONG).show();

        buttonSetResult = (Button)findViewById(R.id.end_parent_to_result_id);

        buttonSetResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(MainActivity.RESULT_OK);
                finish();
            }
        });


    }
}
