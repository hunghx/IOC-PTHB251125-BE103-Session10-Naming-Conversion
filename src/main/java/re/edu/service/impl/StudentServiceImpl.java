package re.edu.service.impl;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import re.edu.dto.request.StudentAdd;
import re.edu.dto.response.StudentResponse;
import re.edu.entity.Student;
import re.edu.entity.StudentStatus;
import re.edu.exception.DataConflictException;
import re.edu.repository.IStudentRepository;
import re.edu.service.IStudentService;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {
    private final IStudentRepository studentRepository;
    private final ModelMapper modelMapper;
//    private final StudentMapper studentMapper;
    @Override
    public List<StudentResponse> getActiveStudents() {
        throw new RuntimeException("Lỗi khi thực thi lấy lữ liệu sinh viên");
//            return studentRepository.findStudentActive()
//                    .stream()
//                    .map(en -> modelMapper.map(en, StudentResponse.class)).toList();
    }

    @Override
    public StudentResponse createStudent(StudentAdd request) throws DataConflictException{
        Student entity = modelMapper.map(request, Student.class);
        entity.setCreatedAt(LocalDateTime.now());
        entity.setStatus(StudentStatus.ACTIVE);
        // kiểm tra email
        if (studentRepository.existsByEmail(request.getEmail())) {
            throw new DataConflictException("Email is exist!!");
        }
        if (studentRepository.existsByPhone(request.getPhone())) {
            throw new DataConflictException("Phone is exist!!");
        }
        // kiểm tra pass
        studentRepository.save(entity);
        return modelMapper.map(entity, StudentResponse.class);
    }
}
