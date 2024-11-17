package ma.xproce.ioc.web;

import ma.xproce.ioc.service.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigPresentation {public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext("metier" , "data");
    IMetier metier = (IMetier) applicationContext.getBean(IMetier.class);
    System.out.println(metier.calcul());
}

}
