package com.chenkr.demo.controller;

import com.alibaba.fastjson.JSON;
import com.chenkr.demo.pojo.Music;
import com.chenkr.demo.util.FileUrlMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/music")
@CrossOrigin
public class PlayerController {

    @Autowired
    FileUrlMaker fileUrlMaker;


    @RequestMapping("/public")
    public String getPublicSongList() {
        List<File> list = fileUrlMaker.getAllFile();
        List<Map<String, String>> musicList = new ArrayList<>();

        for (File file : list) {
            Music music = new Music(file);
            Map musicObj = new HashMap();
            musicObj.put("id", list.indexOf(file));
            musicObj.put("name", music.getName());
            musicObj.put("url", music.getUrl());
            musicList.add(musicObj);
        }
        return JSON.toJSONString(musicList);
    }
}
