package com.tree.spring.cloud.action.springboothello.web;

import com.tree.spring.cloud.action.springboothello.config.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class HelloController {

    @Resource
    private Book book;

    @RequestMapping("/hello")
    public String index(){
        log.info("book: {}", book);
        return "Hello World";
    }
}
