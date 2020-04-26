package model;

public class Windows implements VehicleParts{
	
	public double price;
	public int windowID;
	public String tint;
	
	public Windows(double price, int windowID, String tint) {
		this.price=price;
		this.windowID=windowID;
		this.tint=tint;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getWindowID() {
		return windowID;
	}
	
	public String getTint() {
		return tint;
	}
	
	@Override
	public void accept(VehicleVisitor visitor)  
    { 
        visitor.visit(this); 
    } 

}
