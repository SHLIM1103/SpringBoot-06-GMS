package com.example.demo.sym.service;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name = "teachers")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tea_num") private int teaNum;
	@Column(name = "subNum") private int subNum;
	@Column(name = "name") private String name;
	@Column(name = "password") private String password;
	@Column(name = "profile_image") private String profileImage;

	@Builder
	public Teacher(int subNum, String name, String password, String profileImage) {
		this.subNum = subNum;
		this.name = name;
    	this.password = password;
    	this.profileImage = profileImage;
    }

	public Teacher(String name, String password, String profileImage, int subNum) {
		this.name = name;
		this.password = password;
		this.subNum = subNum;
		this.profileImage = profileImage;
	}
}