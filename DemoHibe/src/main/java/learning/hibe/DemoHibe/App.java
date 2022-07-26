package learning.hibe.DemoHibe;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(registry);
		Session session = sf.openSession();
		
		session.beginTransaction();

		
    	Employee employee=new Employee();
    	
    	employee.setName("Karan");
    	employee.setDesignation("trainee");
    	employee.setAge(21);
    	employee.setEmail("kk@gmail.com"); 
    	
    	//session.save(employee);
    	//System.out.println(employee);
    	//Employee emp=(Employee) session.get(Employee.class, 1);
    	//System.out.println(emp);
    	//emp.setAge(20);
    	//session.update(emp);
    	//session.delete(emp);
    	Query q=session.createQuery("select max(age)From Employee");
    	//q.setInteger(0, 3);
    	//Employee emp=(Employee) q.uniqueResult();
    	//System.out.println(emp);
		int maxage=Integer.parseInt(q.uniqueResult().toString());
		 System.out.println(maxage); 
		  
		  
    	session.getTransaction().commit();
    	
    }
}
