package model;

public class VehicleVisitorImpl implements VehicleVisitor{

	@Override
	public void visit(Interior interior) {
		
		
		if(interior.getPrice() > 400.0) 
        { 
            interior.price = interior.getPrice() * .95; 
        } 
        else 
            interior.price = interior.getPrice(); 
		
		
		
		System.out.println(" - Interior Info -");
	    System.out.println("Interior Style: " + interior.getStyle());
	    System.out.println("Interior Price: " + interior.getPrice());
	    System.out.println("Interior Part ID: " + interior.getInteriorID());
		 
	}

	@Override
	public void visit(Exterior exterior) {
		// TODO Auto-generated method stub
		
		if(exterior.getPrice() > 400.0) 
        { 
            exterior.price = exterior.getPrice() * .95; 
        } 
        else 
            exterior.price = exterior.getPrice(); 
		
		
		
		System.out.println(" - Exterior Info -");
	    System.out.println("Exterior Color: " + exterior.getColor());
	    System.out.println("Exterior Color Price: " + exterior.getPrice());
	    System.out.println("Exterior Color ID: " + exterior.getExteriorID());
	}

	@Override
	public void visit(Wheels wheels) {
		// TODO Auto-generated method stub
		if(wheels.getAmount() >= 4) 
        { 
		
            wheels.price = wheels.getPrice() * .80; 
        } 
        else 
        	
        	wheels.amount = wheels.getAmount();
            wheels.price = wheels.getPrice(); 
		
		
		System.out.println(" - Wheel Info -");
	    System.out.println("Wheel Material: " + wheels.getMaterial());
	    System.out.println("Wheels Total Price: " + wheels.getPrice());
	    System.out.println("Wheel Model ID: " + wheels.getWheelID());
	    System.out.println("Amount of Wheels: " + wheels.getAmount());
	
	}

	@Override
	public void visit(Windows windows) {
		
		
		System.out.println(" - Interior Info -");
	    System.out.println("Interior Style: " + windows.getTint());
	    System.out.println("Interior Price: " + windows.getPrice());
	    System.out.println("Interior Part ID: " + windows.getWindowID());
	    
	    if(windows.getTint().equals("Dark Grey")) 
        { 
            System.out.println("------* Tint illegal in some states *-------");
		// TODO Auto-generated method stub

	}
	
   }
}


