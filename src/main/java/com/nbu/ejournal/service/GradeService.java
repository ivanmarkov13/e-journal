package com.nbu.ejournal.service;

import com.nbu.ejournal.model.Grade;
import com.nbu.ejournal.model.Student;
import com.nbu.ejournal.repository.GradeRepository;
import com.nbu.ejournal.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GradeService {

    private GradeRepository gradeRepository;
    private StudentRepository studentRepository;

    public Grade save(Grade.GradeRequest gradeRequest) {

        Grade grade = new Grade();
        Student student = studentRepository.findByEmail(gradeRequest.getStudentEmail());

        grade.setStudent(student);
        grade.setAssessment(gradeRequest.getAssessment());
        grade.setDate(gradeRequest.getDate());

        return gradeRepository.save(grade);
    }

    public List<Grade> findByEmail(String studentEmail) {
        return gradeRepository.findByStudentEmail(studentEmail);
    }

}
