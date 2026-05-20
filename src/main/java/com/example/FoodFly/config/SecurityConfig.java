package com.example.FoodFly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfigurationSource;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http,
            CorsConfigurationSource corsConfigurationSource) throws Exception {

    	 http
    	 .cors(cors -> {})
         .csrf(csrf -> csrf.disable())

         .authorizeHttpRequests(auth -> auth
             .requestMatchers(
                 "/customerDetails/login",
                 "/customerDetails/register",
                 "/menuItems/**"
             ).permitAll()

             .anyRequest().permitAll()
         )

         .formLogin(form -> form.disable());

     return http.build();
    }
}