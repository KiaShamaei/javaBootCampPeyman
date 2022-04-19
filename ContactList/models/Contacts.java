
package models ;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;


public class Contacts {


    private String name ;
    private String phoneNumber ;
    private String birthDate ;
    private int age ;


    public Contacts(String name , String phoneNumber , String birthDate) throws ParseException{
        this.name = name ;
        this.phoneNumber = phoneNumber ;
        this.birthDate = birthDate ;
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        Date toDate = formatter.parse(birthDate); //convert string to date type 
        long toMillisecond = toDate.getTime() ; //convert date to toMillisecond
        long diff = new Date().getTime() - toMillisecond ;
        this.age = (int)(TimeUnit.MILLISECONDS.toDays(diff) / 365);

    }

    public String toString() {
        return "Contacts [age=" + age + ", birthDate=" + birthDate + ", name=" + name + ", phoneNumber=" + phoneNumber
                + "]";
    }


    
    
}
