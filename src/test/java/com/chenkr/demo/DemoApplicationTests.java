package com.chenkr.demo;

import com.chenkr.demo.util.FileUrlMaker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        FileUrlMaker fileUrlMaker = new FileUrlMaker();
        List<StringBuilder> list = fileUrlMaker.getAllFileUrl();

        for(StringBuilder builder:list){
            System.out.println(builder);
        }
    }

}
