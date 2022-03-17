package pro.sky.java.course2.course_2_work.service;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.course_2_work.exceptions.MethodNotAllowedException;
import pro.sky.java.course2.course_2_work.service.impl.MathQuestionService;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.course_2_work.JavaQuestionServiceConstants.*;

public class MathQuestionServiceTest {

    private final MathQuestionService out = new MathQuestionService();


    @Test
    public void testAddFromString() {
        assertThrows(MethodNotAllowedException.class, () -> out.add(QUESTIONTEXTONE, ANSWERTEXTONE));
    }

    @Test
    public void testAddFromObject() {
        assertThrows(MethodNotAllowedException.class, () -> out.add(QUESTIONONE));

    }

    @Test
    public void testRemove() {
        assertThrows(MethodNotAllowedException.class, () -> out.remove(QUESTIONONE));

    }

    @Test
    public void testGetAll() {
        assertThrows(MethodNotAllowedException.class, () -> out.getAll());

    }



}
