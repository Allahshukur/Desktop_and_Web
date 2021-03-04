package az.Allahshukur.First_Web_Project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="school")
public class SchoolEntity {

    @Id
    private Integer id;
    private String name;

    @OneToMany
    private List<StudentEntity> studentlist;

    @OneToOne(mappedBy = "school", cascade = CascadeType.ALL)
    private SchoolAdress schoolAdress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentEntity> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(List<StudentEntity> studentlist) {
        this.studentlist = studentlist;
    }

    public SchoolAdress getSchoolAdress() {
        return schoolAdress;
    }

    public void setSchoolAdress(SchoolAdress schoolAdress) {
        this.schoolAdress = schoolAdress;
    }

    @Override
    public String toString() {
        return "SchoolEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
