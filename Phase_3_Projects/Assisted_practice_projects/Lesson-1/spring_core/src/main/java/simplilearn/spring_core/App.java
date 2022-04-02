package simplilearn.spring_core;

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
       
        
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        
        Employee e1 = (Employee) context.getBean("emp");
        
        System.out.println(e1);
        System.out.println(e1.getEid() +" "+e1.getEname());
        
        DAO dao =  context.getBean("dao_ref", DAO.class);
        
        System.out.println(dao);
        dao.getDAO();
        
       ServiceDemo service = context.getBean(ServiceDemo.class); // Type casting by class
       
       System.out.println(service);
       
     
       
    }
}
