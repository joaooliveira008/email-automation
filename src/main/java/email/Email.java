package com.emailautomation.email;

public class Email {
    private String sender;
    private String emailAddress;
    private String body;
    private boolean isRead;


    //CONSTRUTOR

    public Email (String sender, String emailAddress, String body, boolean isRead ) {

        this.sender = sender;
        this.emailAddress = emailAddress;
        this.body = body;
        this.isRead = isRead;

    }

    //GETTERS

    public String getSender() {
        return sender;
    }

    public String getBody() {
        return body;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public boolean isRead() {
        return isRead;
    }
}




