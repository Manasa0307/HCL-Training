package com.src;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
	University u=context.getBean(University.class);
	System.out.println(u.getId()+u.getName());
	List<String> courses=u.getCoursesoffered();
		courses.stream().forEach(course->System.out.println(courses));
	}
}
