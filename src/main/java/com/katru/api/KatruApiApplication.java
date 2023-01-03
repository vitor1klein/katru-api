package com.katru.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KatruApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KatruApiApplication.class, args);
	}

	// @Bean
	// CommandLineRunner commandLineRunner(UserRepository users, PasswordEncoder encoder) {
	// 	return args -> {
	// 		users.save(new User(
	// 			1, "user",
	// 			encoder.encode("password"),
	// 			"ROLE_USER", null, null, null, null, null, null, null
	// 			));
	// 		users.save(new User(
	// 			2, "admin",
	// 			encoder.encode("password"),
	// 			"ROLE_USER,ROLE_ADMIN", null, null, null, null, null, null, null
	// 		));
	// 	};
	// }

}
