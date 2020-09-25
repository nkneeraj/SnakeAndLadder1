package com.CG.SnakeLadder;

public class SnakeAndLadder1 {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the game");
		
		int start_position = 0;
		int no_of_players = 1;	
		int dice_value = (int)Math.floor(Math.random()*10)%6+1;
		
		System.out.println("Start position:"+start_position + "\n" +"Dice value:"+dice_value);
	}
}
