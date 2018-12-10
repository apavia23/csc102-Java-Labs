package lab7;

public class LinkedyList {
 
	public static void main(String args[])
	{
		LinkedList lList = new LinkedList();
		
		lList.add(4);
		lList.insertFirst(8);
		lList.insertFirst(12);
		lList.add(23);
		lList.print();
		System.out.println("");
		lList.insert(17, 2);
		
		lList.print();
		System.out.println("");
		lList.print(3);
	}
}

