package pro.sky.java.course2.course_2_work.controllers;

import org.springframework.web.bind.annotation.*;
import pro.sky.java.course2.course_2_work.data.Question;
import pro.sky.java.course2.course_2_work.service.ExaminerService;

import java.util.Collection;

@RestController
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestionSet(@PathVariable int amount) {
        return examinerService.getQuestionSet(amount);
    }
}
