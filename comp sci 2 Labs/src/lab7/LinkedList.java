package lab7;

public class LinkedList {
	private Node head;

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
	
	public void add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = newNode;
		}
	}
	
	public void insert(int data, int index) {
		Node newNode = new Node();
		newNode.data = data;
		if(head == null) {
			head = newNode;
		}else {
			Node n = head;
			for(int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			newNode.next = n.next;
			n.next = newNode;
		}
	}
	
	public void print() {
		Node n = head;
		while(n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
	
	public void print(int index) {
		Node n = head;
		for(int i = 0; i < index; i++) {
			n = n.next;
		}
		System.out.println(n.data);
	}
	
	class Node {
		public int data;
		public Node next;
	}

	class Iterator{
		
	}
}
