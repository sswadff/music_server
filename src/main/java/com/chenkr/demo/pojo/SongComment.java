package com.chenkr.demo.pojo;

import java.util.List;

public class SongComment {
    private String songID;
    private String commentID;
    private String userID;
    private String msg;
    private String createDate;
    private List<SongCommentReply> replies;
}
