import com.example.demo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseEntity;
import com.example.demo.exception.validationexce;
@RestControllerAdvice
public class gobalexce{
    @ExceptionHandler(validationexce.class)
    public ResponseEntity<String> handleValidationexeception(validationexce ex){
    return new ResponseEntity<String>(ex.getMessage(),Httptatus.SUCCESS);
    }
}
// import com.example.demo.exception.ValidationException;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.ExceptionHandler;
// import org.springframework.web.bind.annotation.RestControllerAdvice;

// @RestControllerAdvice
// public class GlobalExceptionHandler {

//     @ExceptionHandler(ValidationException.class)
//     public ResponseEntity<String> handleValidationException(ValidationException ex) {
//         // Create a response entity with a message and a status code
//         return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
//     }
// }
