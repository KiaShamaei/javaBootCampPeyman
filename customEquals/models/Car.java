package models ;

public class Car {
    public Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Car(Car car) {
        this.name = car.name ;
        this.model = car.model ;
        this.price = car.price ;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false ;
        }else if(!(obj instanceof Car)){
            return false ;

        }
        Car car = (Car) obj ;
        return this.name.equals(car.name) && this.model.equals(car.model) && this.price == car.price;

    }
    @Override
    public String toString() {
        return "Car [model=" + model + ", name=" + name + ", price=" + price + "]";
    }
    private String name ;
    private String model ;
    private int price ;

    
}
