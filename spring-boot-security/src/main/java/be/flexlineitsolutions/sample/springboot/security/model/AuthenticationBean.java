package be.flexlineitsolutions.sample.springboot.security.model;

/**
 *
 * @author mario.vansteenberghe@gmail.com 19 nov. 2020
 *
 */

public class AuthenticationBean {

	private String message;

	/**
	 * Constructor
	 * @param message
	 */
	
	public AuthenticationBean(String message) {
		this.message = message;
	}

	// ------------------------------ public methods ------------------------------------ //

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}

}
