package com.sajjad.layouts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Toolbar mainToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainToolbar=findViewById(R.id.mainToolbar);
        setSupportActionBar(mainToolbar);


    }

    public void ClickMe(View view) {

    }

    public void Button2(View view) {
    }
}
