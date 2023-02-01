package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //JSON을 리턴하는 컨트롤러 생성
public class HelloController {

    @GetMapping("/hello") //HTTP GET 요청 받을 수 있는 API생성
    public String hello(){
        return "hello";
    }
}
