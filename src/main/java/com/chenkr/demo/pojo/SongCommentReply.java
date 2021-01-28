package com.chenkr.demo.pojo;

import lombok.Data;

@Data
public class SongCommentReply {
    private String songID;
    private String commentID;
    private String replyID;
    private String userID;
    private String msg;
    private String createDate;
}
