import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("joe");
        name.add("john");
        name.add("joli");
        for(int i=0 ; i < name.size() ; i++){
            System.out.println(name.get(i));
        }
        name.add("kia");
        name.set(3 , "katie");
    }
    
}
