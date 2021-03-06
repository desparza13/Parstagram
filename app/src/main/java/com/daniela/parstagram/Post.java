package com.daniela.parstagram;

import android.util.Log;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import org.parceler.Parcel;

import java.util.Date;

@Parcel (analyze = Post.class)
@ParseClassName("Post")
public class Post extends ParseObject {
    //Define keys
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_LIKES = "likes";

    public Post(){}

    //Getters
    public String getDescription(){
        return getString(KEY_DESCRIPTION);
    }
    public ParseFile getImage(){
        return getParseFile(KEY_IMAGE);
    }
    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }
    public Integer getLikes() { return  getInt(KEY_LIKES); }

    //Setters
    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }
    public void setImage(ParseFile image){
        put(KEY_IMAGE, image);
    }
    public void setUser(ParseUser user){
        put(KEY_USER, user);
    }
    public void setLikes(boolean liked) {put(KEY_LIKES, getLikes()+1);}

    //Get timestamp
    public static String calculateTimeAgo(Date createdAt) {
        int SECOND_MILLIS = 1000;
        int MINUTE_MILLIS = 60 * SECOND_MILLIS;
        int HOUR_MILLIS = 60 * MINUTE_MILLIS;
        int DAY_MILLIS = 24 * HOUR_MILLIS;
        try {
            createdAt.getTime();
            long time = createdAt.getTime();
            long now = System.currentTimeMillis();
            final long diff = now - time;
            if (diff < MINUTE_MILLIS) {
                return "just now";
            } else if (diff < 2 * MINUTE_MILLIS) {
                return "a minute ago";
            } else if (diff < 50 * MINUTE_MILLIS) {
                return diff / MINUTE_MILLIS + " m";
            } else if (diff < 90 * MINUTE_MILLIS) {
                return "an hour ago";
            } else if (diff < 24 * HOUR_MILLIS) {
                return diff / HOUR_MILLIS + " h";
            } else if (diff < 48 * HOUR_MILLIS) {
                return "yesterday";
            } else {
                return diff / DAY_MILLIS + " d";
            }
        } catch (Exception e) {
            Log.i("Error:", "getRelativeTimeAgo failed", e);
            e.printStackTrace();
        }
        return "";
    }
}
