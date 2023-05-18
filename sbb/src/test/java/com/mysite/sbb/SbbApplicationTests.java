package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

@SpringBootTest
class SbbApplicationTests {

	// DI => 테스트 코드의 경우 생성자를 통한 객체 주입 불가능, @Autowired 이용
	@Autowired
	private QuestionRepository questionRepository;
	
	@Transactional
	@Test
	void testJpa() {
		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
        Question q = qList.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
	}

}
