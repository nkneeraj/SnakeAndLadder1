package com.CG.SnakeLadder;

public class SnakeAndLadder1 {

	public static final int no_play = 0;
	public static final int ladder_value = 1;
	public static final int snake_value = 2;

	public static void main(String[] args) {

		System.out.println("Welcome to the game");

		int start_position = 0;
		int no_of_players = 1;
		int dice_value = (int) Math.floor(Math.random() * 10) % 6 + 1;

		int current_position = start_position;
		int action_taken = (int) Math.floor(Math.random() * 10) % 3;

		int counter = 0;

		while (current_position < 100) {
			dice_value = (int) Math.floor(Math.random() * 10) % 6;
			action_taken = (int) Math.floor(Math.random() * 10) % 3;
			counter++;
			if (action_taken == no_play)
				continue;
			else if (action_taken == ladder_value) {
				current_position += dice_value;
				if (current_position > 100)
					current_position -= dice_value;
			} else {
				current_position -= dice_value;
				if (current_position < 0)
					current_position = 0;
			}
			System.out.println("Counter" + counter + "\n" + "Current_position:" + current_position);
		}

	}
}
