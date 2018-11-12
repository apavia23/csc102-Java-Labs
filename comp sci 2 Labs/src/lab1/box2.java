package lab1;
import javax.swing.*;

public class box2 {
	public static void main(String [] args){
		int age;
		String response;
		response = JOptionPane.showInputDialog("How old are you?");
		age = Integer.parseInt(response);
		if (age >= 18) {
			System.out.println("You can vote.");
		}else {
			System.out.println("Sorry, you can't vote");
		}
	}
}