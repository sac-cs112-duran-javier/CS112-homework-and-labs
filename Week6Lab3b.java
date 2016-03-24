import java.util.Scanner;


public class Week6Lab3b{
	public static void main(String args []){

	Scanner scanner = new Scanner(System.in);

	int x;
	int y;
	int max;
	
	System.out.print("Guess a number:");
	x = scanner.nextInt();
	
	y = 1 +(int)(Math.random() * 10);
		System.out.println("the computer guessed: " +y);
	
	
	if (x== y)
		System.out.println(" correct!");
	else
	{		max = (x > y) ? x : y;
			System.out.println("You guessed it wrong");
}
}

}