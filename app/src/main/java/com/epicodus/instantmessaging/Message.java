package com.epicodus.instantmessaging;

import org.parceler.Parcel;

/**
 * Created by Guest on 12/7/16.
 */
@Parcel
public class Message {
    String userName;
    String message;
    int time;

    public Message(){}

    public Message(String userName, String message, int time) {
        this.userName = userName;
        this.message = message;
        this.time = time;
    }


    public String getUserName() {
        return userName;
    }

    public String getMessage() {
        return message;
    }

    public int getTime() {
        return time;
    }
}
