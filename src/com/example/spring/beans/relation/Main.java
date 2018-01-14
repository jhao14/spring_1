package com.example.spring.beans.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.example.spring.beans.collection.autowire.Address;
import com.example.spring.beans.collection.autowire.Person;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-relation.xml");
	    /*Address address=(Address) ctx.getBean("address");
	    System.out.println(address);*/
	    Address address2=(Address) ctx.getBean("address2");
	    System.out.println(address2);  
	    Person person=(Person) ctx.getBean("person");
	    System.out.println(person);
	}
}
