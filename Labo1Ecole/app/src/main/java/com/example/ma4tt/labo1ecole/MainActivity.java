package com.example.ma4tt.labo1ecole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button boutonMainPage;
    private String variableTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("onCreateTag ", "onCreate is executed") ;
        setContentView(R.layout.activity_main);
        variableTest = "Salut Don Mattheo";
        boutonMainPage = (Button)findViewById(R.id.buttonActivityMain);
        boutonMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome! "+variableTest, Toast.LENGTH_SHORT).show();
                setContentView(R.layout.horizontallayout);
            }
        });
    }


}
