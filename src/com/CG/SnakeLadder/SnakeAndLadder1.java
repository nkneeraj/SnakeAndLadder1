package com.CG.SnakeLadder;

public class SnakeAndLadder1 {

	public static final int no_play = 0;
	public static final int ladder_value = 1;
	public static final int snake_value = 2;
	public static final int no_of_players = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to the game");
		
		int dice_value = (int) Math.floor(Math.random() * 10) % 6 + 1;
		int action_taken = (int) Math.floor(Math.random() * 10) % 3;

		int counter1 = 0;
		int counter2 = 0;
		int p1_position = 0;
		int p2_position = 0;

		while(p1_position !=100 && p2_position !=100)
		{	
			dice_value = (int)Math.floor(Math.random()*10)%6+1;
			action_taken = (int)Math.floor(Math.random()*10)%3;
			counter1++;
			if(action_taken == no_play){}
			else if(action_taken == ladder_value)
			{
				while(action_taken==ladder_value)
				{
					dice_value = (int)Math.floor(Math.random()*10)%6+1;
					action_taken = (int)Math.floor(Math.random()*10)%3;
					p1_position+=dice_value;
					if(p1_position > 100)
						p1_position-=dice_value;
					
					counter1++;
				}
			}
			else
			{	
				p1_position-=dice_value;
				if(p1_position<0)
					p1_position=0;
			}

			if(p1_position==100)
				break;
			else
			{
				dice_value = (int)Math.floor(Math.random()*10)%6;
				action_taken = (int)Math.floor(Math.random()*10)%3;
				counter2++;
				if(action_taken == no_play)
				{}
				else if(action_taken == ladder_value)
				{	while(action_taken==ladder_value)
				{
					dice_value = (int)Math.floor(Math.random()*10)%6;
					action_taken = (int)Math.floor(Math.random()*10)%3;
					p2_position+=dice_value;
					if(p2_position > 100)
						p2_position-=dice_value;
					
					counter2++;
				}
				}
				else
				{	
					p2_position-=dice_value;
					if(p2_position<0)
						p2_position=0;
				}
			}
		}
		System.out.println("Player1 position:"+p1_position+ " Counter1:"+counter1+ "\n"+"Player2 Position:"+p2_position+" Counter2:"+counter2 );

		if(p1_position==100)
			System.out.println("Player 1 is the winner");
		else
			System.out.println("Player 2 is the winner");
	}
}
