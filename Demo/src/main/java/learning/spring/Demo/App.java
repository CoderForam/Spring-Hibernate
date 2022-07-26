package learning.spring.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        //Person p=(Person)context.getBean("person");
       // System.out.println(p);
        
        
        
        Address add=(Address)context.getBean("address");
        add.setCity("xx");
        add.setState("yy");
        System.out.println(add);
        Address a1=(Address)context.getBean("address");
        
        
        System.out.println(a1);
        
        
		/*
		 * Person p=new Person(); p.setId(1); p.setName("Samarth");
		 * System.out.println(p);
		 */
        
    }
}
