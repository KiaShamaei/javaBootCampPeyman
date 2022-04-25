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
          loadContact("E:\\java1401\\ContactList\\contact.txt");
          System.out.println(manager);
		  manageContacts();
       }catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }finally{
        System.out.println("process is Done!");
		System.out.println(manager);
       }

        
    }

	public static void loadContact(String addressFile) throws FileNotFoundException {
		System.out.println("\n\ntest");
		FileInputStream fis = new FileInputStream(addressFile);
		
		Scanner scanfile = new Scanner(fis);
		while (scanfile.hasNextLine()) {
			try {
				Contacts contact = new Contacts(scanfile.next(), scanfile.next(), scanfile.next());
				manager.addContact(contact);

			} catch (ParseException e) {
				System.out.println(e.getMessage());
			}

		}
		scanfile.close();

	}
	public static  void manageContacts(){
		Scanner scan = new Scanner(System.in);
		while (true){
			System.out.println("\n\n Please select enter your action : \n \t\t a) for add: \n \t\t b)for remove: \n \t\t c)for exit:");
			String response = scan.nextLine();
			if (response.equals("a")){
				System.out.println("\t name: ");
				String name = scan.nextLine();
				System.out.println("\t phone: ");
				String phone = scan.nextLine();
				System.out.println("\t birthday: ");
				String birthday = scan.nextLine();
				try{
					manager.addContact(new Contacts(name,phone,birthday));
				}catch (ParseException e) {
					e.printStackTrace();
				}

			}else if (response.equals("b")){
				System.out.println("\n Who would you like to remove? ");
				manager.removeContacts(scan.nextLine());
				System.out.println("\n\n Updated Contacts\n\n" + manager);
			}else{
				break;
			}
			
		}
		scan.close();
	}

}
