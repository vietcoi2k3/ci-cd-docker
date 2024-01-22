package com.example.cicd_gitaction;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdGitactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdGitactionApplication.class, args);

	}



	@Test
	public void testSomethingElse() {
		// Viết các kiểm tra khác tại đây
	}
}
