package be.flexlineitsolutions.sample.springboot.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author mario.vansteenberghe@gmail.com
 * 19 nov. 2020
 *
 */

@SpringBootApplication
public class SpringBootSecurityApplication {

	/**
	 * Constructor
	 */
	
	public SpringBootSecurityApplication() {
		super();
	}

	// ------------------------------ public methods ------------------------------------ //
	
	/**
	 * Spring BOOT main method 
	 * @param args
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

}
