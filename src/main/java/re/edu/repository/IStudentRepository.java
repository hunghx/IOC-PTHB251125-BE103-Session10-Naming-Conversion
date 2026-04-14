package re.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import re.edu.entity.Student;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
    @Query("FROM Student S WHERE S.status = re.edu.entity.StudentStatus.ACTIVE")
    List<Student> findStudentActive();
}
