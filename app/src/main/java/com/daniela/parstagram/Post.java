package com.daniela.parstagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {
    //Define keys
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";

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

    //Setters
    public void setDescription(String description){
        put(KEY_DESCRIPTION, description);
    }
    public void setImage(ParseFile image){
        put(KEY_IMAGE, image);
    }
    public void setUser(ParseUser user){
        put(KEY_DESCRIPTION, user);
    }
}
