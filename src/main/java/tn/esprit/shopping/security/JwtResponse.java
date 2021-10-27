package tn.esprit.shopping.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class JwtResponse {
	private String token;	
	private String id;
	private String type = "Bearer";
	private String username;
	private String email;
	private Collection<? extends GrantedAuthority> authorities;
	


	public JwtResponse(String token, String id, String username, String email,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.token = token;
		this.id = id;
		this.username = username;
		this.email = email;
		this.authorities = authorities;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public JwtResponse(String jwttoken) {
		this.token = jwttoken;
	}


	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}


	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}
	
  
}