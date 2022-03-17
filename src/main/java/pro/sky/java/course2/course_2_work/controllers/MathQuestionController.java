package pro.sky.java.course2.course_2_work.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.course_2_work.data.Question;
import pro.sky.java.course2.course_2_work.service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/math")
public class MathQuestionController {
    private final QuestionService questionService;

    public MathQuestionController(@Qualifier("mathQuestionService") QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(path = "/add", params = {"question", "answer"})
    public Question addQuestion(@RequestParam("question") String question,
                                @RequestParam("answer") String answer) {
        return questionService.add(question,answer);
    }

    @GetMapping(path = "/add", params = "question")
    public Question addQuestion(@RequestParam("question") Question question) {
        return questionService.add(question);
    }
    @GetMapping("/remove")
    public Question removeQuestion(@RequestParam Question question) {
        return questionService.remove(question);
    }

    @GetMapping()
    public Collection<Question> getAllQuestion() {
        return questionService.getAll();
    }



}
