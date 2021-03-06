package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello loserStar~~~~!!!");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//		ApplicationContext applicationContext2 = new FileSystemXmlApplicationContext("");//文件路径
		//默认无参构造方法构造实例
		Hello hello = (Hello)applicationContext.getBean("hello");
		hello.say();
		
		//使用有参构造方法
		Hello hello1 = (Hello)applicationContext.getBean("hello1");
		hello1.say();
		
		//使用静态工厂构造
		Hello hello2 = (Hello)applicationContext.getBean("hello2");
		hello2.say();
		
		
		//使用动态工厂构造
		Hello hello3 = (Hello)applicationContext.getBean("hello3");
		hello3.say();
		
		
		//使用别名调用hello3
		Hello loser = (Hello)applicationContext.getBean("loser");
		loser.say();
		//使用别名调用hello3
		Hello star = (Hello)applicationContext.getBean("star");
		star.say();
		
		//使用class类型的方式获取bean,并且loserHello有个属性依赖于Hello
		LoserHello loserHello = (LoserHello)applicationContext.getBean(LoserHello.class);
		loserHello.say();
		
		//命名空间注入
		LoserHello2 loser2 = (LoserHello2)applicationContext.getBean("loser2");
		loser2.say();
		
	}

}
