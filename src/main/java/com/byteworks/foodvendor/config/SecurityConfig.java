package com.byteworks.foodvendor.config;

import com.byteworks.foodvendor.services.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(myUserDetailsService).passwordEncoder(passwordEncoder());
    }
/*
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
                auth.inMemoryAuthentication()
                .withUser("Vendor").password("{noop}password").credentialsExpired(true).accountExpired(true).accountLocked(true)
                .authorities("WRITE_PRIVILEGES", "READ_PRIVILEGES").roles("VENDOR");

    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers( HttpMethod.POST, "/api/v1/users", "/api/v1/users/login").permitAll()
                .antMatchers(HttpMethod.GET, "/api/v1/foods").hasRole("DEV")
                .antMatchers(HttpMethod.POST, "/api/v1/orders").hasRole("DEV")
              // .antMatchers(HttpMethod.GET, "/api/v1/orders").hasRole("VENDOR")
                //  .antMatchers(HttpMethod.POST, "/api/v1/orders/**").hasRole("VENDOR")
                .and().csrf().disable()
        .formLogin().disable();

    }
}
