package models;

import java.util.ArrayList;

public class ContactsManger {
    ArrayList <Contacts> contacts;
    public ContactsManger(){
        this.contacts = new ArrayList<Contacts>();
    }
    public Contacts getContacts (int index){
        return new Contacts(contacts.get(index));
    }
    public void setContacts(Contacts contact , int index){
        contacts.set(index , new Contacts(contact));
    }
    public void addContact(Contacts contact){
        contacts.add(new Contacts(contact));
    }
	//remove by name get string name 
    public void removeContacts (String name){
		if (contacts.isEmpty()){
			throw new IllegalStateException("cant remove item from empthy list ...!");
		}
        for(int i = 0 ; i < contacts.size() ; i ++){
            if(contacts.get(i).getName().equals(name)){
                contacts.remove(i);
            }
        }
    }
    public String toString(){
        String temp = "" ;
        for (int i = 0 ; i < contacts.size() ; i++){
            temp += contacts.get(i).toString();
            temp += "\n\n";
        }
        return temp ;
    }

}
