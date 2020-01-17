import model.*;
import week1.CatBus;

public class VehicleNoise {
	//add your new vehicle class to the model package
	//only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
		
		CatBus Totoro = new Van();
		System.out.println(Totoro.makeNoise());
		
	}

}
