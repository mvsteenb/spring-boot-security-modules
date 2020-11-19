package be.flexlineitsolutions.sample.springboot.security.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author mario.vansteenberghe@gmail.com
 * 19 nov. 2020
 *
 */

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * Constructor
	 */
	
	public SpringSecurityConfig() {
		super();
	}

	// ------------------------------ public methods ------------------------------------ //

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().
			disable()
				.authorizeRequests()
				.antMatchers(HttpMethod.OPTIONS, "/**")
				.permitAll()
				.anyRequest()
        .authenticated()
        .and()
        .httpBasic();
	}
}
