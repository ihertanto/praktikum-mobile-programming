package id.ac.budiluhur.spinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] operasi = {"+", "-", "/", "*"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerOperasiFillProgram = (Spinner) findViewById(R.id.spinnerOperasiFillProgram);
        spinnerOperasiFillProgram.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, operasi));
    }
}