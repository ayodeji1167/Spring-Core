package main;

import Config.ProjectConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import service.StudentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        StudentService st = context.getBean(StudentService.class);
        String message = st.hello("john");

        System.out.println("Result is " + message);
    }
}
