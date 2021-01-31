package com.chenkr.demo.service.impl;

import com.chenkr.demo.mapper.SongMapper;
import com.chenkr.demo.pojo.SongList;
import com.chenkr.demo.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {
    @Autowired
    SongMapper songMapper;

    @Override
    public boolean removeSongListBySongListID(String songListID) {
        return songMapper.deleteSongListBySongListID(songListID);
    }

    @Override
    public List<SongList> getUserSongList(String userID) {
        return songMapper.selectUserSongList(userID);
    }
}
