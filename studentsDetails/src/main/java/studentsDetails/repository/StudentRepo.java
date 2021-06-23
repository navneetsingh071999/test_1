package studentsDetails.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import studentsDetails.model.StudentDetails;

import java.util.List;

public interface StudentRepo extends CrudRepository<StudentDetails, Integer> {

    public StudentDetails findByStudentName(String name);

    @Query(value = "select * from students.details where age > ?1 ;", nativeQuery = true)
    public List<StudentDetails> getAbove(int age);
}
