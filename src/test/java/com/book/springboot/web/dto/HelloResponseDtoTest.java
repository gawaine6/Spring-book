package com.book.springboot.web.dto;

import com.book.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombok_test() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        // assertThat - assertj 라는 테스트 검증 라이브러리 검증 메소드, isEqualTo랑 연결해서 사용개눙
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
