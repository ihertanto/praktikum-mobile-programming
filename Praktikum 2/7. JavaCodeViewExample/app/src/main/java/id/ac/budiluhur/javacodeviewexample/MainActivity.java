package id.ac.budiluhur.javacodeviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView myText = new TextView(this);
        myText.setText("Display this Text!");
        setContentView(myText);

    }
}