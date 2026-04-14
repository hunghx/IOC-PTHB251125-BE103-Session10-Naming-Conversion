package re.edu.service;

import re.edu.dto.request.StudentAdd;
import re.edu.dto.response.StudentResponse;

import java.util.List;

public interface IStudentService {
    List<StudentResponse> getActiveStudents();
    StudentResponse  createStudent(StudentAdd request);
}
