package com.example.tgraydas.lab7;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

public class Boot extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context, "Booting Completed", Toast.LENGTH_LONG).show();
    }

}
