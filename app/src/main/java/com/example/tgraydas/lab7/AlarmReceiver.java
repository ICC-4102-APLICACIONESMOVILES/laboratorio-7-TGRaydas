package com.example.tgraydas.lab7;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "WAKE UP", Toast.LENGTH_LONG).show();
        Notification(context);
    }
    public void Notification(Context context){
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, "channel_id")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("My notification")
                .setContentText("Hello World!");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (notificationManager != null) {
            notificationManager.notify(001, mBuilder.build());
        }
    }

}
