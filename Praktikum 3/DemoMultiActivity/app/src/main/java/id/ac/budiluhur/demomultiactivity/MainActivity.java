package id.ac.budiluhur.demomultiactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String tag = "logContohMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "onCreate dijalankan");
    }

    public void tampilActivityDua(View v) {
        Intent intent = new Intent(this, ActivityDua.class);
        startActivity(intent);
        Log.d(tag, "tampilActivityDua dijalankan");
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

    public void tampilShareWeb(View view) {
        Uri webpage = Uri.parse("http://www.budiluhur.ac.id");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
        Log.d(tag,"tampilShareWeb dijalankan");
    }

    public void bukaTelpon(View view) {
        Uri noTelp = Uri.parse("tel:0815645322");
        Intent intent = new Intent(Intent.ACTION_DIAL, noTelp);
        startActivity(intent);
        Log.d(tag,"bukaTelpon dijalankan");
    }

    public void bukaPeta(View view) {
        String addressString = "Universitas Budi Luhur";

        Uri.Builder builder = new Uri.Builder();
        builder.scheme("geo")
                .path("0,0")
                .appendQueryParameter("q", addressString);
        Uri addressUri = builder.build();

        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        startActivity(intent);
        Log.d(tag, "bukaPeta dijalankan " + addressUri.toString());
    }

    public void tampilShareText(View view) {
        String mimeType = "text/plain";

        String title = "Belajar Android Activity";
        String textToShare = "Belajar Activity dan Intent Implicit";

        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(title)
                .setText(textToShare)
                .startChooser();

        Log.d(tag, "tampilShareText dijalankan ");


    }
}