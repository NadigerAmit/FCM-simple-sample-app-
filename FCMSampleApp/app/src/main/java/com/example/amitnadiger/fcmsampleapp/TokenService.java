package com.example.amitnadiger.fcmsampleapp;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/*
Each device need to be uniquely identified so that we can check success/failure and target individual user.
 Firebase provides FirebaseInstanceId class which takes care of creating unique device token for the current device.
The token is refreshed randomly based on duration or other things so to avoid checking each time for new token,
We have to use a Service class that extends FirebaseInstanceIdService.
In it, the onTokenRefresh is called each time a new token is generated.

So it’s time to create a new class in our project. Name it TokenService.java and have it extend FirebaseInstanceIdService. Here is our implementation
 */
public class TokenService extends FirebaseInstanceIdService {

    @Override
    public  void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.w("notification", refreshedToken);
        sendRegistrationTokenToServer(refreshedToken);
    }
    private void sendRegistrationTokenToServer(String token) {

    }
}
