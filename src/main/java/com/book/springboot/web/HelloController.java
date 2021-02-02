package com.book.springboot.web;

import com.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어준다
// JSON : 경량의 데이터 교환방식, 클라이언트에서 서버로부터 스트링이 아닌 객체 형태로 데이터를 전달받고 싶을 때 사용하는 방식
public class HelloController {

    @GetMapping("/hello")
    // Get 요청을 받을 수 있는 API
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
