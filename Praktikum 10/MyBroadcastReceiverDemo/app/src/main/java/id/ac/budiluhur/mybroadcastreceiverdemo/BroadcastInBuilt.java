package id.ac.budiluhur.mybroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BroadcastInBuilt extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("testing", "onReceive: ");
        String intentAction = intent.getAction();

        Toast.makeText(context, "Battery is low, Please charge", Toast.LENGTH_LONG).show();
    }
}