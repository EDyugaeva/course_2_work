package pro.sky.java.course2.course_2_work.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.course2.course_2_work.data.Question;
import pro.sky.java.course2.course_2_work.exceptions.IllegalCountOfQuestionException;
import pro.sky.java.course2.course_2_work.service.impl.ExaminerServiceImpl;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;
import static pro.sky.java.course2.course_2_work.JavaQuestionServiceConstants.QUESTIONONE;
import static pro.sky.java.course2.course_2_work.JavaQuestionServiceConstants.QUESTIONTWO;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {

    @Mock
    private QuestionService javaQuestionServiceMock;


    @InjectMocks
    private ExaminerServiceImpl out;

    @Test
    public void testGetListQuestion() {
        assertThrows(IllegalCountOfQuestionException.class, () -> out.getQuestionSet(-1));


    }

}
