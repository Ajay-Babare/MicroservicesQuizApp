package com.javalogist.quizservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javalogist.quizservice.model.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
