package aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentServiceAspect {

    //Going To execute before the method starts execution
    @Before("execution(* service.StudentService.hello(..))")
    public void before() {
        System.out.println("I have done my work!");
    }


    //Going to execute after the method completes execution IRRESPECTIVE of EXCEPTIONS
    @After("execution(* service.StudentService.hello(..))")
    public void after() {
        System.out.println("I have done my work after!");
    }

    //Going to execute after the method completes execution without an execution
    @AfterReturning("execution(* service.StudentService.hello(..))")
    public void afterReturning() {
        System.out.println("I have done my work after returning!");
    }

    //Going to execute only if the method throws an exception
    @AfterThrowing("execution(* service.StudentService.hello(..))")
    public void afterThrowing() {
        System.out.println("I have done my work after throwing!");
    }


    @Around("execution(* service.StudentService.hello(..))")
    public Object around(ProceedingJoinPoint joinPoint){
        System.out.println("A");
        Object message = null;
        try {
            message = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        System.out.println("B");

        return message;

    }

}
