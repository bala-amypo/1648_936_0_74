import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import com.example.demo.exception.validationexce;

@RestControllerAdvice
public class golbalexce{
    @ExceptionHandler(validationexce.class)
    public ResponseEntity<String> handleValidationexeception(validationexce ex){
    return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }
}