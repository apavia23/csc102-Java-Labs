package lab1;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class gradesFile {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Double> grades = new ArrayList<Double>();
		File file = new File("D:\\Users\\Kids\\eclipse-workspace\\comp sci 2 Labs\\src\\lab1\\grades.txt");
		Scanner fileIn = new Scanner(file); 
		  
	    while (fileIn.hasNextLine()) {
	      grades.add(Double.parseDouble(fileIn.nextLine()));
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
		fileIn.close();
	}

}
