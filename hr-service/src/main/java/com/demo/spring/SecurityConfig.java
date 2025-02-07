package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@Profile("secured")
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSec) throws Exception {

		httpSec.authorizeHttpRequests(auth -> auth.requestMatchers("/hr/**").hasRole("ADMIN").anyRequest().permitAll());
		httpSec.csrf(Customizer.withDefaults());
		httpSec.httpBasic(Customizer.withDefaults());
		return httpSec.build();
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService() throws Exception {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("shantanu").password(bCryptPasswordEncoder().encode("welcome1"))
				.roles("USER").build());
		manager.createUser(
				User.withUsername("ranga").password(bCryptPasswordEncoder().encode("welcome1")).roles("ADMIN").build());
		return manager;
	}

}
