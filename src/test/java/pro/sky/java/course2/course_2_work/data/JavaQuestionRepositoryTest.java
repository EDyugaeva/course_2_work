package pro.sky.java.course2.course_2_work.data;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.course_2_work.exceptions.AbsentQuestionException;
import pro.sky.java.course2.course_2_work.exceptions.QuestionAddedException;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.java.course2.course_2_work.JavaQuestionServiceConstants.*;

public class JavaQuestionRepositoryTest {
    private final QuestionRepository out = new JavaQuestionRepository();

    @Test
    public void testAdd() {
        assertEquals(out.getAll().size(), 0);
        Set<Question> actual = new HashSet<>();

        assertEquals(out.add(QUESTIONONE), QUESTIONONE);
        assertEquals(out.getAll().size(), 1);
        actual.add(QUESTIONONE);
        assertEquals(out.getAll(), actual);

        assertEquals(out.add(QUESTIONTWO), QUESTIONTWO);
        assertEquals(out.getAll().size(), 2);
        actual.add(QUESTIONTWO);
        assertEquals(out.getAll(), actual);

        assertThrows(QuestionAddedException.class, () -> out.add(QUESTIONONE));
        assertThrows(QuestionAddedException.class, () -> out.add(QUESTIONTWO));

    }


    @Test
    public void testRemove() {
        assertEquals(out.getAll().size(), 0);

        assertThrows(AbsentQuestionException.class, () -> out.remove(QUESTIONONE));


        HashSet<Question> actual = new HashSet<>();
        out.add(QUESTIONONE);
        assertEquals(out.getAll().size(), 1);

        assertEquals(out.remove(QUESTIONONE), QUESTIONONE);
        assertEquals(out.getAll().size(), 0);
        assertEquals(out.getAll(), actual);


    }


}
