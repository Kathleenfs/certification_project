package br.com.kathleenfss.certification_project.modules.students.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kathleenfss.certification_project.modules.students.dto.VerifyHasCertificationDTO;

@RestController
@RequestMapping("/students")
public class StudentController {

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {

        System.out.println(verifyIfHasCertification(verifyHasCertificationDTO));
        return "User ok";
    }

}
