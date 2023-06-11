package com.jspider.musicplayer.main;

public class Musicplayer {
      
	private String Song;
	private String Singer;
	private int Songid;
	
    public int getSongid(){
		switch (Songid) {
		case 1:
			System.out.println("Dil Diyan Gallain");
			break;
		
		case 2:
			System.out.println("Teri Meri");
			break;
			

		case 3:
			System.out.println("Chikni Chameli");
			break;
			

		case 4:
			System.out.println("Believer");
			break;
		default:
			break;
		}
	}
}
