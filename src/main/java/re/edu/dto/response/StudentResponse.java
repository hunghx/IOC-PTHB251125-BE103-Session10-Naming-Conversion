package re.edu.dto.response;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@JsonIgnoreProperties({"name","imageUrl"})
public class StudentResponse {
    private Long id; // *
    private String name;  // *
    @JsonIgnore // khi spring parse về JSON thì bỏ qua thuộc tính này
    private LocalDate dateOfBirth;  //*
    private String email; //*
    private String imageUrl; // *
}
