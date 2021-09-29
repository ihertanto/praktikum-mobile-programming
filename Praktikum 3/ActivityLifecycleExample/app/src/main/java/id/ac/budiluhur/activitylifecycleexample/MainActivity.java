package id.ac.budiluhur.activitylifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String tag = "logMethodLifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "onCreate dijalankan");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart dijalankan");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"onResume dijalankan");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"onPause dijalankan");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"onStop dijalankan");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"onRestart dijalankan");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"onDestroy dijalankan");
    }
}