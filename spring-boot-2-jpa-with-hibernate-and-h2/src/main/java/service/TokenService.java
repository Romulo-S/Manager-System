/**
 * 
 */
package service;

import java.util.UUID;



/**
 * @author Romulo
 *
 */
public class TokenService {
	
	public String generateToken() {
		
		 String auth = UUID.randomUUID().toString();
		 
		return auth;
	}

}
