package com.chenkr.demo.service;

import com.chenkr.demo.pojo.SongList;

import java.util.List;

public interface SongService {

    boolean removeSongListBySongListID(String songListID);

    List<SongList> getUserSongList(String userID);
}
