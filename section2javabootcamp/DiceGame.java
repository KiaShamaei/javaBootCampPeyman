import java.util.Scanner;

class DiceGame {
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);

		System.out.println("Please enter your number:  ");
		int roll1 = rollDice();
		int roll2= rollDice();
		int roll3 = rollDice();
		int sum = roll1 + roll2 + roll3 ;
		int yourNumber = scan.nextInt();
		if(sum > yourNumber){
			System.out.println("you lose ...");
		}else{
			System.out.println("you win ...");
		}
		System.out.println(roll1);
		System.out.println(roll2);
		System.out.println(roll3);
	}
	public static int rollDice(){
		double dicenumber =( Math.random() * 6) + 1 ;
		return (int) dicenumber;
	}
}