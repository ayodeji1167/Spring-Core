package main;

import Config.Configuration;
import Entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

        StudentService s1 = context.getBean(StudentService.class);
        s1.add();
    }
}
