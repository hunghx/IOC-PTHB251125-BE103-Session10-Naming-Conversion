package re.edu.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import re.edu.dto.request.StudentAdd;
import re.edu.dto.response.StudentResponse;
import re.edu.entity.Student;
import re.edu.entity.StudentStatus;
import re.edu.repository.IStudentRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {
    private final IStudentRepository studentRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<StudentResponse> getActiveStudents() {
        return studentRepository.findStudentActive()
                .stream()
                .map(en->modelMapper.map(en, StudentResponse.class)
        ).toList();
    }

    @Override
    public StudentResponse createStudent(StudentAdd request) {
        Student entity = modelMapper.map(request, Student.class);
        entity.setCreatedAt(LocalDateTime.now());
        entity.setStatus(StudentStatus.ACTIVE);
        studentRepository.save(entity);
        return modelMapper.map(entity, StudentResponse.class);
    }
}
