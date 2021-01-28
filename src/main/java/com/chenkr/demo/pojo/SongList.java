package com.chenkr.demo.pojo;

import lombok.Data;

import java.util.List;
@Data
public class SongList {
    private String songListID;
    private String songListName;
    private String iconURL;
    private String introduction;
    private List<Song> songs;
}
