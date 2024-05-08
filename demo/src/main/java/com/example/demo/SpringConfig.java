package com.example.demo;

import com.example.demo.repository.*;
import com.example.demo.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.swing.text.html.parser.Entity;

@Configuration
public class SpringConfig {

//
//    private DataSource dataSource;
//    private EntityManager em;
//
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }
//
//    @Bean
//    public MemberService memberService(){
//        return new MemberService(memberRepository());
//    }
//
//    @Bean
//    public MemberRepository memberRepository(){
////        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }


    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

}
