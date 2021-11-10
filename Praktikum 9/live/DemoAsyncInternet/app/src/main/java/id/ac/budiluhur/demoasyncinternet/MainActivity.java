package id.ac.budiluhur.demoasyncinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    KoneksiInternetTask koneksi1;

    static TextView hasilWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasilWebsite = (TextView) findViewById(R.id.hasilWebsite);
    }

    public void koneksiWeb(View view) {
        koneksi1 = new KoneksiInternetTask(this);
        koneksi1.execute("https://www.google.com");
    }
}