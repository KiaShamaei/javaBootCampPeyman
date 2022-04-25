
import models.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car ("toyota", "1222" , 2000);
        // Car sameCar = new Car(car);

        //in equals normal belowe code  print false so we should write custome equals
        Car sameCar = new Car("toyota", "1222" , 2000);
        System.out.print(sameCar.equals(car));
    }
    
}
