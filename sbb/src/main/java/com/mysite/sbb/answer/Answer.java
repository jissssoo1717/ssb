package com.mysite.sbb.answer;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import com.mysite.sbb.question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	@CreatedDate
	private LocalDateTime createDate;
	
	@ManyToOne // 하나의 질문(One)에 여러 개의 답변(Many)
	private Question question;
}
