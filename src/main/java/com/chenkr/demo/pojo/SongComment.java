package com.chenkr.demo.pojo;

import lombok.Data;

import java.util.List;
@Data
public class SongComment {
    private String songID;
    private String commentID;
    private String userID;
    private String msg;
    private String createDate;
    private List<SongCommentReply> replies;
}
