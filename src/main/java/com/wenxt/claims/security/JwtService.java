package com.wenxt.claims.security;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class JwtService {
	
	@Autowired
	private UserMasterRepository userrrepo;

	public static final String SECRET = "5367566B59703373367639792F423F4528482B4D6251655468576D5A71347437";

	public String generateToken(AuthRequest userName) {
		Map<String, Object> claims = new HashMap<>();
		claims.put("Division", userName.getDivision());
		claims.put("Department", userName.getDepartment());
		claims.put("Company", userName.getCompany());
		claims.put("Currency", userName.getBaseCurrency());
		Optional<LM_MENU_USERS> userDetail = userrrepo.findByUserId(userName.getUsername());
			claims.put("Role", userDetail.get().getUser_group_id());

			claims.put("Language", userDetail.get().getUser_dflt_lang_code());
		return createToken(claims, userName.getUsername());
	}

	private String createToken(Map<String, Object> claims, String userName) {
		return Jwts.builder().setClaims(claims).setSubject(userName).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 30))
				.signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
	}

	private Key getSignKey() {
		byte[] keyBytes = Decoders.BASE64.decode(SECRET);
		return Keys.hmacShaKeyFor(keyBytes);
	}

	public String extractUsername(String token) {
		return extractClaim(token, Claims::getSubject);
	}

	public Date extractExpiration(String token) {
		return extractClaim(token, Claims::getExpiration);
	}

	public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}

	private Claims extractAllClaims(String token) {
		return Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token).getBody();
	}

	private Boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}

	public Boolean validateToken(String token, UserDetails userDetails) {
		final String username = extractUsername(token);
		return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}

	public String extractTokenFromHeader(HttpServletRequest request) {
		// Get the authorization header from the request
		String authHeader = request.getHeader("Authorization");

		// Check if the authorization header is present and starts with "Bearer "
		if (authHeader != null && authHeader.startsWith("Bearer ")) {
			// Extract the token by removing "Bearer " prefix
			String token = authHeader.substring(7);
			return token;
		}

		return null;
	}
	
	public AuthRequest getLoggedInDetails(String token) {
				 try {
					 AuthRequest loggedInDetails = new AuthRequest();
			            Claims tokenDetails = Jwts.parser()
			                                .setSigningKey(SECRET)
			                                .parseClaimsJws(token)
			                                .getBody();
			            // Access specific claims
			            loggedInDetails.setUsername(tokenDetails.get("sub", String.class));
			            loggedInDetails.setDivision(tokenDetails.get("Division", String.class));
			            loggedInDetails.setDepartment(tokenDetails.get("Department", String.class));
			            loggedInDetails.setBaseCurrency(tokenDetails.get("Currency", String.class));
			            loggedInDetails.setCompany(tokenDetails.get("Company", String.class));
			            loggedInDetails.setRole(tokenDetails.get("Role", String.class));
			            return loggedInDetails;
			        } catch (SignatureException e) {
			            System.out.println("Invalid JWT signature");
			        } catch (Exception e) {
			            System.out.println("Token parsing failed: " + e.getMessage());
			        }
				 return null;
			}
		

}
