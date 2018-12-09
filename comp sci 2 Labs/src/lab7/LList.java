package lab7;

import javax.swing.JOptionPane;

class Node {
	public int data;
	public Node next;
 
	public void displayNodeData() {
		JOptionPane.showMessageDialog(null, "{ " + data + " }");
	}
}
 
public class LList {
	private Node head;
 
	public boolean isEmpty() {
		return (head == null);
	}
 
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
 
	public Node deleteFirst() {
		Node temp = head;
		head = head.next;
		return temp;
	}
 
	public void deleteAfter(Node after) {
		Node temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next = temp.next.next;
	}
 
 	public void printLinkedList() {
 		JOptionPane.showMessageDialog(null, "Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	
	}
}
