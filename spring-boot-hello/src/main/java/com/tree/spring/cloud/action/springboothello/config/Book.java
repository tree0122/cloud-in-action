package com.tree.spring.cloud.action.springboothello.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Book {

    @Value("${book.name}")
    private String name;

    @Value("${book.author}")
    private String author;

    @Value("${book.desc}")
    private String desc;

    @Value("${blog.value}")
    private String value;

    @Value("${blog.number}")
    private int number;
}
