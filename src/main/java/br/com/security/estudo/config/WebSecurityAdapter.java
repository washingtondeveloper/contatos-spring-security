package br.com.security.estudo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityAdapter extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/contatos").hasRole("PG_USUARIO")
			.antMatchers("/pesquisa").hasRole("PG_ADMIN")
				.anyRequest().authenticated()
			.and()
				.formLogin()
					.loginPage("/login")
					.permitAll()
				.and()
					.logout()
						.logoutSuccessUrl("/login?logout")
						.permitAll();
	}
}
