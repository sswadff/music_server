package com.chenkr.demo.mapper;

import com.chenkr.demo.pojo.Song;
import com.chenkr.demo.pojo.SongList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongMapper {


    /**
     * Insert a song to a song list by user
     */
    boolean insertSongToSongList(String songListID, Song song);


    /**
     * Select all the songlist which belong to user
     * params:{userID}
     *
     * @return
     */
    List<SongList> selectUserSongList(String userID);

    /**
     * Select Song in specify SongList mark by songListID
     * params:{songListID}
     *
     * @return
     */
    List<Song> selectSongBySongListID(String songListID);

    /**
     * Delete a songlist.
     * in user_songlist
     *
     * @param songListID
     * @return
     */
    boolean deleteSongListBySongListID(String songListID);


}
