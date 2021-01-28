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
}
