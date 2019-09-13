package com.example.instagram.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.instagram.R;

public class AccountSettings extends AppCompatActivity {
   ImageView back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.account_settings);

         back = (ImageView) findViewById(R.id.options);
         back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                Intent intent = new Intent(AccountSettings.this, ProfileActivity.class);
                startActivity(intent);
             }
         });
    }
}
