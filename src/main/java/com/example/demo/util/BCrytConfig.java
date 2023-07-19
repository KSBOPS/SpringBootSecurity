package com.example.demo.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class BCrytConfig {

		@Bean
		public BCryptPasswordEncoder PasswordEncoder() {
			return new BCryptPasswordEncoder();
		}
}
