package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 2023-01-31 최초 작성
* 앞으로 만들 클래스의 메인 클래스
* 이 클래스는 프로젝트의 최상단에 위치해야 한다.
* */
@SpringBootApplication //스프링부트 자동설정, 스프링 빈 읽기와 생성 자동설정
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args); //스프링부트의 내장 WAS 실행, 외장 WAS였으면 설치하고 환경설정 하고.. 고생 했을듯
    }
}
