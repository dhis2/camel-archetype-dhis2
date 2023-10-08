#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
public class DefaultSecurityConfig {
  @Bean
  protected SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    return http.requestMatchers()
        .antMatchers("/management/**", "/login", "/logout")
        .and()
        .authorizeRequests()
        .anyRequest()
        .authenticated()
        .and()
        .csrf()
        .and()
        .formLogin()
        .and()
        .httpBasic()
        .and()
        .headers()
        .frameOptions()
        .sameOrigin()
        .and()
        .csrf()
        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
        .and()
        .build();
  }
}
