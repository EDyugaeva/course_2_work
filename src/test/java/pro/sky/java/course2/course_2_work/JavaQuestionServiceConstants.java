package pro.sky.java.course2.course_2_work;

import pro.sky.java.course2.course_2_work.data.Question;

import java.util.Set;

public class JavaQuestionServiceConstants {
    public static final String QUESTIONTEXTONE = "Question text 1";
    public static final String QUESTIONTEXTTWO = "Question text 2";

    public static final String ANSWERTEXTONE = "Answer text 1";
    public static final String ANSWERTEXTTWO = "Answer text 2";

    public static final Question QUESTIONONE = new Question(QUESTIONTEXTONE, ANSWERTEXTONE);
    public static final Question QUESTIONTWO = new Question(QUESTIONTEXTTWO, ANSWERTEXTTWO);

    public static final Set<Question> QUESTION_SET_OF_ONE = Set.of(QUESTIONONE);

    public static final Set<Question> QUESTIONSMATHS = Set.of(new Question("Question math 1", "Answer math 1"),
            new Question("Question math 2", "Answer math 2"),
            new Question("Question math 3", "Answer math 3"),
            new Question("Question math 4", "Answer math 4"),
            new Question("Question math 5", "Answer math 5"));

    public static final Set<Question> QUESTIONSJAVA = Set.of(new Question("Question java 1", "Answer java 1"),
            new Question("Question java 2", "Answer java 2"),
            new Question("Question java 3", "Answer java 3"),
            new Question("Question java 4", "Answer java 4"),
            new Question("Question java 5", "Answer java 5"));


}
