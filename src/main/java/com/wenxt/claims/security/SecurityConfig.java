package com.wenxt.claims.security;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter; 

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig { 

	@Autowired
	private JwtAuthFilter authFilter; 
	
	@Bean(name = "jasyptStringEncryptor")
    public StringEncryptor stringEncryptor() {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("yourEncryptionPassword"); // Set your encryption password here
        return encryptor;
    }

	// User Creation 
	@Bean
	public UserDetailsService userDetailsService() { 
		return new UserInfoService(); 
	} 

	// Configuring HttpSecurity 
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { 
		return http.csrf().disable() 
				.authorizeHttpRequests() 
				.requestMatchers("/auth/generateToken").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/auth/addNewUser").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/swagger-ui/**").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/v3/**").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/auth/**").permitAll()
				.and()
				.authorizeHttpRequests().requestMatchers("/claimBfcry/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/claimchrgs/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/ltclaim/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/ccdtls/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/claimest/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/claimpymt/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/docToDoList/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/claimPaid/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/polBeneficiary/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/polBroker/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/polCharge/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/polDiscLoad/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/polEmpCover/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/polEmployee/**").authenticated() 
				.and()
				.sessionManagement() 
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS) 
				.and() 
				.authenticationProvider(authenticationProvider()) 
				.addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class) 
				.build(); 
	} 

	// Password Encoding 
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance(); // Jasypt handles encryption and decryption
//    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        CustomAuthenticationProvider authenticationProvider = new CustomAuthenticationProvider(userDetailsService());
        return authenticationProvider;
    }

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception { 
		return config.getAuthenticationManager(); 
	} 


} 

