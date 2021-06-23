package studentsDetails.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import studentsDetails.model.StudentDetails;
import studentsDetails.repository.StudentRepo;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;


    public List<StudentDetails> listAll() {

        List<StudentDetails> list = new ArrayList<>();

        for(StudentDetails student : repo.findAll()){
            list.add(student);
        }

        return list;

    }

    public StudentDetails addStudents(StudentDetails student) {
        return repo.save(student);
    }


    public StudentDetails updateStudents(StudentDetails student){

        return repo.save(student);
    }

    public String deleteStudent(int id) {
        repo.deleteById(id);
        return "Deleted";
    }


    public StudentDetails find(String name) {
        return repo.findByStudentName(name);
    }

    public List<StudentDetails> above() {
        return repo.getAbove(18);
    }
}
