package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity  //DB가 해당 객체를 인식 가능
@AllArgsConstructor
@ToString
public class Article {

    @Id //기본적으로 entity에 주민번호같은 대표값을 지정
    @GeneratedValue  //id 자동생성 어노테이션(1,2,3....)
    private Long id;  //기본적으로 entity에 대표값이 있어야함

    @Column
    private String title;

    @Column
    private String content;

//    public Article(Long id, String title, String content) { //생성자 추가
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }

//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                "title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
