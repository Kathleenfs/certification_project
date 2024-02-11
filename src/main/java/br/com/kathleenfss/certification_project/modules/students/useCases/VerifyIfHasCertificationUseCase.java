package br.com.kathleenfss.certification_project.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.kathleenfss.certification_project.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("kathleenfss@gmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }
}
