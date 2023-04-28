package com.example.biohomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.img);
        imageView.setImageResource(R.drawable.myimg);

    }

    public void ShowHobbies(View view) {
        TextView hobbiestext=findViewById(R.id.hobbies);
        EditText edithobbies=findViewById(R.id.editHobbies);
        edithobbies.setText(hobbiestext.getText().toString());
    }
}