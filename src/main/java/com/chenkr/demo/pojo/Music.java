package com.chenkr.demo.pojo;

import com.chenkr.demo.util.FileUrlMaker;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;

import java.io.File;

@Data
public class Music {
    public String name;
    public String url;
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
        name = file.getName();
        url = new FileUrlMaker().makeUrl(file);
    }

    public Music() {

    }

}
