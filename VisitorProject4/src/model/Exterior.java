package model;

public class Exterior implements VehicleParts {
	
	public double price;
	public int exteriorID;
	public String color;
	
	public Exterior(double price, int exteriorID, String color) {
		this.price=price;
		this.exteriorID=exteriorID;
		this.color=color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getExteriorID() {
		return exteriorID;
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public void accept(VehicleVisitor visitor)  
    { 
        visitor.visit(this); 
    } 
}
