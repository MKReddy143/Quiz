package com.java.QuizApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.QuizApp.Model.Quiz;
import com.java.QuizApp.Service.QuizService;

@Controller
public class QuizController {
	@Autowired
	private QuizService service;

	@GetMapping("/")
	public String QuizHome(Model model) {
		Quiz quiz = service.GetById(1);
		model.addAttribute("Quiz", quiz);
		return "Quiz";
	}

	@PostMapping("/CheckAnswers")
	public String CheckAnswers(@RequestParam("id") int id, @RequestParam("option") String option, Model model) {

		Quiz quiz = null;
		String answer = service.getAnswer(id);
		if (answer.equals(option)) {
			id = id + 1;
			if (id == 11)
				return "ThankYou";
			quiz = service.GetById(id);

		} else {
			quiz = service.GetById(id);
		}

		model.addAttribute("Quiz", quiz);
		return "Quiz";
	}

}
