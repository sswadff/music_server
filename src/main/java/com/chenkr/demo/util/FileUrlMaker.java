package com.chenkr.demo.util;

import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileUrlMaker {
    private static String baseUrl = "http://192.168.200.128:8081/file";
    private static String src = "./target/classes/static/file";

    public List<File> getAllFile() {
        List<File> result = new ArrayList<>();
        searchFile(new File(src), result);
        return result;
    }

    public String makeUrl(File file) {
        StringBuilder physicsPath = new StringBuilder(file.getAbsolutePath());
        physicsPath.replace(0, physicsPath.lastIndexOf("/file")+5, baseUrl);
        return physicsPath.toString();
    }

    public List<StringBuilder> getAllFileUrl() {
        List<File> resultSet = new ArrayList();
        List<StringBuilder> result = new ArrayList();
        File root = new File(src);
        searchFile(root, resultSet);
        for (File tmp : resultSet) {
            result.add(new StringBuilder(tmp.getAbsolutePath()));
        }
        for (StringBuilder builder : result) {
            builder.replace(0, 62, baseUrl);
        }
        return result;
    }

    private void searchFile(File file, final List<File> resultSet) {
        if (file.isFile()) {
            resultSet.add(file);
            return;
        }
        for (File tmp : file.listFiles()) {
            if (tmp.isDirectory()) {
                searchFile(tmp, resultSet);
            } else {
                resultSet.add(tmp);
            }
        }
    }
}
