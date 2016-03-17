import java.util.Scanner;

public class Week6Lab3 {
	public static void main (String [] args)
	
	{
			
		Scanner in =new Scanner(System.in);
			
		int computer;
		int user;

			System.out.println("Guess a number:  ");
			user = in.nextInt();
		if ( user >9 || user <0 )
			{	System.out.println (" The number selected is invalid. Choose a number between 1-9.");
				System.exit(0);
			}		
			computer =0 + (int) (Math.random() *10);
			System.out.println(computer);		


		if ( computer == user)
			System.out.println("You guessed it right.");
		
		else if ( computer< user)
			System.out.println("The number is too big.");
				
		else 
			System.out.println("The number is too small.");
		


	}

	}
