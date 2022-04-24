import java.util.Arrays;

public class Car {
	private String make ;
	private double price ;
	private String color ;
	private int year ;
	private String[] parts ;
	public Car(String make , double price , String color , int year , String[] parts){
		this.make = make;
		this.color = color ;
		this.year = year ;
		this.price = price;
		this.parts = Arrays.copyOf(parts, parts.length);
	}
	public Car(Car source){
		this.make = source.color;
		this.price = source.price;
		this.year = source.year;
		this.color = source.color;
		this.parts = Arrays.copyOf(source.parts, source.parts.length);

	}

	public String getMake(){
		return this.make;
	}
	public double getprice(){
		return this.price;
	}
	public int getYear(){
		return this.year;
	}
	public String getColor(){
		return this.color;
	}
	public String[] getParts(){
		return Arrays.copyOf(this.parts, this.parts.length);
	}
	public void setMake(String make){
		this.make = make;
	}
	public void setColor(String color){
		this.color = color;

	}
	public void setYear(int year){
		this.year = year;

	}
	public void setPrice(double price){
		this.price = price;

	}
	public void setParts(String[] parts){
		this.parts = Arrays.copyOf(parts, parts.length);

	}
	public void drive(){
		System.out.println("this is your car" +  this.make + " with this price: " + this.price + "this color : " + this.color );
	}

	
}
