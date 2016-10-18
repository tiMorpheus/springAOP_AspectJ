package core;

import customer.ICustomer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception{

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringCustomer.xml");

        ICustomer customer = (ICustomer) context.getBean("customer");

        customer.addCustomer();

        customer.addCustomerReturnValue();

        customer.addCustomerAround("Tymur");
    }
}
