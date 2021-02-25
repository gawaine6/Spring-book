package com.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 디폴트 생성자 만들어주는 용도
@Entity // 테이블과 링크될 클래스

// Posts 클래스는 실제 DB의 테이블과 매칭될 클래스이며, 이런 클래스를 Entity 클래스 라고도 한다
public class Posts extends BaseTimeEntity{
    @Id // 해당 테이블의 PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK생성규칙, 이거해야 auto_increment
    private Long id;

    @Column(length = 500, nullable = false) // 테이블의 컬럼을 나타내며 굳이 선언안해도 엔티티 클래스의 필드는 전부 컬럼으로 취급
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    // 빌더를 사용하면 어느 필드에 어떤 값을 넣어야하는지 정확하게 알 수 있다
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
