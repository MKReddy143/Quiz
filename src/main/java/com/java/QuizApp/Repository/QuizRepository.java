package com.java.QuizApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.QuizApp.Model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
