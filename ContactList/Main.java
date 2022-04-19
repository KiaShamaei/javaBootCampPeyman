import java.text.ParseException;

import models.Contacts ;


public class Main {

    public static void main(String[] args) {
       try{
        Contacts contact = new Contacts("kia shamaei" , "09123492956" , "04/23/1984");
        System.out.println(contact);
       }catch(ParseException e){
           System.out.println(e.getMessage());
       }finally{
        System.out.println("process is Done!");
       }

        
    }
    
}
