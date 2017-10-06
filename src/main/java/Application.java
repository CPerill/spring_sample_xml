import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.perill.service.customerService;
import com.perill.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		customerService service = appContext.getBean("customerService", customerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
