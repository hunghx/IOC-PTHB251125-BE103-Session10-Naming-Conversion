package re.edu.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Setter
@Getter
public class StudentAdd {
    private String name;  // *
    private LocalDate dateOfBirth;  //*
    private String email; //*
    private String phone;
    private BigDecimal gpa;
    private String imageUrl; // *
}
