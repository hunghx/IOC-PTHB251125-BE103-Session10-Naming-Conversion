package re.edu.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import re.edu.dto.request.StudentAdd;
import re.edu.dto.response.ApiResponse;
import re.edu.dto.response.StudentResponse;
import re.edu.exception.DataConflictException;
import re.edu.service.IStudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
@Slf4j
public class StudentController {
    private final IStudentService studentService;
    // Lấy danh sách sinh viên đang active
    @GetMapping("/active")
    public ResponseEntity<?> getActiveStudents() {
//        String username = token
        var username = "";
        log.info("usename access api" ,username );
        ApiResponse<List<StudentResponse>> res = new ApiResponse<>(
                200,
                "Load data success!!",
                studentService.getActiveStudents()
        );
        return new ResponseEntity<>(res, HttpStatus.OK); // 200
    }
    // Lấy danh sách sinh viên theo trạng thái

    // Lấy thông tin chi tiết 1 sinh viên theo id

    // Thêm mới sinh viên
    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody StudentAdd request) throws DataConflictException {
        ApiResponse<StudentResponse> res = new ApiResponse<>(
                201,
                "Load data success!!",
                studentService.createStudent(request)
        );
        return new ResponseEntity<>(res, HttpStatus.CREATED); // 201
    }
    // Sửa thông tin sinh viên theo id

    // Xóa sinh viên theo id
}
