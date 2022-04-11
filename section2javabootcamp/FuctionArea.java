import java.util.Scanner;

public class FuctionArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n enter a number as x"); 
        int x = scan.nextInt();
        System.out.println("\n enter a number as y");
        int y = scan.nextInt();

        FuctionArea fuctionArea = new FuctionArea();
        System.out.println(fuctionArea.areaCalculator(x, y));
    }
    public int areaCalculator( int x , int y){
        return x * y ;
    }
}
