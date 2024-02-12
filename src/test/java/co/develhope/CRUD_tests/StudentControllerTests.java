package co.develhope.CRUD_tests;

import co.develhope.CRUD_tests.controllers.StudentController;
import co.develhope.CRUD_tests.entities.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
class StudentControllerTests {

	@Autowired
	StudentController studentController;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	private Student createStudent() throws Exception {
		Student student = new Student();
		student.setName("Marco");
		student.setSurname("Polo");
		student.setIsWorking(true);

		return createStudent(student);

	}

	private Student createStudent(Student student) throws Exception {

		MvcResult result = createStudentRequest(student);
		Student studentFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);

		assertThat(studentFromResponse).isNotNull();
		assertThat(studentFromResponse.getId()).isNotNull();

		return studentFromResponse;

	}

	private MvcResult createStudentRequest() throws Exception {
		Student student = new Student();
		student.setName("Marco");
		student.setSurname("Polo");
		student.setIsWorking(true);

		return createStudentRequest(student);

	}

	private MvcResult createStudentRequest(Student student) throws Exception {
		if(student == null) return null;
		//https://www.baeldung.com/jackson-object-mapper-tutorial
		String studentJSON = objectMapper.writeValueAsString(student);

		return this.mockMvc.perform(post("/student")
						.contentType(MediaType.APPLICATION_JSON)
						.content(studentJSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();
	}

	private Student getStudentFromId(Long id) throws Exception {

		MvcResult result = this.mockMvc.perform(get("/student/"+id))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		try {
			String studentJSON = result.getResponse().getContentAsString();
			Student student = objectMapper.readValue(studentJSON, Student.class);

			assertThat(student).isNotNull();
			assertThat(student.getId()).isNotNull();

			return student;
		}catch (Exception e){
			return null;
		}

	}

	@Test
	void userControllerLoads() {
		assertThat(studentController).isNotNull();
	}

	@Test  //Test repository or controller?
	void createStudentTest() throws Exception {

		Student studentFromResponse = createStudent();
		assertThat(studentFromResponse.getId()).isNotNull();
	}

	@Test
	void readStudentList() throws Exception {

		createStudentRequest();

		MvcResult result = this.mockMvc.perform(get("/student/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		List<Student> studentsFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), List.class);
		System.out.println("Students in database are: " +studentsFromResponse);
		assertThat(studentsFromResponse.size()).isNotZero();
	}

	@Test
	void readOneStudent() throws Exception {

		Student student = createStudent();

		Student studentsFromResponse = getStudentFromId(student.getId());
		assertThat(studentsFromResponse).isNotNull();
		assertThat(studentsFromResponse.getId()).isEqualTo(student.getId());


	}

	@Test
	void updateStudent() throws Exception{

		Student student = createStudent();
		assertThat(student.getId()).isNotNull();

		String newName = "David";
		student.setName(newName);

		String studentJSON = objectMapper.writeValueAsString(student);

		MvcResult result = this.mockMvc.perform(put("/student/" +student.getId())
						.contentType(MediaType.APPLICATION_JSON)
						.content(studentJSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();
		Student studentsFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);

		//Check Student from put
		assertThat(studentsFromResponse.getId()).isEqualTo(student.getId());
		assertThat(studentsFromResponse.getName()).isEqualTo(newName);

		//Get user with GET call
		Student studentsFromResponseGet = getStudentFromId(student.getId());
		assertThat(studentsFromResponseGet).isNotNull();
		assertThat(studentsFromResponseGet.getId()).isEqualTo(student.getId());
		assertThat(studentsFromResponseGet.getName()).isEqualTo(newName);

		/*MvcResult result2 = this.mockMvc.perform(get("/student/"+student.getId()))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		Student studentsFromResponseGet = getStudentFromId(student.getId());
		assertThat(studentsFromResponseGet.getId()).isEqualTo(student.getId());*/
	}

	@Test
	void deleteOne() throws Exception {

		Student student = createStudent();
		assertThat(student.getId()).isNotNull();

		this.mockMvc.perform(delete("/student/" +student.getId()))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		Student studentsFromResponseGet = getStudentFromId(student.getId());
		assertThat(studentsFromResponseGet).isNull();

	}

	@Test
	void setWorkingToStudent() throws Exception {

		Student student = createStudent();
		assertThat(student.getId()).isNotNull();

		MvcResult result = this.mockMvc.perform(put("/student/" +student.getId() +"/working?isWorking=true"))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();

		Student studentsFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), Student.class);
		assertThat(studentsFromResponse).isNotNull();
		assertThat(studentsFromResponse.getId()).isEqualTo(student.getId());
		assertThat(studentsFromResponse.getIsWorking()).isEqualTo(true);

		Student studentsFromResponseGet = getStudentFromId(student.getId());
		assertThat(studentsFromResponseGet).isNotNull();
		assertThat(studentsFromResponseGet.getId()).isEqualTo(student.getId());
		assertThat(studentsFromResponseGet.getIsWorking()).isEqualTo(true);

	}

}
