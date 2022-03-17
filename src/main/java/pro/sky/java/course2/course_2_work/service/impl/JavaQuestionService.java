package pro.sky.java.course2.course_2_work.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.course_2_work.data.JavaQuestionRepository;
import pro.sky.java.course2.course_2_work.data.Question;
import pro.sky.java.course2.course_2_work.service.QuestionService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

@Service
public class JavaQuestionService implements QuestionService {
    private final JavaQuestionRepository javaQuestionRepository;

    public JavaQuestionService(JavaQuestionRepository javaQuestionRepository) {
        this.javaQuestionRepository = javaQuestionRepository;
    }

    @Override
    public Question add(String question, String answer) {
        Question addedQuestion = new Question(question, answer);
        javaQuestionRepository.add(addedQuestion);
        return addedQuestion;
    }

    @Override
    public Question add(Question question) {
        javaQuestionRepository.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        javaQuestionRepository.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return javaQuestionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        ArrayList<Question> listQuestion = new ArrayList<>(javaQuestionRepository.getAll());
        Random ran = new Random();
        return listQuestion.get(ran.nextInt(javaQuestionRepository.getAll().size()));

    }
}
