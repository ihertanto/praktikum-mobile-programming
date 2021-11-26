package id.ac.budiluhur.mysharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String SHARED_PREFERENCE = "MySharedPreference";
    final String NAMA = "nama";
    final String UMUR = "umur";


    EditText etNama, etUmur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.etNama);
        etUmur = (EditText) findViewById(R.id.etUmur);
    }

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences sh = getSharedPreferences(SHARED_PREFERENCE, MODE_PRIVATE);
        String nama = sh.getString(NAMA, "");
        int umur = sh.getInt(UMUR, 0);

        etNama.setText(nama);
        etUmur.setText(String.valueOf(umur));

        Toast.makeText(this, "Data Restore!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sh = getSharedPreferences(SHARED_PREFERENCE, MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sh.edit();
        myEdit.putString(NAMA, etNama.getText().toString());
        myEdit.putInt(UMUR, Integer.parseInt(etUmur.getText().toString()));
        myEdit.apply();
        Toast.makeText(this, "Data Tersimpan!", Toast.LENGTH_SHORT).show();
    }
}