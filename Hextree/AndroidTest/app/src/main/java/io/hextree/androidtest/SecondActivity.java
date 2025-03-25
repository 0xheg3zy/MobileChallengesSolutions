package io.hextree.androidtest;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        /////////////////////////////////flag 11 //////////////////////////
        //        Intent intent = new Intent();
        //        intent.putExtra("token",1094795585);
        //        setResult(RESULT_OK,intent);
        //        finish();
        ////////////////////////////////////////////////////////////////////



        /////////////////////////////////flag 12 ///////////////////////////
        //        Intent intent = new Intent();
        //        intent.putExtra("token",1094795585);
        //        setResult(RESULT_OK,intent);
        //        finish();
        ///////////////////////////////////////////////////////////////////



        /////////////////////////////////flag 22///////////////////////////
        //        Intent receivedIntent = getIntent();
        //        if (receivedIntent != null) {
        //            String flag = receivedIntent.getStringExtra("flag");
        //            Log.d("Flag22", flag);
        //        }else {
        //            Log.d("Flag22", "???");
        //        }
        ///////////////////////////////////////////////////////////////////



        ///////////////////////////////flag 23 //////////////////////////
        //        Intent receivedIntent = getIntent();
        //        PendingIntent pendingIntent = receivedIntent.getParcelableExtra("pending_intent");
        //        Intent newIntent = new Intent();
        //        newIntent.setAction("io.hextree.attacksurface.GIVE_FLAG");
        //        newIntent.putExtra("code", 42);
        //        try {
        //            pendingIntent.send(this, 0, newIntent);
        //        } catch (PendingIntent.CanceledException e) {
        //            e.printStackTrace();
        //        }
        ///////////////////////////////////////////////////////////////////

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}