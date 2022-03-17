package pro.sky.java.course2.course_2_work.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IllegalCountOfQuestionException extends RuntimeException {
    public IllegalCountOfQuestionException(String message) {
        super(message);
    }
}
