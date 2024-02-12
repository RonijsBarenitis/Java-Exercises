package co.develhope.CRUD_tests;

import co.develhope.CRUD_tests.entities.Student;
import co.develhope.CRUD_tests.repositories.StudentRepository;
import co.develhope.CRUD_tests.services.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ActiveProfiles(value = "test")
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void checkStudentWorkingStatus() throws Exception {

        Student student = new Student();
        student.setName("Marco");
        student.setSurname("Polo");
        student.setIsWorking(true);

        Student studentFromDB = studentRepository.save(student);
        assertThat(studentFromDB.getId()).isNotNull();
        assertThat(studentFromDB.getId()).isNotNull();

        Student studentFromService =  studentService.setStudentWorkingStatus(student.getId(), true);
        assertThat(studentFromService.getId()).isNotNull();
        assertThat(studentFromService.getIsWorking()).isTrue();

        Student studentFromFind = studentRepository.findById(studentFromDB.getId()).get();
        assertThat(studentFromFind).isNotNull();
        assertThat(studentFromFind.getId()).isNotNull();
        assertThat(studentFromFind.getId()).isEqualTo(studentFromDB.getId());
        assertThat(studentFromFind.getIsWorking()).isTrue();
    }
}
