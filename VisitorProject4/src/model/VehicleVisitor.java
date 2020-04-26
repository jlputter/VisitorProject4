package model;

public interface VehicleVisitor {

	void visit (Interior interior);
	void visit (Exterior exterior);
	void visit (Wheels wheels);
	void visit (Windows windows);
	
}
