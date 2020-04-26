package client;

import model.*;

public class vehicleView {
	
	public static void main(String[] args)  
    { 
      
      VehicleParts interior = new Interior(600.0, 12345, "Cherry Wood");
      interior.accept(new VehicleVisitorImpl());
      
      System.out.println("****************************************************");
      
      VehicleParts exterior = new Exterior(600.0, 000001, "Yellow");
      exterior.accept(new VehicleVisitorImpl());
      
      System.out.println("****************************************************");
      
      VehicleParts wheels = new Wheels(600.0, 34534346, "Carbon", 5);
      wheels.accept(new VehicleVisitorImpl());
      
      System.out.println("****************************************************");
      
      VehicleParts windows = new Windows(600.0, 345345, "Dark Grey");
      windows.accept(new VehicleVisitorImpl());
      
                              

    } 

}
