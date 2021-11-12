package id.ac.budiluhur.mybroadcastreceiverdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BroadcastInBuilt broadcastInBuilt = new BroadcastInBuilt();
    CustomBroadcast1 customBroadcast1 = new CustomBroadcast1();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callInBuilt(View view) {
        Toast.makeText(this, "Silakan coba ubah baterai emulator menjadi 10%" +
                "dengan cara klik ..., Battery -> Charge Level", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_LOW);
        registerReceiver(broadcastInBuilt, filter);

        IntentFilter customFilter = new IntentFilter("id.ac.budiluhur.customReceiver.call");
        registerReceiver(customBroadcast1, customFilter);
    }

    @Override
    protected void onDestroy() {
        //Unregister receiver
        this.unregisterReceiver(broadcastInBuilt);
        this.unregisterReceiver(customBroadcast1);

        super.onDestroy();
    }

    public void callCustom(View view) {
        Intent i1 = new Intent();
        i1.setAction("id.ac.budiluhur.customReceiver.call");
        sendBroadcast(i1);
    }
}