package com.funinter.ques4;

public class GamesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGames indoor = () ->System.out.println("Indoor games: chess,carrom,table tennis");
		IGames outdoor = () ->System.out.println("outdoor games: cricket,football,Tennis");
		
		indoor.showGames();
		outdoor.showGames();
	}

}
