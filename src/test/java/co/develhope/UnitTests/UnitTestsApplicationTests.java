package co.develhope.UnitTests;

import co.develhope.UnitTests.controller.UserController;
import co.develhope.UnitTests.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class UnitTestsApplicationTests {

	@Autowired
	private UserController controller;

	@Autowired
	private TestRestTemplate restTemplate;

	@Autowired
	private MockMvc mockMvc;

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}

	@Test
	void restTemplateHomeTest(){

		String output = this.restTemplate.getForObject("http://127.0.0.1:"+port+"/", String.class); //https??
		assertThat(output).contains("This is the default message for this app");
	}

	@Test
	void restTemplateUserTest(){

		User user = this.restTemplate.getForObject("http://127.0.0.1:"+port+"/user", User.class);
		assertThat(user.getUserName()).contains("IDKdude");
		assertThat(user.getEmail()).contains("mail@mail.com");
	}

	@Test
	public void mockMVCHomeTest() throws Exception{

		this.mockMvc.perform(get("/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("This is the default message for this app")));
	}

	@Test
	public void mockMVCUserTest() throws Exception{

		this.mockMvc.perform(get("/user"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.userName").value("IDKdude"))
				.andExpect(jsonPath("$.email").value("mail@mail.com"));
	}

}
