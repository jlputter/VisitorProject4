package model;

public class Wheels implements VehicleParts{
	
	public double price;
	public int wheelID;
	public String material;
	public int amount;
	
	public Wheels(double price, int wheelID, String material, int amount) {
		this.price=price;
		this.wheelID=wheelID;
		this.material=material;
		this.amount=amount;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getWheelID() {
		return wheelID;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public int getAmount() {
		return amount;
	}
	
	@Override
	public void accept(VehicleVisitor visitor)  
    { 
        visitor.visit(this); 
    } 

}
