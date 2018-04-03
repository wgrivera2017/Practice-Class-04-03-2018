import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input 2 numbers");

		int [] numlist = new int[2];
		int [] numlist2 = new int[2];
		int [] numlist3 = new int[2];

		for (int i = 0; i < numlist3.length; i++) {
			numlist[i] = scanner.nextInt();
			numlist2[i] = scanner.nextInt();
			numlist3[i] = numlist[i] + numlist2[i];
			System.out.println(numlist3[i]);
			}
		
		scanner.close();
	}

}
