import java.util.ArrayList;
import java.util.Scanner;

public class GradesAverage {
	private ArrayList<Double> grade = new ArrayList<>();
	private int no_of_students;

	public void input_grade(int no_of_students) {
		this.no_of_students=no_of_students;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < no_of_students;) {
			System.out.print("Enter the grade for student " + (i + 1) + ":");
			Double value=sc.nextDouble();

			if (value>= 0 && value <= 100) {
				grade.add(value);
				i++;
			}
			else
				System.out.println("Invalid grade, try again...");
		}
	}

	public void average() {
		double sum = 0;
		for (double a : grade)
			sum += a;
		System.out.println("The average is:" + sum / no_of_students);
	}

}
