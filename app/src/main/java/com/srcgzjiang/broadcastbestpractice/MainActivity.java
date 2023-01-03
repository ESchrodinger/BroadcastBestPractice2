package com.srcgzjiang.broadcastbestpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forceOffline = findViewById(R.id.forceOffline);
        forceOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.example.broadcastbestpractice.FORCE_OFFLINE");
                //指定广播接收器
//                intent.setComponent(new ComponentName(getPackageName(),"com.srcgzjiang.broadcastbestpractice.BaseActivity"));
                sendBroadcast(intent);
            }
        });
    }
}
