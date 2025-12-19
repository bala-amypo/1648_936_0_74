import com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponceBody;

@RestControllerAdvice
public class gobalexce{
    @ExceptionHandler(validationexce.class)
    public ResponceBody<String> handleValidation(){
        return "This is error is shown in the UI";
    }
}