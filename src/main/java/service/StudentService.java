package service;

import org.springframework.stereotype.Component;


@Component
public class StudentService {

    public String hello(String name) {
        String message = "Hello " + name;
        System.out.println(message);
        return message;

    }

}
