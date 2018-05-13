package com.dtatton89.daryl.shinigamifanapp;

import com.amazonaws.mobileconnectors.cognitoauth.AuthUserSession;
import com.amazonaws.mobileconnectors.cognitoauth.handlers.AuthHandler;

class callback implements AuthHandler {
    @Override
    public void onSuccess(AuthUserSession session) {
        // This will invoked to return tokens on successful authentication or when valid tokens are available locally.
        // 'session' will contain valid tokens for the user.
    }

    @Override
    public void onSignout() {
        // This will be invoked on successful sign-out.
    }

    @Override
    public void onFailure(Exception e) {
        // This will be invoked when error conditions. Probe the exception to get the exception details.
    }
}