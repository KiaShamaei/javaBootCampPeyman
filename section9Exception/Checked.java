import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Checked {

    public static void main(String[] args) {
        String address = "test.txt";
        try{
            loaddata(address);

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        
    }
    public static void loaddata(String address) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(address);
        Scanner scan = new Scanner(fis) ;
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }
    
}
