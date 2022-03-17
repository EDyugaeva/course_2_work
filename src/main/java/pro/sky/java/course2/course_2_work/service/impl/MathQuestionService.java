package pro.sky.java.course2.course_2_work.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.course_2_work.data.Question;
import pro.sky.java.course2.course_2_work.exceptions.MethodNotAllowedException;

import java.util.Collection;
import java.util.Random;

@Service
public class MathQuestionService implements pro.sky.java.course2.course_2_work.service.QuestionService {

    @Override
    public Question add(String question, String answer) {
        throw new MethodNotAllowedException("Метод не доступен");
    }

    @Override
    public Question add(Question question) {
        throw new MethodNotAllowedException("Метод не доступен");
    }

    @Override
    public Question remove(Question question) {
        throw new MethodNotAllowedException("Метод не доступен");

    }

    @Override
    public Collection<Question> getAll() {
        throw new MethodNotAllowedException("Метод не доступен");
    }

    @Override
    public Question getRandomQuestion() {
        Random ran = new Random();
        int randomNumberFirst = ran.nextInt(1_000);
        int randomNumberSecond = ran.nextInt(1_000);
        int mathSign = ran.nextInt(4);

        switch (mathSign) {
            case 0:
                return new Question(randomNumberFirst + " + " + randomNumberSecond, String.valueOf(randomNumberFirst + randomNumberSecond));

            case 1:
                return new Question(randomNumberFirst + " - " + randomNumberSecond, String.valueOf(randomNumberFirst - randomNumberSecond));

            case 2:
                return new Question(randomNumberFirst + " / " + randomNumberSecond, String.valueOf(randomNumberFirst / randomNumberSecond));

            case 3:
                return new Question(randomNumberFirst + " * " + randomNumberSecond, String.valueOf(randomNumberFirst * randomNumberSecond));

            default:
                throw new IllegalStateException("Ошибка");
        }

    }

}
