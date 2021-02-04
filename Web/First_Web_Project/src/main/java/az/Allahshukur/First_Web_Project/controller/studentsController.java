package az.Allahshukur.First_Web_Project.controller;

import az.Allahshukur.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class studentsController {

    private final StudentRepository studentRepository = new StudentRepository();

    @RequestMapping("/Students")
    public String index(Model model){
        model.addAttribute("list",studentRepository.getAll());
        return "Students/students";
    }

}
