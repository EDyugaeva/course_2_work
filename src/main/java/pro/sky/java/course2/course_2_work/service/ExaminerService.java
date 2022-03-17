package pro.sky.java.course2.course_2_work.service;

import pro.sky.java.course2.course_2_work.data.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestionSet(int amount);
}
