package lab7;

public class LinkedyList {
 
	public static void main(String args[])
	{
		LList lList = new LList();
		lList.insertFirst(5);
		lList.insertFirst(6);
		lList.insertFirst(7);
		lList.deleteFirst();

		Node node=new Node();
		node.data=1;
		lList.deleteAfter(node);

		lList.printLinkedList();
	}
}

