package com.example.android.sunshine.app;

/**
 * Created by vadim on 12/03/2015.
 */
public class MessageEvent {
    public static final int STARTING_SYNC = 100;
    public static final int ENDING_SYNC = 101;
    public final int message;

    public MessageEvent(int message) {
        this.message = message;
    }
}