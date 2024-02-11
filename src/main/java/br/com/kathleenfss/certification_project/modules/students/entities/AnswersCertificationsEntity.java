package br.com.kathleenfss.certification_project.modules.students.entities;

import java.util.UUID;

public class AnswersCertificationsEntity {

    private UUID id;
    private UUID certificationID;
    private UUID studentID;
    private UUID questionID;
    private UUID answerID;
    private boolean isCorrect;

}
