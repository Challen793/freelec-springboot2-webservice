package com.jojoldu.book.springboot;

import com.jojoldu.book.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class) //JUnit에 내장된 실행자가 아닌 SpringRunner 실행자 사용, 스트링부트테스트와 JUnit을 연결하는 역할?
@WebMvcTest(controllers = HelloController.class) //Web에 집중할 수 있는 어노테이션
public class HelloControllerTest {

    @Autowired //스프링이 관리하는 Bean을 주입
    private MockMvc mvc; //스프링 MVC 테스트의 시작점, HTTP요청 관련 API테스트 가능

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) // /hello 주소로 GET 요청
                .andExpect(status().isOk()) //HTTP 헤더의 Status를 검증
                .andExpect(content().string(hello)); //응답 본문의 내용을 검증
    }


}
