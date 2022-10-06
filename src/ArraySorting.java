import java.util.Arrays;
import java.util.Random;

public class ArraySorting {

	public static void main(String[] args) {
		
		int n = 6;
				
		int[] array = new int[n];
		
		int max = 0;
		
		int[] oddarray = new int[n];
		
		int[] evenarray = new int[n];
		
		int j = 0;
		
		int k = 0;
		
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = random.nextInt(5000);

			if (array[i] > max){
				max = array[i];
			}
		}
		
		System.out.println("Randomised Array : " + Arrays.toString(array));
		
		System.out.println("Max value = " + max);
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] % 2 == 0) {
				evenarray[j] = array[i];
				j++;
			}
			else {
				oddarray[k] = array[i];
				k++;
			}
			
		}
		
		System.out.println("Even Array : " + Arrays.toString(evenarray));
		
		System.out.println("Odd Array : " +Arrays.toString(oddarray));
	}

}
