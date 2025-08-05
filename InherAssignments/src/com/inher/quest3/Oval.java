package com.inher.quest3;

public class Oval extends Figures{

	@Override
	void volume(int r1, int r2) {
//		super.volume(x, y);
        System.out.println("Oval Volume: " + (3.14 * r1 * r2 * 5)); 

	}

}
