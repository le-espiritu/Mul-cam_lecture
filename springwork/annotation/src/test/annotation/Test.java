package test.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//스프링컨테이너 생성
		ApplicationContext container = new ClassPathXmlApplicationContext("/config/exam.xml");
		
		MyService service = (MyService) container.getBean("myservice");
		
		service.testLogic();

	}

}
