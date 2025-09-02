package com.training.quest4;

import java.util.Scanner;

public class PlayerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter media type VLC or Windows : ");
		String type = sc.nextLine();
		
		IMediaPlayer player;
		
		if(type.equalsIgnoreCase("vlc")) {
			player = new VLCMediaPlayer();
			player.playMusic();
			player.downloadMusic();
			((VLCMediaPlayer) player).playVideo();	
		}else {
			player = new WindowsMediaPlayer11();
			player.playMusic();
			player.downloadMusic();
			((WindowsMediaPlayer) player).playVideo();	
		}
		sc.close();

	}

}
