package be.flexlineitsolutions.sample.springboot.security.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.flexlineitsolutions.sample.springboot.security.model.AuthenticationBean;

/**
 *
 * @author mario.vansteenberghe@gmail.com
 * 19 nov. 2020
 *
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {

	/**
	 * Constructor
	 */
	
	public BasicAuthController() {
		super();
	}

	// ------------------------------ public methods ------------------------------------ //
	
	@GetMapping(path = "/basicauth")
  public AuthenticationBean basicauth() {
    return new AuthenticationBean("You are authenticated");
  }
	
}
