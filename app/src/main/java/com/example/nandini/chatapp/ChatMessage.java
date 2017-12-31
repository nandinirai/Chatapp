package com.example.nandini.chatapp;

import java.util.Date;

/**
 * Created by Nandini on 9/26/2017.
 */

public class ChatMessage {
    private String messageText;
    private String messgaeUser;
    private long messageTime;

    public ChatMessage(String messageText, String messgaeUser) {
        this.messageText = messageText;
        this.messgaeUser = messgaeUser;

        messageTime = new Date().getTime();
    }

    public ChatMessage() {
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessgaeUser() {
        return messgaeUser;
    }

    public void setMessgaeUser(String messgaeUser) {
        this.messgaeUser = messgaeUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
