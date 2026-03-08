package com.projeto.pizzaria.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // desativa CSRF (necessário para API REST)
                .csrf(csrf -> csrf.disable())

                // libera TODAS as requisições
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()
                )

                // desativa qualquer tipo de login
                .httpBasic(basic -> basic.disable())
                .formLogin(form -> form.disable());

        return http.build();
    }
    }


