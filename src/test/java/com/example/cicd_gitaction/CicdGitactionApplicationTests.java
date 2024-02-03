package com.example.cicd_gitaction;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CicdGitactionApplicationTests {


	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testValidEmail() {
		String email = "example@gmail.com";
		ResponseEntity<String> response = restTemplate.postForEntity("/validateEmail?email=" + email, null, String.class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(0,1);
	}

	@Test
	public void testInvalidEmail() {
		String email = "example.com";
		ResponseEntity<String> response = restTemplate.postForEntity("/validateEmail?email=" + email, null, String.class);
		assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
		assertEquals("Invalid", response.getBody());
	}

	@Test
	public void testEmptyEmail() {
		String email = "";
		ResponseEntity<String> response = restTemplate.postForEntity("/validateEmail?email=" + email, null, String.class);
		assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
	}

	@Test
	public void testNullEmail() {
		String email = null;
		ResponseEntity<String> response = restTemplate.postForEntity("/validateEmail?email=" + email, null, String.class);
		assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
	}
}
