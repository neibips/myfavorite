package scrapper;

import dto_classes.response.ApiErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/tg-chat")
@RestController
public class ScrapperTgChatController {
    @PostMapping("/{id}")
    String regChat(@PathVariable int id){
        return "Chat Id: " + id;
    }
    @DeleteMapping("/{id}")
    String deleteChat(@PathVariable int id){
        return "Chat Id: " + id;
    }
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiErrorResponse handleException(MethodArgumentNotValidException e){
        return new ApiErrorResponse("Некорректные параметры запроса",
                e.getStatusCode().toString(),
                e.getObjectName(),
                e.getLocalizedMessage(),
                new String[]{String.valueOf(e.getStackTrace())});
    }
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiErrorResponse linkException(MethodArgumentNotValidException e){
        return new ApiErrorResponse("Ссылка не найдена",
                e.getStatusCode().toString(),
                e.getObjectName(),
                e.getLocalizedMessage(),
                new String[]{String.valueOf(e.getStackTrace())});
    }
}
