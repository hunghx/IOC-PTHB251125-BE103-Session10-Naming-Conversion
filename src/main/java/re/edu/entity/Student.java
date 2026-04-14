package re.edu.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
//@JsonIgnoreProperties
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // *
    private String name;  // *
    private LocalDate dateOfBirth;  //*
    private String email; //*
    private String phone;
    @Column(precision = 4, scale = 2)
    private BigDecimal gpa;
    private String imageUrl; // *
    @Enumerated(EnumType.STRING) // string
    private StudentStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
/*
1. Lấy danh sách các sinh viên đang theo học
2. Lấy danh sách sinh viên theo trạng thái
3. Lấy chi tiết thông tin của 1 sinh viên
4. Thêm mới sinh viên
5. Cập nhật thông tin
6. Xóa sinh viên
7. Tìm kiếm theo tên tương đối

 */
}
