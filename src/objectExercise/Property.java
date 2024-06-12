package objectExercise;

public class Property {
	
	private String objectName;
	private String ownerName;
	private String propertyType;
	private int propertyPrice;
	
	Property(String objectName, String ownerName, String propertyType, int propertyPrice){
		this.objectName = objectName;
		this.ownerName = ownerName;
		this.propertyType = propertyType;
		this.propertyPrice = propertyPrice;
	}
	
	public void information () {
		System.out.println("物件名 : " + this.objectName);
		System.out.println("物件所有者名 : " + this.ownerName);
		System.out.println("物件種別 : " + this.propertyType);
		System.out.println("物件価格 : " + this.propertyPrice + "円");
	}
	
	public String getObjectName() {
		return this.objectName;
	}
	
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public void setOwnerName(String objectName) {
		this.objectName = ownerName;
	}
	
	public String getPropertyType() {
		return this.propertyType;
	}
	
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	
	public int getPropertyPrice() {
		return this.propertyPrice;
	}
	
	public void setPropertyPrice(int propertyPrice) {
		this.propertyPrice = propertyPrice;
	}

}
