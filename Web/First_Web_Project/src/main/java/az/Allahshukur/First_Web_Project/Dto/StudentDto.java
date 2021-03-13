package az.Allahshukur.First_Web_Project.Dto;

import az.Allahshukur.First_Web_Project.entity.SchoolEntity;
import az.Allahshukur.First_Web_Project.entity.StudentEntity;
import az.Allahshukur.First_Web_Project.entity.TeacherEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StudentDto {

    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private BigDecimal scholarship;

    private SchoolDto school;
    private List<TeacherDto> teacherList;

    public Integer getId() {
        return id;
    }

    public StudentDto setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StudentDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public StudentDto setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public StudentDto setAge(Integer age) {
        this.age = age;
        return this;
    }

    public BigDecimal getScholarship() {
        return scholarship;
    }

    public StudentDto setScholarship(BigDecimal scholarship) {
        this.scholarship = scholarship;
        return this;
    }

    public SchoolDto getSchool() {
        return school;
    }

    public StudentDto setSchool(SchoolDto school) {
        this.school = school;
        return this;
    }

    public List<TeacherDto> getTeacherList() {
        return teacherList;
    }

    public StudentDto setTeacherList(List<TeacherDto> teacherList) {
        this.teacherList = teacherList;
        return this;
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

    public StudentEntity ToEntity() {
        List<TeacherEntity> teachers = new ArrayList<>();
        for (TeacherDto teacherDto: this.getTeacherList()){
            teachers.add(new TeacherEntity()
                .setId(teacherDto.getId())
                .setName(teacherDto.getName()));
        }

        return new StudentEntity()
                .setId(this.getId())
                .setName(this.getName())
                .setSurname(this.getSurname())
                .setAge(this.getAge())
                .setScholarship(this.getScholarship())
                .setSchool(
                        new SchoolEntity()
                                .setId(this.getSchool().getId())
                                .setName(this.getSchool().getName())
                )
                .setTeacherList(teachers);
    }
}
