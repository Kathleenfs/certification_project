package br.com.kathleenfss.certification_project.modules.students.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification() {

    }

}
