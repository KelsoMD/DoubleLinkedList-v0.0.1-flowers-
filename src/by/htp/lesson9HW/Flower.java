package by.htp.lesson9HW;

public class Flower {

	String budColor;
	String leafColor;
	int height;
	int price;
	
	public Flower() {
		budColor = "Yellow";
		leafColor = "White";
		height = 10;
		price = 5;
	}
	
	public Flower(String budColor, String leafColor, int height, int price) {
		this.budColor = budColor;
		this.leafColor = leafColor;
		this.height = height;
		this.price = price;
	}

	public String getBudColor() {
		return budColor;
	}

	public void setBudColor(String budColor) {
		this.budColor = budColor;
	}

	public String getLeafColor() {
		return leafColor;
	}

	public void setLeafColor(String leafColor) {
		this.leafColor = leafColor;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		String str = "Bud color: " + this.budColor + " Leaf color: " + this.leafColor + " Height: " + this.height
				+ " Price: " + this.price;
		return str;
	}

}
