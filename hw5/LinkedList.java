package cs152.hw5;

// Andrew Weekes
// CS 152
// Homework 5

public class LinkedList {

	String data;
	LinkedList next;

	// constructor
	public LinkedList(String data) {
		this.data = data;
		this.next = null;
	}

	// print current linked list
	public void println() {
		LinkedList temp = this;
		while (temp.next != null) {
			temp = temp.next;
			System.out.print(temp.data);
			if (temp.next != null) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	// add new LinkedList at front
	public void addAtFront(String data) {
		LinkedList newNode = new LinkedList(data);
		newNode.next = this.next;
		this.next = newNode;
	}

	// recursive size method
	public int size() {
		// base case
		if (this.next == null) {
			return 0;
		} else {
			// recursive case
			return 1 + this.next.size();
		}
	}

	public String getIndexData(int index) {
		int count = -1;
		LinkedList temp = this;
		while (temp.next != null && count < index) {
			if (index > this.size() || index < 0) {
				System.out.print("Error");
				return "Error";
			}
			temp = temp.next;
			count++;
		}
		return temp.data;
	}

}
