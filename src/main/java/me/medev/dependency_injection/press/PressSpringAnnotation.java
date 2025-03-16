package me.medev.dependency_injection.press;

import me.medev.dependency_injection.service.IServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PressSpringAnnotation {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.medev.dependency_injection");

        System.out.println("PressSpringAnnotation - instantiate the service and the repository using Spring annotations");
        IServiceImpl iServiceImpl = context.getBean(IServiceImpl.class);
        System.out.println(iServiceImpl.calculate());
    }
}
