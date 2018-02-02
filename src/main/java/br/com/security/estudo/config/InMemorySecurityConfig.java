package br.com.security.estudo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.inMemoryAuthentication()
				.withUser("fernando").password("123").roles("PG_ADMIN", "PG_USUARIO")
				.and()
				.withUser("luciana").password("123").roles("PG_USUARIO");
	}
}
