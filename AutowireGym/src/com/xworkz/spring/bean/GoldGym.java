package com.xworkz.spring.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("goldGym")
public class GoldGym implements Gym {

	@Resource
	@Qualifier("trainingTypes")
	private List<String> trainingTypes;

	public GoldGym() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	@Override
	public boolean training(String type) {
		System.out.println("invoked training of goldGym");
		System.out.println(trainingTypes);
		for (String string : trainingTypes) {
			System.out.println("fetching from xml\t" + string);

			if (string.equals(type)) {
				System.out.println("type found in goldGym");
				return true;
			}
		}
		System.out.println("type not found in goldGym");
		return false;
	}

	public List<String> getTrainingTypes() {
		return trainingTypes;
	}

	public void setTrainingTypes(ArrayList<String> trainingTypes) {
		this.trainingTypes = trainingTypes;
	}

}
