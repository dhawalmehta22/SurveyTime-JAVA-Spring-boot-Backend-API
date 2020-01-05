package com.application.SurveySystem.Repository;

import com.application.SurveySystem.Model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions,Integer> {
}
