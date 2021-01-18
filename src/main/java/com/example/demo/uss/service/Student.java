package com.example.demo.uss.service;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stu_num") private int stuNum;
	@Column(name = "mgr_num") private int mgrNum;
	@Column(name = "userid") private String userid;
	@Column(name = "password") private String password;
	@Column(name = "name") private String name;
	@Column(name = "gender") private String gender;
	@Column(name = "birthday") private String birthday;
	@Column(name = "regDate") private String regDate;
	@Column(name = "profile_image") private String profileImage;

	@Builder
	private Student(int mgrNum, String userid, String password, String name,
					String regDate, String birthday, String profileImage) {
		this.mgrNum = mgrNum;
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.regDate = regDate;
		this.birthday = birthday;
		this.profileImage = profileImage;
	}

    public Student(String userid, String password, String name, String birthday,
			String gender, String regDate, String profileImage,int mgrNum) {
    	this.userid = userid;
    	this.password = password;
    	this.name = name;
    	this.birthday = birthday;
    	this.gender = gender;
    	this.regDate = regDate;
    	this.profileImage = profileImage;
    	this.mgrNum = mgrNum;
    }
}