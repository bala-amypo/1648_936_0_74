import com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.exception.validationexce;
@RestControllerAdvice
public class gobalexce{
    @ExceptionHandler(validationexce.class)
    public ResponseEntity<String> handleValidationexeception(validationexce ex){
    return new ResponseEntity<String>(ex.getMessage(),Httpstatus.SUCCESS);
    }
}