package com.example.tgraydas.lab7;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startAlert();
    }
    public void startAlert() {
        int i = 5;
        Intent intent = new Intent(this, AlarmReceiver.class);
        intent.setAction("Alarm.Peter");
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 234324243, intent, 0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.setInexactRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + 1000, 1000, pendingIntent);
        Toast.makeText(this, "Alarm set in " + i + " seconds",
                Toast.LENGTH_LONG).show();
    }

}
