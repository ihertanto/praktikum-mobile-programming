package id.ac.budiluhur.contohunittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAngka1, etAngka2;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAngka1 = (EditText) findViewById(R.id.etAngka1);
        etAngka2 = (EditText) findViewById(R.id.etAngka2);

        tvHasil = (TextView) findViewById(R.id.tvHasil);
    }

    public void prosesHitung(View view) {
        int angka1 = Integer.parseInt(etAngka1.getText().toString());
        Log.d("MainActivity", "prosesHitung: 1");
        int angka2 = Integer.parseInt(etAngka2.getText().toString());
        Log.d("MainActivity", "prosesHitung: 2");
        int hasil = Calculator.tambah(angka1, angka2);
        Log.d("MainActivity", "prosesHitung: 3");

        tvHasil.setText("" + hasil);
        Log.d("MainActivity", "prosesHitung: 4");
    }
}