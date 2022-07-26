package Crudopration.Crudopration;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("connection.xml");
        JdbcTemplate jd=(JdbcTemplate) context.getBean("db");
        
        temp ab=(temp) context.getBean("bean");
         String id= ab.getId();
         String name= ab.getName();
         String address= ab.getAddress();
         String date= ab.getDate();
         String email= ab.getEmail();
         String father= ab.getFather();
         String game= ab.getGame();
         String gender= ab.getGender();
         String std= ab.getStd();
         System.out.println("");
           //insert
           String insert = "insert into student12 (name,father,email,gender,std,address,game,date) values (?,?,?,?,?,?,?,?)";
          int a=  jd.update(insert,name,father,email,gender,std,address,game,date);
         System.out.println("insert sucessful " +a);
          //delet
         String delet= "delete from student12 where id="+date+ "";
         System.out.println("delet sucess ful");
         jd.execute(delet);
         
         //update
         String update="update student12 set  name=?, father=?, email=?,gender=?,std=?,address=?,game=?,date=? where id="+id+"";	
         int b=  jd.update(update,name,father,email,gender,std,address,game,date);
 
         System.out.println("update sucessful......" +b);
         
         //list 
         String list="select * from student12 where id=" + id  +"";
         List<Map<String, Object>>  list2= jd.queryForList(list);
             System.out.println(list2.get(0));
          
        
        
        
    }
}
