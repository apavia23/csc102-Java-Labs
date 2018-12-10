package lab7;

public class LinkedyList {
 
	public static void main(String args[]){
		LinkedList<Integer> lList = new LinkedList<Integer>();
		
		lList.add(4);
		lList.insertFirst(8);
		lList.insertFirst(12);
		lList.add(23);
		lList.insert(17, 2);
		lList.add(29);
		lList.add(33);
		
		lList.print(3);
		System.out.println("");
		
		for(int i : lList) {
			System.out.println(i);
		}
		
		lList.remove(6);
		System.out.println("");
		for(int i : lList) {
			System.out.println(i);
		}
	}
}

