package com.chenkr.demo.controller;

import com.chenkr.demo.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;

    @RequestMapping("/deleteSongList")
    public Map<String, Object> deleteSongList(String songListID) {
        Map resultMap = new HashMap();
        resultMap.put("success", songService.removeSongListBySongListID(songListID));
        return resultMap;
    }

}
