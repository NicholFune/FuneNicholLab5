package com.fune.nichol;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.ButtonAct1) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.ButtonMap2) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.5892° N, 120.9700° E"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);
        }
    }
}
