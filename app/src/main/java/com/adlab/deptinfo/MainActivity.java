package com.adlab.deptinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String str[]={"Select Branch","CSE","ME","EEE"};
    Spinner sp1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1 =(Spinner) findViewById(R.id.s1);
        ArrayAdapter<String> adp = new ArrayAdapter<>(getApplicationContext(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,str);
        sp1.setAdapter(adp);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int index = adapterView.getSelectedItemPosition();
                if(index==1)
                {
                    Intent n1= new Intent(getApplicationContext(),CSE.class);
                    startActivity(n1);
                }
                if(index==2)
                {
                    Intent n2 = new Intent(getApplicationContext(),ME.class);
                    startActivity(n2);
                }
                if(index==3)
                {
                    Intent n3 = new Intent(getApplicationContext(),EEE.class);
                    startActivity(n3);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}