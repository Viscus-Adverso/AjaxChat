package com.company;


import java.sql.Timestamp;

/**
 * Created by Viscus on 10/17/16.
 */
public class Message {
    int id;
    String author;
    String text;
    Timestamp time;


    public Message() {
    }

    public Message(int id, String author, String text, Timestamp time) {
        this.id = id;
        this.author = author;
        this.text = text;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}
