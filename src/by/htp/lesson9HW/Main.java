package by.htp.lesson9HW;

public class Main {

	public static void main(String[] args) {
		Bouquet bouquet = new Bouquet();
		//System.out.println(bouquet.isEmpty());
		//System.out.println(bouquet.hasNext());
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		Flower f3 = new Flower("Brown", "Red", 15, 15);
		Flower f4 = new Flower();
		Flower f5 = new Flower("New Color", "New Bud", 10, 10);
		bouquet.addFlower(f1);
		//System.out.println(bouquet.isEmpty());
		//System.out.println(bouquet.hasNext());
		bouquet.addFlower(f2);
		bouquet.addFlower(f4);
		bouquet.addFirstFlower(f3);
		bouquet.addAfterValue(f3, f5);
		bouquet.printList();
		//bouquet.removeLast();
		//bouquet.removeFirst();
		bouquet.removeValue(f3);
		bouquet.printList();
	}

}
