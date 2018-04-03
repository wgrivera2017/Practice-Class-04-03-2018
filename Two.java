
public class Two {

	public static void main(String[] args) {
		
		int [] numlist = {2,6,7};
		int [] numlist2 = {2,5,3};
		int [] numlist3 = new int[2];
		
		for (int i = 0; i < numlist3.length; i++) {

			numlist3[i] = numlist[i] + numlist2[i];
			System.out.println(numlist3[i]);
		}

	}
}
