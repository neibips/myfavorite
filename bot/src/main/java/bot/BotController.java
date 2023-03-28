package bot;
import dto_classes.ApiErrorResponse;
import dto_classes.DataClass;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/updates")
@RestController
public class BotController {

    @ApiResponse(responseCode = "200", description = "Обработано")
    @ApiResponse(responseCode = "400", description = "Некорректные параметры запроса")


    @PostMapping(consumes = "application/json", produces = "application/json")
    public DataClass update(@RequestPart(value="id", required=true) @RequestBody DataClass dataClass) {
        System.out.println(dataClass);
        return new DataClass(dataClass.id(), dataClass.url(), dataClass.description(), dataClass.tgChatIds());
    }


    @ResponseStatus(code = HttpStatus.BAD_REQUEST)

    public ApiErrorResponse handleException(MethodArgumentNotValidException e){
        return new ApiErrorResponse("Некорректные параметры запроса",
                e.getStatusCode().toString(),
                e.getObjectName(),
                e.getLocalizedMessage(),
                new String[]{String.valueOf(e.getStackTrace())});
    }

}
