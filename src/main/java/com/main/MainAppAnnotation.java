package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppAnnotation {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);
        student.display();
    }
}