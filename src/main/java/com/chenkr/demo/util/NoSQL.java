package com.chenkr.demo.util;

import com.chenkr.demo.pojo.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NoSQL {
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    /**
     * Store list for user
     * K-V = userID-PlayList
     */
    public void setPlayListForUser(String userID, List<Song> list) {
        redisTemplate.opsForValue().set(userID, list);
    }

    public List<Song> getPlayListForUser(String userID) {
        return (List<Song>) redisTemplate.opsForValue().get(userID);
    }


}
