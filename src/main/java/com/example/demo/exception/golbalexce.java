import com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponceBody;

@RestControllerAdvice
public class gobalexce{
    @ExceptionHandler(validationexce.class)
    public ResponceBody<String> handleValidation(validationexce ex){
    return ResponceBody<String>(ex."This is error is shown in the UI",Httpstatus.BAD_GATEWAY);
    }
}