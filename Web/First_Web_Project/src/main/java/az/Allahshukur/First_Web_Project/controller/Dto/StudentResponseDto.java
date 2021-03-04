package az.Allahshukur.First_Web_Project.controller.Dto;

import az.Allahshukur.First_Web_Project.entity.StudentEntity;

import java.math.BigDecimal;
import java.util.List;

public class StudentResponseDto {// Dto--Data Transfer Object

    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private BigDecimal scholarship;

    private SchoolResponseDto school;
    private List<TeacherResponseDto> teacherList;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getScholarship() {
        return scholarship;
    }

    public void setScholarship(BigDecimal scholarship) {
        this.scholarship = scholarship;
    }

    public SchoolResponseDto getSchool() {
        return school;
    }

    public void setSchool(SchoolResponseDto school) {
        this.school = school;
    }

    public List<TeacherResponseDto> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<TeacherResponseDto> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", scholarship=" + scholarship +
                '}';
    }

    public StudentEntity studentToEntity(){
        return new StudentEntity()
                .setName(name)
                .setSurname(surname)
                .setAge(age)
                .setScholarship(scholarship);
    }
}
