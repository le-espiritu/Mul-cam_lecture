package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
	ApplicationContext를 이용
	------------------
	    IoC컨테이너(스프링프레임워크 내부에서 빈의 생성, 소멸, 사용하는 곳으로 injection해주는 컴포넌트)
	    
	classpath => 실행할 클래스를 찾기 시작하는 위치
	             src     
 */
public class MySpringTest2 {
	public static void main(String[] args) {
		//1. xml설정파일을 classpath로 부터 찾아서 정의되어 있는 빈을 만들고 관리
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/bean.xml");
		//2. 컨테이너가 갖고 있는 빈을 lookup하기
		MyBeanStyle obj = (MyBeanStyle)factory.getBean("mybean");
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyle obj) {
		System.out.println("**************************");
		obj.testHello("장동건");
		obj.testHello("장동건");
		System.out.println("**************************");
	}
	
	public static void show(MyBeanStyle obj) {
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
		obj.testHello("장동건");
	}
}






