package re.edu.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ApiResponse<T> {
    private int status;
    private String message;
    private T data;
    private final LocalDateTime  timestamp = LocalDateTime.now(); // thời gian trả về
}
