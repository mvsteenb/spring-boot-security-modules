package be.flexlineitsolutions.sample.springboot.security.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.flexlineitsolutions.sample.springboot.security.model.Greeting;

/**
 *
 * @author mario.vansteenberghe@gmail.com
 * 19 nov. 2020
 *
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class HelloController {

	/**
	 * Constructor
	 */
	
	public HelloController() {
		super();
	}

	// ------------------------------ public methods ------------------------------------ //
	
	@GetMapping(path = "/greeting")
  public Greeting basicauth() {
    return new Greeting(1, "Hello, world !");
  }
	
}
