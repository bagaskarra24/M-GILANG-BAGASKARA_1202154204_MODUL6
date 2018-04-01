package com.example.gilang.gilang_1202154204_modul6.model;

/**
 * Created by USER on 4/1/2018.
 */

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties

public class Comment {
    public String uid;

    public String author;

    public String text;



    public Comment() {

        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)

    }



    public Comment(String uid, String author, String text) {

        this.uid = uid;

        this.author = author;

        this.text = text;

    }
}
