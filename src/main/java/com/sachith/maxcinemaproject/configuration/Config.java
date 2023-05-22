package com.ravindupriyankarapremachandra.maxcinemaproject.configuration;

import com.ravindupriyankarapremachandra.maxcinemaproject.controllers.seatController;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class Config {
    @Bean
    public ClassLoaderTemplateResolver primaryTemplateResolver() {
        ClassLoaderTemplateResolver primaryTemplateResolver = new ClassLoaderTemplateResolver();
        primaryTemplateResolver.setPrefix("templates/");
        primaryTemplateResolver.setSuffix(".html");
        primaryTemplateResolver.setTemplateMode(TemplateMode.HTML);
        primaryTemplateResolver.setCharacterEncoding("UTF-8");
        primaryTemplateResolver.setOrder(1);
        primaryTemplateResolver.setCheckExistence(true);
        return primaryTemplateResolver;
    }
    @Bean
    public SessionFactory getSessionFactory() {
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        configuration.addAnnotatedClass(seatController.class);
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

        return sessionFactory;
    }



}
