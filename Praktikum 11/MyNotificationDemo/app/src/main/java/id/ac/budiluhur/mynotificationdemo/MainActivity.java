package id.ac.budiluhur.mynotificationdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    final String CHANNEL_ID = "Contoh Channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createNotificationChannel();
    }

    private void createNotificationChannel() {
        // Create NotificationChannel, tapi hanya di versi API 26+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Contoh Channel";
            String description = "Deskripsi Channel";

            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name,
                    NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }

    public void doNotification(View view) {
        NotificationManagerCompat myManager = NotificationManagerCompat.from(this);

        NotificationCompat.Builder myNotif = new NotificationCompat.Builder(this, CHANNEL_ID);
        myNotif.setSmallIcon(android.R.drawable.ic_btn_speak_now);
        myNotif.setContentTitle("1 Message Baru");
        myNotif.setContentText("Hi, apa kabar?");
        myNotif.setStyle(new NotificationCompat.BigTextStyle()
            .bigText("Tersedia di Android 8.0 (API level 26) dan lebih tinggi.\u200B\n" +
                    "\n" +
                    "Set tingkat intrusi, seperti suara dan visibilitas untuk semua notifikasi yang diposting di saluran.\u200B\n" +
                    "\n" +
                    "Rentang dari IMPORTANCE_NONE(0) hingga IMPORTANCE_HIGH(4).\u200B\n" +
                    "\n" +
                    "Untuk mendukung versi Android sebelumnya (Lebih rendah dari API level 26), tetapkan prioritas (Notification priority).\u200B")
                .setBigContentTitle("Title Big")
                .setSummaryText("Summary")

        );

        Intent i1 = new Intent(this, MainActivity.class);
        PendingIntent pd = PendingIntent.getActivity(this, 1, i1, 0);
        myNotif.setContentIntent(pd);
        myNotif.setAutoCancel(true);

        myManager.notify(1, myNotif.build());
        finish();
    }
}