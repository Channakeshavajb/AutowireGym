package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.bean.Client;

public class GymTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resource/context.xml");
		Client client = context.getBean(Client.class);
		client.workout();
		

	}

}
