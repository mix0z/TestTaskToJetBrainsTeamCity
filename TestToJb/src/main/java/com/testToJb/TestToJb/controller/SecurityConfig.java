//package com.testToJb.TestToJb.controller;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    public void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
//                .antMatcher("/**").authorizeRequests()
//                .antMatchers("/home").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .oauth2Login();
//        httpSecurity
//                .logout(l -> l
//                .logoutSuccessUrl("/").permitAll());
//    }
//}
