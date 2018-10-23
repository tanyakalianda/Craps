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
		
		if (roll1 + roll2 == 7 || roll1 + roll2 == 11);
		{
			System.out.print("You win!");
			System.out.print("Do you want to play again? Press 1 for yes and 2 for no: ");
			in.nextInt();
			
		}
		
	}

}
