import java.util.Scanner;

public class GradesAverageTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int no_of_students=sc.nextInt();
		GradesAverage gradesAverage = new GradesAverage();
		gradesAverage.input_grade(no_of_students);
		gradesAverage.average();
	}
}
