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
import java.util.List;

@RestController
@RequestMapping("/music")
@CrossOrigin
public class PlayerController {

    @Autowired
    FileUrlMaker fileUrlMaker;

    @RequestMapping("/public")
    public String getPublicSongList(String userid) {
        if (userid.equals("124001")) {
            List<File> list = fileUrlMaker.getAllFile();
            List<Music> musicList = new ArrayList<>();
            for (File file : list) {
                Music music = new Music(file);
                musicList.add(music);
            }
            return JSON.toJSONString(musicList);
        } else return null;
    }
}
