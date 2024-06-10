package objectExercise;

public class Apartment extends Property {
	private String floorPlan;
	
	Apartment(String objectName, String ownerName, String propertyType, int propertyPrice, String floorPlan){
		super(objectName, ownerName, propertyType, propertyPrice);
		
		this.floorPlan = floorPlan;
	}
public void information () {
	super.information();

	System.out.println("物件価格 : " + this.floorPlan);
	}

public String getFloorPlan() {
	return this.floorPlan;
	}

public void setFloorPlan(String floorPlan) {
	this.floorPlan = floorPlan;
	}
}