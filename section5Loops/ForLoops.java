import java.util.Scanner;

public class ForLoops {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to count down : ");
		int number = scan.nextInt();
		for (int i=0 ; i< number ; i++){
			System.out.print(i);
		}
	}
	
}
