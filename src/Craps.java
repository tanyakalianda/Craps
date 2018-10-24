import java.util.Scanner;

public class Craps
{

	public static void main(String[] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Welcome to the Craps Game! Please press enter to roll the dice: ");
		in.nextLine();
		
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int sum = roll1 + roll2;
		System.out.println("Roll1: " + roll1 + " Roll2: " + roll2 + " Sum: " + sum);
		
		if (sum == 7 || sum == 11)
		{
			System.out.println("You win!");	
		}
		else if (sum == 2 || sum == 12)
		{
			System.out.println("You lose!");
		}
		else if (sum == 3 || sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10)
		{
			int point = sum;
			System.out.println("Your point is: " + point);
			System.out.print("Press enter to roll the dice again: ");
			in.nextLine();
						
			boolean rollAgain = true;
			while (rollAgain)
			{
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				sum = roll1 + roll2;
				System.out.println("Roll1: " + roll1 + " Roll2: " + roll2 + " Sum: " + sum);
					
				if (sum == point)
				{
					System.out.println("You win!");
					rollAgain = false;
				}
				else if (sum == 7)
				{
					System.out.println("You lose!");
					rollAgain = false;
				}
				else 
				{
					System.out.print("You need to roll again. Press enter to roll the dice again: ");
					in.nextLine();
				}
			}
			
		System.out.print("Do you want to play again? Press 1 for yes and 2 for no: ");
		int answer = in.nextInt();
		in.nextLine();
		
		boolean playAgain = true;
		while (playAgain)
		if (answer == 1)
		{
			System.out.print("Let's play again! Please press enter to roll the dice: ");
			in.nextLine();
			
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			sum = roll1 + roll2;
			System.out.println("Roll1: " + roll1 + " Roll2: " + roll2 + " Sum: " + sum);
			
			if (sum == point)
			{
				System.out.println("You win!");
				rollAgain = false;
			}
			else if (sum == 7)
			{
				System.out.println("You lose!");
				rollAgain = false;
			}
			else 
			{
				System.out.print("Press enter to roll the dice again: ");
				in.nextLine();
			}
			
			rollAgain = true;
			while (rollAgain)
			{
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				sum = roll1 + roll2;
				System.out.println("Roll1: " + roll1 + " Roll2: " + roll2 + " Sum: " + sum);
					
				if (sum == point)
				{
					System.out.println("You win!");
					rollAgain = false;
				}
				else if (sum == 7)
				{
					System.out.println("You lose!");
					rollAgain = false;
				}
				else 
				{	
					System.out.print("Press enter to roll the dice again: ");
					in.nextLine();
				}
			}
		}
		else if (answer == 2)
		{
			System.out.println("Maybe next time!");;
			playAgain = false;
		}
		else
		{
			System.out.print("Invalid input. Please try again: ");
			answer = in.nextInt();
			in.nextLine();
		}
			
			
			
			
			
		}
			
	}

}
