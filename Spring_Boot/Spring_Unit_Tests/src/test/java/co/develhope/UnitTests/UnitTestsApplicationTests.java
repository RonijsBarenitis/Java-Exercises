package co.develhope.UnitTests;

import co.develhope.UnitTests.controller.UserController;
import co.develhope.UnitTests.entities.User;
import co.develhope.UnitTests.repositories.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
class UnitTestsApplicationTests {

	@Autowired
	private UserController controller;

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private UserRepository userRepository;

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	public void mockMVCHomeTest() throws Exception{

		this.mockMvc.perform(get("/user/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("This is the default message for this app")));
	}

	@Test
	void restTemplateHomeTest(){

		String output = this.restTemplate.getForObject("http://127.0.0.1:"+port+"/user/", String.class); //https??
		assertThat(output).contains("This is the default message for this app");
	}

	@Test
	void userControllerTest() {
		assertThat(controller).isNotNull();
	}

	/*@Test
	void restTemplateUserTest(){

		User user = this.restTemplate.getForObject("http://127.0.0.1:"+port+"/user/create", User.class);
		assertThat(user.getUserName()).contains("IDKdude");
		assertThat(user.getEmail()).contains("mail@mail.com");
	}

	@Test
	public void mockMVCUserTest() throws Exception{

		this.mockMvc.perform(get("/user/create"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.userName").value("IDKdude"))
				.andExpect(jsonPath("$.email").value("mail@mail.com"));
	}*/

	private User createUser() throws Exception {
		User user = new User();
		user.setUserName("IDKman");
		user.setEmail("mail@mail.com");

		return createUser(user);
	}

	private User createUser(User user) throws Exception {
		MvcResult result = createUserRequest(user);
		User userFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), User.class);

		assertThat(userFromResponse).isNotNull();
		assertThat(userFromResponse.getId()).isNotNull();

		return userFromResponse;
	}

	private MvcResult createUserRequest() throws Exception {
		User user = new User();
		user.setUserName("IDKman");
		user.setEmail("mail@mail.com");
		return createUserRequest(user);
	}

	private MvcResult createUserRequest(User user) throws Exception {
		if(user == null) return null;
		String userJSON = objectMapper.writeValueAsString(user);

		return mockMvc.perform(post("/user/create")
						.contentType(MediaType.APPLICATION_JSON)
						.content(userJSON))
				.andDo(print())
				.andExpect(status().isOk())
				.andReturn();
	}

	@Test
	void createUserTest() throws Exception {

		/*User userFromResponse = createUser();
		assertThat(userFromResponse.getId()).isNotNull();*/

		MvcResult result = createUserRequest();

		User userFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), User.class);
		assertThat(userFromResponse.getId()).isNotNull();
		assertThat(userFromResponse.getId()).isGreaterThan(0);
	}

	@Test
	void getUserList() throws Exception {
		createUserRequest();

		MvcResult result = mockMvc.perform(get("/user/getAll"))
				.andDo(print()).andExpect(status().isOk()).andReturn();
		List<User> userListFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), List.class);

		assertThat(userListFromResponse.size()).isNotZero();
	}

	@Test
	void readSingleUser() throws Exception {
		User user = createUser();
		assertThat(user).isNotNull();


		MvcResult result = mockMvc.perform(get("/user/get" + user.getId()))
				.andDo(print()).andExpect(status().isOk()).andReturn();

		User userFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), User.class);

		assertThat(userFromResponse.getId()).isEqualTo(user.getId());
	}

	@Test
	void updateUserName() throws Exception {

		User user = createUser();
		assertThat(user).isNotNull();

		String newUserName = "BigMan";
		user.setUserName(newUserName);
		String userJSON = objectMapper.writeValueAsString(user);

		MvcResult result = mockMvc.perform(put("/user/updateusername/" + user.getId() +"?newUserName=BigMan")
						.contentType(MediaType.APPLICATION_JSON).content(userJSON))
				.andDo(print()).andExpect(status().isOk()).andReturn();

		User userFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), User.class);

		assertThat(userFromResponse).isNotNull();
		assertThat(userFromResponse.getUserName()).isEqualTo(newUserName);
	}

	@Test
	void updateEmail() throws Exception {
		User user = createUser();
		assertThat(user).isNotNull();

		String newEmail = "realmail@yesmail.com";
		user.setEmail(newEmail);
		String userJSON = objectMapper.writeValueAsString(user);

		MvcResult result = mockMvc.perform(patch("/user/updateemail/" + user.getId() + "?email=realmail@yesmail.com")
						.contentType(MediaType.APPLICATION_JSON).content(userJSON))
				.andDo(print()).andExpect(status().isOk()).andReturn();

		User userFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), User.class);

		assertThat(userFromResponse).isNotNull();
		assertThat(userFromResponse.getEmail()).isEqualTo(newEmail);
	}

	@Test
	void deleteUser() throws Exception {
		User user = createUser();
		assertThat(user).isNotNull();

		this.mockMvc.perform(delete("/user/delete/" + user.getId()))
				.andDo(print()).andExpect(status().isOk()).andReturn();

		MvcResult result = mockMvc.perform(get("/user/get" + user.getId()))
				.andDo(print()).andExpect(status().isOk()).andReturn();

		User userFromResponse = objectMapper.readValue(result.getResponse().getContentAsString(), User.class);

		assertThat(userFromResponse).isNull();
	}



}
