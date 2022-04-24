import java.text.ParseException;

import models.Contacts ;
import models.ContactsManger;


public class Main {

    public static void main(String[] args) {
       try{
           ContactsManger manger = new ContactsManger();
           manger.addContact(new Contacts("kia", "0022124" , "11/11/1992"));
           manger.addContact(new Contacts("kami", "0022125" , "10/11/1984"));

           manger.addContact(new Contacts("kam", "0022126" , "11/11/1992"));

           manger.addContact(new Contacts("nader", "0022127" , "11/11/1992"));
           System.out.println(manger);

       }catch(ParseException e){
           System.out.println(e.getMessage());
       }finally{
        System.out.println("process is Done!");
       }

        
    }
    
}
