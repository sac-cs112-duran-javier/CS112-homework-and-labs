import java.util.Scanner;


public class Week6Lab3a{
	public static void main(String args []){

	Scanner scanner = new Scanner(System.in);

	int computerNum;
	int guess;
	
	System.out.print("Guess a number(from 1-10):");
	guess = scanner.nextInt();
	
	computerNum = 1 +(int)(Math.random() * 10);
		System.out.println("the computer guesses:" + computerNum);
	
	if ( guess < computerNum || guess > computerNum)
		System.out.println("you guessed wrong!!!");
	else
		System.out.println("you guessed right!!");

}

}