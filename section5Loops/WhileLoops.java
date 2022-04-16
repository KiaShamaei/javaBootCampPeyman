import java.util.Scanner;

public class WhileLoops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to count down : ");
		int number = scan.nextInt();
		while(number < 5){
			System.out.println("Enter a number to count down : ");
			number = scan.nextInt();
		}
	}
	
}
