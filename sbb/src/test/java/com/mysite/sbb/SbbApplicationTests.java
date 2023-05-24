package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;

@SpringBootTest
class SbbApplicationTests {

	// DI => 테스트 코드의 경우 생성자를 통한 객체 주입 불가능, @Autowired 이용
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
    private AnswerRepository answerRepository;
	
	@Transactional
	 @Test
	    void testJpa() {        
		 Optional<Question> oq = this.questionRepository.findById(2);
	        assertTrue(oq.isPresent());
	        Question q = oq.get();

	        List<Answer> answerList = q.getAnswer();

	        assertEquals(1, answerList.size());
	        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	 }
}
