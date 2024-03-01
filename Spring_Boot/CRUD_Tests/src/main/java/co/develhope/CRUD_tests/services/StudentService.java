package co.develhope.CRUD_tests.services;

import co.develhope.CRUD_tests.entities.Student;
import co.develhope.CRUD_tests.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student setStudentWorkingStatus(Long studentId, Boolean isWorking){
        Optional<Student> student = studentRepository.findById(studentId);

        if(!student.isPresent()) return null;
        student.get().setIsWorking(isWorking);
        return studentRepository.save(student.get());

    }
}
