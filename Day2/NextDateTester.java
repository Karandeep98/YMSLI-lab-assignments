import java.util.Scanner;

public class NextDateTester {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no. of days to be incremented:");
		int n=sc.nextInt();
		NextDate d= new NextDate(5,1,2021);
		d.addDays(d.getDay(), d.getMonth(), d.getYear(), n);
		//d.increment(n);
		System.out.println(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
	}
}
