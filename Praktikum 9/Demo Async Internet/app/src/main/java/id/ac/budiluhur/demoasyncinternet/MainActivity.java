package id.ac.budiluhur.demoasyncinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConnectInternetTask c1;
    DownloadImageTask downloadImage;

    static TextView myText;
    static ImageView myImage;

    ConnectivityManager myConnManager;
    NetworkInfo myInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = (TextView) findViewById(R.id.myResult);
        myImage = (ImageView) findViewById(R.id.myImageResult);

        myConnManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        myInfo = myConnManager.getActiveNetworkInfo();

    }

    public void doSomething(View view) {
        c1 = new ConnectInternetTask(this);
        c1.execute("https://www.budiluhur.ac.id/");
    }

    public void downloadImage(View view) {
        if (myInfo != null && myInfo.isConnected()) {
            downloadImage = new DownloadImageTask();
            downloadImage.execute("https://media.istockphoto.com/photos/cybersecurity-digital-technology-security-picture-id1260460219?s=612x612");
        } else {
            Toast.makeText(this, "Internet Not Connected", Toast.LENGTH_SHORT).show();
        }
    }
}