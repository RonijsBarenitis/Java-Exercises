package co.develhope.CRUD_tests.controllers;

import co.develhope.CRUD_tests.entities.Student;
import co.develhope.CRUD_tests.repositories.StudentRepository;
import co.develhope.CRUD_tests.services.StudentService;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @PostMapping("")
    public @ResponseBody Student create(@RequestBody Student student){

        return studentRepository.save(student);
    }

    @GetMapping("/")
    public @ResponseBody List<Student> getAll(){
       return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody Student getOne(@PathVariable Long id){
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }else {
            return null;
        }
    }

    @PutMapping("/{id}")
    public @ResponseBody Student update(@PathVariable Long id, @RequestBody @NotNull Student student){
        student.setId(id);
        return studentRepository.save(student);

    }

    @PutMapping("/{id}/working")
    public @ResponseBody Student setStudentWorkingCondition(@PathVariable Long id, @RequestParam("isWorking") Boolean isWorking){
        return studentService.setStudentWorkingStatus(id, isWorking);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        studentRepository.deleteById(id);
    }
}
