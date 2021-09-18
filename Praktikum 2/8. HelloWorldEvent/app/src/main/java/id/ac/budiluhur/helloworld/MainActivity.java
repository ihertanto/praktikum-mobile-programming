package id.ac.budiluhur.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
    }

    public void actionTampil(View v){
        EditText txtNama = (EditText) findViewById(R.id.txtNama);
        TextView lblSalam = (TextView) findViewById(R.id.lblSalam);

        String nama = txtNama.getText().toString();
        lblSalam.setText("Hello, " + nama + ". Salam Budiluhur!" );
        Log.d("MainActivity", "Button OK ditekan!");
    }
}