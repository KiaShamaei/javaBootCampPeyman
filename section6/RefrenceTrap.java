import java.util.Arrays;

public class RefrenceTrap {
public static void main(String[] args) {
	String[] lastYearStuff = {"kia" , "kami" , "kam" };
	//bad clone which make refernce trap 
	String [] newYearStuffWithTrap = lastYearStuff ;
	//change one of stuff to show trap 
	newYearStuffWithTrap[1] = "mahsi" ;
	System.out.println(Arrays.toString(lastYearStuff));
	System.out.println(Arrays.toString(newYearStuffWithTrap));
	//true way to clone array to prevent refrence trap
	String[]  newYearStuff = new String[3] ;
	for(int i = 0 ; i < lastYearStuff.length ;  i++){
		newYearStuff[i] = lastYearStuff[i];
	}
	newYearStuff[0] = "donya";
	//this is show clone without trap of refrence 
	System.out.println(Arrays.toString(newYearStuff));
	//an other way to clone 
	String[] newYearStuff2 = Arrays.copyOf(lastYearStuff, lastYearStuff.length);
	newYearStuff2[0]= "dorsa" ;
	System.out.println(Arrays.toString(newYearStuff2));


}
}
