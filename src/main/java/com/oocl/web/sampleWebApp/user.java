package com.oocl.web.sampleWebApp;

public class user {
    private  static int count = 0;


    public user(){
        this.id = count++;
    }
    public user( String username) {
        this.id = count++;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private int id;
    private String username;
}
