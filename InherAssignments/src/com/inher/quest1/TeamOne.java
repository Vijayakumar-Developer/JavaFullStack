package com.inher.quest1;

public class TeamOne extends Project {

	@Override
	void doTask() {
		 // override doTask - "Project implemented using Java" 
		//super.doTask();
		System.out.println("Project implemented using Java");
	}
	void softwaresUsed(String... tools){ 
		System.out.println("Software used by team One: ");
		for(String tool : tools) {
			System.out.println(tool);
		}
	
	}


}
