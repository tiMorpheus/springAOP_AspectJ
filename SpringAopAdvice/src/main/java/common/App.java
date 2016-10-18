package common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.CustomerService;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"SpringCustomer.xml"});

        CustomerService service = (CustomerService) context.getBean("customerServiceProxy");

        System.out.println("*************************");
        service.printName();
        System.out.println("*************************");
        service.printURL();
        System.out.println("*************************");
        try {
            service.printThrowException();
        } catch (Exception e) {

        }

    }
}
