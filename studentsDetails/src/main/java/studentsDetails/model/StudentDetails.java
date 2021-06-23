package studentsDetails.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
@Getter
@Setter
@NoArgsConstructor
public class StudentDetails {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "studentName")
    private String studentName;
    @Column(name = "age")
    private int age;

    public StudentDetails(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }
}
