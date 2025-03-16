package me.medev.dependency_injection.press;

import me.medev.dependency_injection.service.IService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PressSpringXml {
    public static void main(String[] args) {
        System.out.println("PressSpringXml - instantiate the service and the repository using Spring XML");
        ApplicationContext context = new ClassPathXmlApplicationContext(("config.xml"));
        IService iService = (IService) context.getBean("IService");
        System.out.println(iService.calculate());
    }
}
