
public class TimeTable {
	private int row;
	private int column;

	public TimeTable() {
		row = 0;
		column = 0;
	}
	public void print() {
		for (int i = 1; i <= 9; i++) {
			for (int j = i; j <= 9 * i;) {
				System.out.print(j + " ");
				j += i;
			}
			System.out.println();
		}
	}
}
