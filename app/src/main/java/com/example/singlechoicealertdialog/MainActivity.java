package com.example.singlechoicealertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnShowSingleChoiceDialog;
    String[] data = {"a", "b", "c"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowSingleChoiceDialog = findViewById(R.id.btnShowSingleChoiceDialog);
        btnShowSingleChoiceDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SingleChoiceDialog alertDialog = new SingleChoiceDialog(MainActivity.this, data);
                alertDialog.show(getSupportFragmentManager(), "single choice dialog");
                alertDialog.setCancelable(false);
            }
        });
    }
}