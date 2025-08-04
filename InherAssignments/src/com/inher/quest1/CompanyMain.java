package com.inher.quest1;

public class CompanyMain {

	public static void main(String[] args) {
		Project project =  new TeamOne(); 
		project.doTask();
		
		TeamOne teamone =new TeamOne();
		teamone.softwaresUsed("Spring","MicroService","Spring MVC");
		
		Project project1 =  new TeamTwo();
		project1.doTask();
		TeamTwo teamtwo =new TeamTwo();
		String[] techStack = teamtwo.getTechStack();
		
		System.out.println("Tech Stack used by Team Two : ");
		for(String tech : techStack) {
			System.out.println(tech);
			
		}
		
	}

}
