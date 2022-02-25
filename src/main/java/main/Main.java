package main;

import Config.ProjectConfig;
import Entity.Student;
import Entity.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Teacher t1 = context.getBean(Teacher.class);



        System.out.println(t1);

    }
}
