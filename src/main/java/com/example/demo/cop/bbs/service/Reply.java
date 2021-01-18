package com.example.demo.cop.bbs.service;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name = "replies")
public class Reply extends Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rep_num") private int repNum;
    @Column(name = "content") private String content;
    @Column(name = "art_num") private int artNum;
}