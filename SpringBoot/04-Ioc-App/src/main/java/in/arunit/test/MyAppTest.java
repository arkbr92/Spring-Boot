package in.arunit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");

	}

}
