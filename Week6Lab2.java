import java.util.Scanner;

public class Week6Lab2 {
	
		public static void main(String args []){

		Scanner scanner = new Scanner(System.in);

		int computer;
		int guess;
		
		System.out.print("Guess a number from 1-10:");
		guess = scanner.nextInt();
		
		computer = 1 +(int)(Math.random() * 10);
			System.out.print(computer);

		if ( guess == computer)
			System.out.println("you guessed right!!");
		
		else	
			if ( guess < computer)
				System.out.println("that's too low!");
		else 
			System.out.println("that's too high!");


	}

	}