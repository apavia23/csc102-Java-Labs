package lab0_4;

public class invoice {
	public static void main(String args[]) {
		String item = new String("Banana");
		double unitPrice = 0.50;
		double quantity = 6;
		double taxRate = 0.10;
		double total, tax, subtotal;
		
		subtotal = unitPrice * quantity;
		tax = Math.round(unitPrice * quantity * taxRate * 100) / 100.00;
		total = (unitPrice * quantity) + tax;
		
		System.out.println("Item   Quantity   Unit Price   Subtotal    Tax    Total");
		System.out.println("_______________________________________________________________");
		System.out.println(item + "        " + quantity + "         " + unitPrice + "        " + subtotal + "     " + tax + "      " + total);
		
	}
}