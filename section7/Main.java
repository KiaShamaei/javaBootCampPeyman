import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String[] parts = {"k23", "m23"};
		Car doge = new Car("Doge" , 33000.33 , "red" , 2010 , parts);

		//ref trap for object 
		Car doge2 = doge ;
		//in this situation both method chang 
		doge2.setColor("yellow");
		//solution is make new obj 
		Car doge3 =  new Car("Doge model" , 3600.33 , "blue" , 2015 , parts);
		doge3.setColor("black");
		

		Car nissan = new Car(doge3);
		parts[1]= "XXX";


		doge.drive();
		doge2.drive();
		doge3.drive();
		String [] test = nissan.getParts();
		test[1] = "yyyy";
		System.out.println(Arrays.toString(nissan.getParts()));
		System.out.println(Arrays.toString(doge3.getParts()));

	}
	
}
