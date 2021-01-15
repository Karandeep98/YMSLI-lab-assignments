import java.util.Arrays;

public class CopyOf {
	private static int arr[] = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		System.out.print("Original Array: ");
		for (int a : arr)
			System.out.print(a + " ");
		int copy_arr[]=copyOf(arr);
		System.out.print("\nCopied Array: ");
		for (int a : copy_arr)
			System.out.print(a + " ");
		System.out.print("\nOriginal Array: ");
		for (int a : arr)
			System.out.print(a + " ");
	}

	public static int[] copyOf(int[] array) {
		int arr[]=Arrays.copyOf(array, array.length);
		return arr;
	}
}
