package com.xworkz.spring.bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("snapFitness")
public class SnapFitnessGym implements Gym {

	
	@Value("${valueofstring}")
	private String[] triningTypes1;

	
	
	public SnapFitnessGym() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	@Override
	public boolean training(String type) {
		System.out.println("invoked training of SnapFitness");
		for (String string : triningTypes1) {
			System.out.println("snapfitness string array is:\t"+string);
			if (type.equals(string)) {
				System.out.println("type found in snapfitness");
				return true;
			} 
		}
		System.out.println("type not found insnapfitness");
		return false;
	}
	
	public void setTriningTypes1(String[] triningTypes1) {
		this.triningTypes1 = triningTypes1;
	}
	
	public String[] getTriningTypes1() {
		return triningTypes1;
	}

	/*public void setTriningTypes1(String... triningTypes1) {
		this.triningTypes1 = triningTypes1;
	}
	
	public String[] getTriningTypes1() {
		return triningTypes1;
	}*/
}
