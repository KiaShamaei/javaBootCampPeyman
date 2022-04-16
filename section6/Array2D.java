public class Array2D {


	public static void main(String[] args) {
		int [][] grades = {
			{12,14,15,16},
			{20,14,18,16},

			{18,14,20,19},

			{18,17,20,18}
		};
		for(int i = 0  ; i < grades.length ; i ++ ){
			switch (i){
				case 1 : System.out.println("\t kami"); break;
				case 2 : System.out.println("\t kami"); break;
				case 3 : System.out.println("\t kami"); break;
			}
			for(int j = 0  ; j <  grades[i].length ; j ++){
				System.out.println( grades[i][j] , " ");
			}
		}
	}
	
}
