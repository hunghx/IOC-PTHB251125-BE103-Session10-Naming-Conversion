package re.edu.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class StudentResponseFake {
    private Long id; // *
    private String name;  // *
    private LocalDate born;  //*
    private String email; //*
    private String avatar; // *
}
