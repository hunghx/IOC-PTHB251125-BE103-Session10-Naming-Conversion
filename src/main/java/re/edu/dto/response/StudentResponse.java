package re.edu.dto.response;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class StudentResponse {
    private Long id; // *
    private String name;  // *
    private LocalDate dateOfBirth;  //*
    private String email; //*
    private String imageUrl; // *
}
