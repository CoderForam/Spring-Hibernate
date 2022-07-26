package learning.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(registry);
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Student s=new Student();
		s.setId(2);
		s.setName("Mihir");
		s.setRollNo(20);
		 
		session.save(s);
		
	Student s1=	(Student) session.get(Student.class, 1);
	System.out.println(s1);
		session.getTransaction().commit();
		
	}
}
