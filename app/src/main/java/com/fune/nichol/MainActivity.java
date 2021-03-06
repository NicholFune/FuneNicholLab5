package com.fune.nichol;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Intent i = new Intent(this, MyCustomService.class);
        startService(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.ButtonAct2) {
            i = new Intent(this, Activity2.class);
            startActivity(i);
        } else if (v.getId() == R.id.ButtonMap) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.576° N, 120.9819° E"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);
        }
    }
}