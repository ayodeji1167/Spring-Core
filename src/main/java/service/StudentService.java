package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.StudentRepo;

@Component
public class StudentService {


    @Autowired
    private StudentRepo studentRepo;

    public void add() {
        studentRepo.add();
        studentRepo.add();
        studentRepo.add();

    }
}
