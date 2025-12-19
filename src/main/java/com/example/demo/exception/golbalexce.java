import com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.exception.validationexce;
@RestControllerAdvice
public class gobalexce{
    @ExceptionHandler(validationexce.class)
    public ResponseEntity<String> handleValidation(validationexce ex){
    return new ResponseEntity<String>("This is error is shown in the UI",Httpstatus.SUCCE);
    }
}