package com.example.demo.sts.service;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name = "grades")
public class Grade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "grd_num") private int grdNum;
	@Column(name = "stu_num") private int stuNum;
	@Column(name = "sub_num") private int subNum;
	@Column(name = "score") private int score;
	@Column(name = "grade") private String grade;
	@Column(name = "exam_date") private String examDate;
	@Column(name = "pass_exam") private String passExam;

	@Builder
	private Grade(int stuNum, int subNum, int score, String grade, String examDate, String passExam) {
		this.stuNum = stuNum;
		this.subNum = subNum;
		this.score = score;
		this.grade = grade;
		this.examDate = examDate;
		this.passExam = passExam;
	}

    public Grade(int stuNum, int subNum, String examDate, int score) {
    	this.stuNum = stuNum;
    	this.subNum = subNum;
    	this.examDate = examDate;
    	this.score = score;
    }
}