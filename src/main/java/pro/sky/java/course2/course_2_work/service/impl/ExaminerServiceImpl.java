package pro.sky.java.course2.course_2_work.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.course_2_work.data.Question;
import pro.sky.java.course2.course_2_work.exceptions.IllegalCountOfQuestionException;
import pro.sky.java.course2.course_2_work.service.ExaminerService;
import pro.sky.java.course2.course_2_work.service.QuestionService;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final List<QuestionService> services;

    public ExaminerServiceImpl(List<QuestionService> questionServices) {
        this.services = questionServices;
    }


    @Override
    public Collection<Question> getQuestionSet(int amount) {

        if (amount <= 0) {
            throw new IllegalCountOfQuestionException("Некорректное количество вопросов");
        }

        Set<Question> questionForExam = new HashSet<>();
        Random random = new Random();

        while (questionForExam.size() < amount) {
            questionForExam.add(services.get(random.nextInt(services.size())).getRandomQuestion());
        }

        return questionForExam;
    }


}
