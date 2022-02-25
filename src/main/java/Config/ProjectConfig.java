package Config;


import Entity.Student;
import Entity.Teacher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "Entity")
public class ProjectConfig {


//    @Bean
//    public Student student() {
//        Student s = new Student();
//        s.setName("Johny");
//        return s;
//    }
//
//    @Bean
//    public Teacher teacher(Student student) {
//        Teacher t = new Teacher();
//        t.setStudent(student);
//        return t;
//
//    }

    @Bean
    @Qualifier("student1")
    public Student student1() {
        Student s = new Student();
        s.setName("Johny");
        return s;
    }

    @Bean
    @Qualifier("student2")
    public Student student2() {
        Student s = new Student();
        s.setName("Magnet");
        return s;
    }

}
