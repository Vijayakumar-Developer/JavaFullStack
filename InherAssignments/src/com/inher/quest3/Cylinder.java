package com.inher.quest3;

public class Cylinder extends Figures{

	@Override
	void volume(int r, int h) {
		//super.volume(x, y);
        System.out.println("Cylinder Volume: " + (3.14 * r * r * h));
	}

}
