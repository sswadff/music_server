package com.chenkr.demo.pojo;

import com.chenkr.demo.util.FileUrlMaker;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;

import java.io.File;

@Data
public class Music {
    public String songName;
    public String URL;
    @JsonIgnore
    public File file;

    public Music(File file) {
        if (file.isDirectory() || (!file.getName().endsWith(".mp3"))) {
            try {
                throw new Exception("File Exception");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        songName = file.getName();
        URL = new FileUrlMaker().makeUrl(file);
    }

    public Music() {

    }

}
