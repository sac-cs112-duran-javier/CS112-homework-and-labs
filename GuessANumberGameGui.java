import javax.swing.JOptionPane;


public class GuessANumberGameGui{
	public static void main(String args []){
	int guess, computerNum;
	computerNum = 1 +(int)(Math.random() * 10);
	guess=
		Integer.parseInt(JOptionPane.showInputDialog("Guess a number(from 1-10):"));
	
	
	if ( guess == computerNum)
		JOptionPane.showMessageDialog(null, "you guessed right!! I chose " + computerNum);
	
	else if ( guess < computerNum)
		JOptionPane.showMessageDialog(null, "that's too low!! I chose " + computerNum);
	else
		JOptionPane.showMessageDialog(null, "that's too high! I chose " + computerNum);


}

}