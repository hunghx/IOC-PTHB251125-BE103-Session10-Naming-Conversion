package re.edu.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import re.edu.dto.response.StudentResponse;
import re.edu.entity.Student;

//@Mapper(
//        componentModel = "spring" // đê spring biết
//)
public interface StudentMapper {
//    @Mapping(source = "avatar", target = "imageUrl")
//    @Mapping(source = "born", target = "dateOfBirth")
    StudentResponse toResponse(Student student);
}
