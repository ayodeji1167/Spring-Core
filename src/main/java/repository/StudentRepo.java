package repository;

import org.springframework.stereotype.*;


@Component
public class StudentRepo {

    public void add()
    {
        System.out.println("Student added! ");
    }

}
