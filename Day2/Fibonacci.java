public class Fibonacci {
	private int first_num=1;
	private int second_num=1;
	private int third_num;
	private int sum=2;
	
		public void display() {
			System.out.println("The first 20 Fibonacci numbers are:");
			System.out.print(first_num+" "+second_num+" ");
			for(int i=2;i<20;i++) {
				third_num=first_num+second_num;
				first_num=second_num;
				second_num=third_num;
				System.out.print(third_num+" ");
				sum+=third_num;
			}
		}
		public void average() {
			System.out.println("\nThe average is "+sum/20.0);
		}
		
	
}

