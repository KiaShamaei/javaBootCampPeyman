import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.Contacts;
import models.ContactsManger;

public class Main {

	static ContactsManger manager = new ContactsManger();

	public static void main(String[] args) {
       try{

          loadContact("contact.txt");

       }catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }finally{
        System.out.println("process is Done!");
		System.out.println(manager);
       }

        
    }

	public static void loadContact(String addressFile) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(addressFile);
		Scanner scan = new Scanner(fis);
		while (scan.hasNextLine()) {
			try {
				Contacts contact = new Contacts(scan.next(), scan.next(), scan.next());
				manager.addContact(contact);

			} catch (ParseException e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
