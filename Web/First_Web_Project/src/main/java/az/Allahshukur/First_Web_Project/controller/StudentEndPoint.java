package az.Allahshukur.First_Web_Project.controller;

import az.Allahshukur.First_Web_Project.Dto.SchoolDto;
import az.Allahshukur.First_Web_Project.Dto.StudentDto;
import az.Allahshukur.First_Web_Project.Dto.TeacherDto;
import az.Allahshukur.First_Web_Project.controller.Dto.SchoolResponseDto;
import az.Allahshukur.First_Web_Project.controller.Dto.StudentResponseDto;
import az.Allahshukur.First_Web_Project.controller.Dto.TeacherResponseDto;
import az.Allahshukur.First_Web_Project.entity.StudentEntity;
import az.Allahshukur.First_Web_Project.entity.TeacherEntity;
import az.Allahshukur.First_Web_Project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;

@RestController
@RequestMapping(value="Rest/")
public class StudentEndPoint {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "Students")
    public List<StudentResponseDto> index(
                        @RequestParam(required = false) String name,
                        @RequestParam(required = false) String surname,
                        @RequestParam(required = false) Integer age,
                        @RequestParam(required = false) BigDecimal scholarship
    ) {
        List<StudentDto> list= studentService.findAll(
                name,
                surname,
                age,
                scholarship
        );

        List<StudentResponseDto> result= new ArrayList<>();

        for (StudentDto st: list){
            StudentResponseDto studentDto = new StudentResponseDto();
            studentDto.setId(st.getId());
            studentDto.setName(st.getName());
            studentDto.setSurname(st.getSurname());
            studentDto.setAge(st.getAge());
            studentDto.setScholarship(st.getScholarship());

            SchoolResponseDto schoolDto = new SchoolResponseDto();
            schoolDto.setId(st.getSchool().getId());
            schoolDto.setName(st.getSchool().getName());
            studentDto.setSchool(schoolDto);

            List<TeacherResponseDto> teacherList = new ArrayList<>();

            for (TeacherDto teacherDtos: st.getTeacherList()){
                TeacherResponseDto teacherDto = new TeacherResponseDto();
                teacherDto.setId(teacherDtos.getId());
                teacherDto.setName(teacherDtos.getName());
                teacherList.add(teacherDto);
            }

            studentDto.setTeacherList(teacherList);
            result.add(studentDto);
        }
        return result;
    }
}
