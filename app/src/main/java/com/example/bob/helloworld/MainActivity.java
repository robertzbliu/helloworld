package com.example.bob.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
    }

    public void showtoast(View view) {
        //Context context = getApplicationContext();
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
        Gson gson = new Gson();

    }
}
