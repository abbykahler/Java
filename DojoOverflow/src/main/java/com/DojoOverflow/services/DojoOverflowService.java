package com.DojoOverflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.DojoOverflow.models.Questions;
import com.DojoOverflow.repositories.AnswerRepository;
import com.DojoOverflow.repositories.QuestionRepository;
import com.DojoOverflow.repositories.TagsQuestionsRepository;
import com.DojoOverflow.repositories.TagsRepository;

@Service
public class DojoOverflowService {
	public DojoOverflowService(AnswerRepository answerRepository, QuestionRepository questionRepository, TagsRepository tagsRepository, TagsQuestionsRepository tagsQuestionsRepository) {
	}

	public List<Questions> allQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

}