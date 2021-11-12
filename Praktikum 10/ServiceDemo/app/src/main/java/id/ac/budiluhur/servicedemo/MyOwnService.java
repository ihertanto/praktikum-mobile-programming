package id.ac.budiluhur.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyOwnService extends Service {
    final String TAG = "MyOwnService";

    public MyOwnService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service dibuat!", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Service dibuat ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service sudah dimulai!", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Service sudah dimulai ");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service berhenti!", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Service berhenti!");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}