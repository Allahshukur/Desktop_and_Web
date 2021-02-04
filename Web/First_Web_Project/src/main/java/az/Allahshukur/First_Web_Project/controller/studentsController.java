package az.Allahshukur.First_Web_Project.controller;

import az.Allahshukur.First_Web_Project.Dto.StudentFormDto;
import az.Allahshukur.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class studentsController {

    private final StudentRepository studentRepository = new StudentRepository();

    @RequestMapping(value = "/Students",method ={RequestMethod.GET,RequestMethod.POST})
    public String index(Model model,
                        @RequestParam(required = false) String name,
                        @RequestParam(required = false) String surname,
                        @RequestParam(required = false) Integer age,
                        @RequestParam(required = false)BigDecimal scholarship
                        ){

        model.addAttribute("list",studentRepository.findList(
                name,
                surname,
                age,
                scholarship
        ));
        return "Students/students";
    }



}
