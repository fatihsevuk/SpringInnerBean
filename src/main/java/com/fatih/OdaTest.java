package com.fatih;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OdaTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("app-config.xml");
		Oda oda=context.getBean("odaId" ,Oda.class);
		System.out.println(oda);
		((ClassPathXmlApplicationContext)context).close();

	}

}
