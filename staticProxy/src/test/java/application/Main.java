package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;
import serviceProxy.UserServiceProxy;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserServiceProxy userServiceProxy = (UserServiceProxy)applicationContext.getBean("userServiceProxy");
		User user = userServiceProxy.getUser();
		System.out.println(user.toString());
	}

}
