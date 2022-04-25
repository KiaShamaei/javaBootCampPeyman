
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
        if(name == null || name.isBlank() || phoneNumber == null || phoneNumber.isBlank() || phoneNumber.length() < 9 ){
            throw new IllegalArgumentException("input not acceptabel...");
        }
        this.name = name ;
        this.phoneNumber = phoneNumber ;
        this.birthDate = birthDate ;
        this.age = findAge(birthDate);

    }
    public Contacts (Contacts contacts ){
        this.name = contacts.name;
        this.phoneNumber = contacts.phoneNumber;
        this.birthDate = contacts.birthDate;
        this.age= contacts.age;
    }

    public String toString() {
        return "Contacts [age=" + age + ", birthDate=" + birthDate + ", name=" + name + ", phoneNumber=" + phoneNumber
                + "]";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank() || name == null){
            throw new IllegalArgumentException("input for name illegal ...");
        }
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.isBlank() || phoneNumber == null || phoneNumber.length()> 9){
            throw new IllegalArgumentException("input for phone illegal ...");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        setAge(findAge(birthDate));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static int findAge(String birthDate) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        Date toDate = formatter.parse(birthDate); //convert string to date type 
        long toMillisecond = toDate.getTime() ; //convert date to toMillisecond
        long diff = new Date().getTime() - toMillisecond ;
        return (int)(TimeUnit.MILLISECONDS.toDays(diff) / 365);
    }


    
    
}
