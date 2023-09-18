package com.eureka.springboot.backend.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class SpringBootBackendApirestApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApirestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String password = "12345";
		for(int i= 0;i<4;i++){
			String passwordBCrypt = passwordEncoder.encode(password);
			System.out.println(passwordBCrypt);
		}
		String passw = "promad";
		for(int i= 0;i<4;i++){
			String passwordBCrypt = passwordEncoder.encode(passw);
			System.out.println(passwordBCrypt);
		}


		String json = "{\"KEEY\": \"Value1\", \"KEYY2\": \"Value2\"}";

		Pattern pattern = Pattern.compile("\"([^\"]+)\":");
		Matcher matcher = pattern.matcher(json);
		StringBuffer result = new StringBuffer();

		while (matcher.find()) {
			String match = matcher.group(1);
			String replacement = "\"" + match.toLowerCase() + "\":";
			matcher.appendReplacement(result, replacement);
		}

		matcher.appendTail(result);
		String modifiedJson = result.toString();

		System.out.println(modifiedJson);
	}
}
