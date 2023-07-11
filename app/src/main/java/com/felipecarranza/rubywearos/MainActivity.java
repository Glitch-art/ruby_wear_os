package com.felipecarranza.rubywearos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.felipecarranza.rubywearos.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
        button = binding.button2;
        button.setOnClickListener(v -> goToStartupActivity());
    }

    protected void goToStartupActivity() {
        Intent intent = new Intent(this, StartupActivity.class);
        startActivity(intent);
    }

}