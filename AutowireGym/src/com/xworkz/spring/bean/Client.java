package com.xworkz.spring.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Client {

	@Value("free")
	private String memberType;
	@Autowired
	@Qualifier("snapFitness")
	private Gym gym;
	
	public Client() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public void workout() {
		System.out.println("invoked workout");
		System.out.println(this.gym.training("bice"));
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMemberType() {
		return memberType;
	}

}
