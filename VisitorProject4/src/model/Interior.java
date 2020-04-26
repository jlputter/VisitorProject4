package model;

public class Interior implements VehicleParts {
	
	public double price;
	public int interiorID;
	public String style;
	
	public Interior(double price, int interiorID, String style) {
		this.price=price;
		this.interiorID=interiorID;
		this.style=style;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getInteriorID() {
		return interiorID;
	}
	
	public String getStyle() {
		return style;
	}
	
	@Override
	public void accept(VehicleVisitor visitor)  
    { 
        visitor.visit(this); 
    } 

}
