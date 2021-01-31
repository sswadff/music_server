package com.chenkr.demo.pojo;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String userID;
    private String userName;
    private String userPass;
    private String email;
    private String introduction;
    private List<User> friends;
    private List<SongList> mySongList;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public List<SongList> getMySongList() {
        return mySongList;
    }

    public void setMySongList(List<SongList> mySongList) {
        this.mySongList = mySongList;
    }
}
