package ma.xproce.ioc.web;

import ma.xproce.ioc.service.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation {
    public static void main(String[] args) {
//BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//EmailService emailService = context.getBean("emailService" , EmailService.class);
        IMetier implMetier = (IMetier) context.getBean("nomService");
    }
}
