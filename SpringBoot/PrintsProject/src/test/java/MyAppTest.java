import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.arunit.Atm;

public class MyAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctxt= new ClassPathXmlApplicationContext("beans.xml");
	
		Atm atm= ctxt.getBean(Atm.class);
		atm.withdraw();
	
	}

}
