package studentsDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import studentsDetails.model.StudentDetails;
import studentsDetails.service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping(value = "/students")
    public List<StudentDetails> listAll(){
        return service.listAll();
    }

    @PostMapping(value = "add")
    public StudentDetails add(@RequestBody StudentDetails student){
        return service.addStudents(student);
    }

    @PutMapping(value = "/update")
    public StudentDetails update(@RequestBody StudentDetails studentDetails){
        return service.updateStudents(studentDetails);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String delete(@PathVariable int id){
        return service.deleteStudent(id);
    }

    @GetMapping(value = "/get/{name}")
    public StudentDetails find(@PathVariable String name){
        return service.find(name);
    }

    @GetMapping(value = "/above18")
    public List<StudentDetails> aboveAge(){
        return service.above();
    }

}
