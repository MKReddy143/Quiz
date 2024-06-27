package com.java.QuizApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.QuizApp.Model.Quiz;
import com.java.QuizApp.Repository.QuizRepository;

@Service
public class QuizService {

	@Autowired
	private QuizRepository repo;

	public Quiz GetById(int id) {
		Quiz quiz = repo.findById(id).get();
		return quiz;
	}

	public String getAnswer(int id) {
		Quiz quiz = repo.findById(id).get();
		return quiz.getAnswer();
	}
}
