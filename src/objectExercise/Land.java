package objectExercise;

public class Land extends Property{
	private double space;
	
	Land(String objectName, String ownerName, String propertyType, int propertyPrice, double space){
		super(objectName, ownerName, propertyType, propertyPrice);
		this.space = space;
	}

public void information (){
	super.information ();
	System.out.println("広さ : " + this.space + "㎡");
	}

public double getSpace() {
	return this.space;
	}

public void setSpace(double space) {
	this.space = space;
	}
}
