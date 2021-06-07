package com.example.test;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

public class ReportWriter extends AppCompatActivity {
    private Button Commit;
    private EditText Views;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reportwriter);
        Commit=findViewById(R.id.button);
        Views=findViewById(R.id.View);
        Commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Views.getText().toString();
                System.out.println(name);
                if(Views.getText().toString().matches("")){
                    Toast.makeText(com.example.test.ReportWriter.this, "請輸入內容", Toast.LENGTH_SHORT).show();
                }
                else{
                    //輸出到管理者資料庫
                }
            }
        });

    }
}