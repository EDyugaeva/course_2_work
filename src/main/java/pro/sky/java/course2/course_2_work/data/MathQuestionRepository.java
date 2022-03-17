package pro.sky.java.course2.course_2_work.data;

import org.springframework.stereotype.Repository;
import pro.sky.java.course2.course_2_work.exceptions.AbsentQuestionException;
import pro.sky.java.course2.course_2_work.exceptions.QuestionAddedException;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Repository
public class MathQuestionRepository implements QuestionRepository {

    public Set<Question> questions = new HashSet<>();

    @PostConstruct
    public void init() {
        questions.add(new Question("First Math Question", "First Math answer"));
        questions.add(new Question("Second Math Question", "Second Math answer"));
        questions.add(new Question("Third Math Question", "Third Math answer"));

    }

    @Override
    public Question add(Question question) {
        if (!questions.add(question)) {
            throw new QuestionAddedException("Такой объект уже добавлен");
        }
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (!questions.remove(question)) {
            throw new AbsentQuestionException("Такой вопрос в списке отсутствует");
        }
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }
}
