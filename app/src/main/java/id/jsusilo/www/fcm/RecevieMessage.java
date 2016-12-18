package id.jsusilo.www.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by jsusilo on 18/12/16.
 */

public class RecevieMessage extends FirebaseMessagingService {

    private static final String TAG = "FCMMessage";

    @Override
    public void onMessageReceived(RemoteMessage msg) {
        // TODO(developer): Handle FCM messages here.
        // If the application is in the foreground handle both data and notification messages here.
        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
        Log.d(TAG, "FCM Message From: " + msg.getFrom());
        Log.d(TAG, "FCM Message To: " + msg.getTo());
        Log.d(TAG, "FCM Message Data: " + msg.getData());
    }
}
