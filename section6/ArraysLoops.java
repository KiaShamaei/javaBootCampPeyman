import java.util.Arrays;

public class ArraysLoops {
	public static void main(String[] args) {
		String [] menu = {"larte" , "ice coffee" , "macciato"} ;
		String[] newMenu = new String[5];
		for(int i=0 ; i < menu.length ; i++){
			newMenu[i] = menu[i];
		}

		//we can change index content from null to something
		newMenu[3] = "ddd";
		newMenu[4] = "ccc" ;
		System.out.println(Arrays.toString(newMenu));
	}
	
}
