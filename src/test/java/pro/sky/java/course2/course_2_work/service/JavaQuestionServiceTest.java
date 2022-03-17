package pro.sky.java.course2.course_2_work.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.course2.course_2_work.data.JavaQuestionRepository;
import pro.sky.java.course2.course_2_work.service.impl.JavaQuestionService;
import pro.sky.java.course2.course_2_work.service.impl.MathQuestionService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static pro.sky.java.course2.course_2_work.JavaQuestionServiceConstants.*;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {
    @Mock
    private JavaQuestionRepository javaQuestionRepositoryMock;

    @InjectMocks
    private JavaQuestionService out;

    @Test
    public void testAddFromString() {
        when(javaQuestionRepositoryMock.add(QUESTIONONE)).thenReturn(QUESTIONONE);
        when(javaQuestionRepositoryMock.getAll()).thenReturn(QUESTION_SET_OF_ONE);

        assertEquals(out.add(QUESTIONTEXTONE, ANSWERTEXTONE), QUESTIONONE);
        assertEquals(out.getAll().size(), 1);

    }

    @Test
    public void testAddFromObject() {
        when(javaQuestionRepositoryMock.add(QUESTIONONE)).thenReturn(QUESTIONONE);
        when(javaQuestionRepositoryMock.getAll()).thenReturn(QUESTION_SET_OF_ONE);

        assertEquals(out.add(QUESTIONONE), QUESTIONONE);
        assertEquals(out.getAll().size(), 1);

    }

    @Test
    public void testRemove() {
        when(javaQuestionRepositoryMock.remove(QUESTIONONE)).thenReturn(QUESTIONONE);
        assertEquals(out.remove(QUESTIONONE), QUESTIONONE);
    }

    @Test
    public void testGetAll() {
        when(javaQuestionRepositoryMock.getAll()).thenReturn(QUESTIONSJAVA);
        assertEquals(out.getAll(), QUESTIONSJAVA);
    }

    @Test
    public void testGetRandomQuestion() {

        when(javaQuestionRepositoryMock.getAll()).thenReturn(QUESTIONSJAVA);
        assertTrue(QUESTIONSJAVA.contains(out.getRandomQuestion()));
    }


}
