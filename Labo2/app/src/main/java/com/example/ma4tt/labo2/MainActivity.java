package com.example.ma4tt.labo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent childIntent;
    Button childButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        childButton = (Button)findViewById(R.id.goToChildActivity);
        childButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                childIntent = new Intent(MainActivity.this, ChildActivity.class);


                childIntent.putExtra("infoId", "Message from parent");

                startActivityForResult(childIntent, 1);


            }
        });



    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);
        if(requestCode == 1){
            switch (resultCode){
                case 0 :
                    Toast.makeText(MainActivity.this, "Result code = 0", Toast.LENGTH_LONG).show();
                    break;
                case 1 :
                    Toast.makeText(MainActivity.this, "Result code = 1", Toast.LENGTH_LONG).show();
                    break;
            }
        }


    }


}
