
import java.util.*;

public class CheckPoint {
public static void main(String[] args) {
    System.out.println("Pleaase enter your score : ");
    Scanner scanner = new Scanner(System.in);
    int score = scanner.nextInt();

    if(score < 50 ){
        System.out.println("Score C");

    }else  if ( score > 50 && score < 70 ){
        System.out.println("Score B");

    }else if ( score > 70 && score < 100 ){
        System.out.println("Score A");

    }
    scanner.close();
}
    
}
