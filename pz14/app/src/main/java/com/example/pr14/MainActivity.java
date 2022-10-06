package com.example.pr14;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pr14.databinding.ActivityMainBinding;

public class MainActivity extends Activity implements View.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Button btnNext = (Button)findViewById(R.id.btn_next);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        Intent i = new Intent(this, table.class);
        startActivity(i);
    }
}