public class Comparison {
    public static void main(String[] args) {
        String str = "kia";
        String str2 = "kia2";
        String str3 = "kia";

        int number = 12 ;
        int number2 = 13 ;
        boolean bool = str.equals(str2);
        boolean bool2 = !str.equals(str3);
        if (bool || bool2){
            System.out.println(number);
        }else{
            System.out.println(number2);

        }
    }
    
}
