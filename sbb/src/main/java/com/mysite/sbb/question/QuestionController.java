package com.mysite.sbb.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor // quesionRepository 속성을 포함하는 생성자 생성
									   // final이 붙은 속성을 포함하는 생성자를 자동으로 생성(DI)
@Controller
public class QuestionController {
	
	private final QuestionRepository questionRepository;

	@GetMapping("/question/list")
	public String list(Model model) {
		
		List<Question> questionList = this.questionRepository.findAll();
		model.addAttribute("questionList", questionList);
		
		return "question_list";
	}
}
