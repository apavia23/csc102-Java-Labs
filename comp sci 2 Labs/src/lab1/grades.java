package lab1;
import java.util.*;
import javax.swing.*;

public class grades {
	public static void main(String[] args) {
		ArrayList<Double> grades = new ArrayList<Double>();
		String response;
		for(int i = 0; i <= 9; i++) {
			int placeHolder = i + 1;
			response = JOptionPane.showInputDialog("Enter grade " + placeHolder);
			double temp = Double.parseDouble(response);
			grades.add(temp);
		}
		Collections.sort(grades);
		double gradeHigh = grades.get(9);
		double gradeLow = grades.get(0);
		double gradesTotal = 0.0;
		for(int i = 0; i <= 9; i++) {
			gradesTotal = gradesTotal + grades.get(i);
		}
		double gradeAverage = gradesTotal / grades.size();
		
		JOptionPane.showMessageDialog(null, "Student's grades: " + grades + "\nHighest Grade: " + gradeHigh + "\nLowest Grade: " + gradeLow + "\nAverage: " + gradeAverage);
	}

}
