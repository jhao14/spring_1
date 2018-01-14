package com.example.spring.beans.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans-cycle.xml");
         Car car=(Car) ctx.getBean("car");
         System.out.println(car);
         //�ر�IOC����
         ctx.close();
	}
}
