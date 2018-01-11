package by.htp.lesson9HW;

public class Bouquet {

	private Node firstNode;
	private Node lastNode;
	private int count;

	public Bouquet() {
		firstNode = new Node();
		lastNode = firstNode;
	}

	public Bouquet(Flower flower) {
		firstNode = new Node(flower);
		lastNode = firstNode;
	}

	private class Node {
		Node previousNode;
		Node nextNode;
		Flower flower;

		public Node() {

		}

		public Node(Flower flower) {
			this.flower = flower;
		}

		public boolean hasNext() {
			if (this.nextNode != null) {
				return true;
			} else {
				return false;
			}
		}

	}

	public int getCount() {
		return this.count;
	}

	public boolean isEmpty() {
		if (this.firstNode.flower == null) {
			return true;
		} else {
			return false;
		}
	}

	public void addFlower(Flower flower) {
		Node tempNode = new Node(flower);
		if (count == 0) {
			firstNode.flower = tempNode.flower;
			count++;
			System.out.println("First FLower added");
		} else {
			tempNode.previousNode = this.lastNode;
			this.lastNode.nextNode = tempNode;
			this.lastNode = tempNode;
			count++;
			System.out.println("Node added to the end");
			// add FLower to the end of the list
		}
	}

	public void addFirstFlower(Flower flower) {
		Node tempNode = new Node(flower);
		tempNode.nextNode = this.firstNode;
		this.firstNode.previousNode = tempNode;
		this.firstNode = tempNode;
		count++;
		System.out.println("Node added to the start");
	}

	public void addAfterValue(Flower flower, Flower newFlower) {
		Node tempNewNode = new Node(newFlower);
		Node tempNode = firstNode;
		for (int i = 0; i < count; i++) {
			if (tempNode.flower.equals(flower)) {
				tempNode.nextNode.previousNode = tempNewNode;
				tempNewNode.nextNode = tempNode.nextNode;
				tempNewNode.previousNode = tempNode;
				tempNode.nextNode = tempNewNode;
				count++;
				System.out.println("Node added after value");
				break;
			}
		}
	}

	public void removeFirst() {
		this.firstNode = this.firstNode.nextNode;
		this.firstNode.previousNode = null;
		count--;
		System.out.println("First Node removed");
	}

	public void removeLast() {
		if (count == 0) {
			System.out.println("List is empty");
			return;
		}
		Node tempNode = lastNode.previousNode;
		tempNode.nextNode = null;
		this.lastNode = tempNode;
		count--;
	}

	public void removeValue(Flower flower) {
		Node tempNode = firstNode;
		for (int i = 0; i < count; i++) {
			if (tempNode.flower.equals(flower)) {
				if (i == 0) {
					firstNode = tempNode.nextNode;
					tempNode.nextNode.previousNode = null;
					count--;
					System.out.println("Node removed by value.");
					break;
				}
				if (i == count - 1) {
					lastNode = tempNode.previousNode;
					tempNode.previousNode.nextNode = null;
					count--;
					System.out.println("Node removed by value.");
					break;
				}
				if (i > 0 && i < count - 1) {
					tempNode.nextNode.previousNode = tempNode.previousNode;
					tempNode.previousNode.nextNode = tempNode.nextNode;
					count--;
					System.out.println("Node removed by value.");
					break;
				} else {
					tempNode = tempNode.nextNode;
				}
			}
		}
	}

	public void printList() {
		int printCount = 1;
		Node tempNode = firstNode;
		for (int i = 0; i < count; i++) {
			System.out.println(printCount + " " + tempNode.flower.toString());
			printCount++;
			tempNode = tempNode.nextNode;
		}
	}
}
