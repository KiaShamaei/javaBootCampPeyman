import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        System.out.println("print a for buy and print b for sell ...");
        Scanner scan = new Scanner(System.in);
        String serivce = scan.nextLine();
        switch(serivce){
            case "a" :{
                System.out.println("enter your budget ...");
                int budjet = scan.nextInt();
                if(budjet > 10000){
                    System.out.println("you have enough budjet ...");
                    System.out.println("\ndo you have insurance yes or no");
                    scan.nextLine();


                    String insurance = scan.nextLine();
                    System.out.println("\ndo you have credit yes or no");
                    String credit = scan.nextLine();
                    
                    if (insurance.equals("yes") && credit.equals("yes")){
                        System.out.println("\n good job great... ");
                    }else {
                        System.out.println("\n you are not eligible...");
                    }


                }else{
                    System.out.println("\n your budjet isnt enough ...");
                }
                break ;
            }
            case "b":{
                System.out.println("\nwhat is your car value at? ");
                int valueCar = scan.nextInt();
                scan.nextLine();
                System.out.println("what is your selling price ?");
                int priceCar = scan.nextInt();
                if( valueCar > priceCar && priceCar < 30000){
                    System.out.println("\n we will buy your .");
                }else{
                    System.out.println("\n we are not interested!");
                }
                break;
            }
            default : {
                System.out.println("This is out of service ...");
            }
        }
        scan.close();
    }
    
    
}
