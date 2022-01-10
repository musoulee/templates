package com.mj.core.dao;


import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
    @Test
    public void testConnection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        SqlSessionFactory sqlSessionFactory = context.getBean("sqlSessionFactory", SqlSessionFactory.class);
        sqlSessionFactory.openSession();
        System.out.println(sqlSessionFactory);
    }

}