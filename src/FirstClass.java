
public class FirstClass {

	public static void main(String[] args) {
					
		int digit = Sequence(1, 8, true) % 10;
		
		if (digit % 2 == 0 ) {
			Sequence(10, 10, false);
		}
		else {
			Sequence(5, 10, false);
		}
	}
	
	public static int Sequence(int num, int j, boolean q) {
		
		int total = 0;
		
		int i = 1;
		
		int num2 = 0;
		
		while(i <= j) {
			
			int subtotal = num * i;
			
			total = subtotal + num2;
			
			System.out.println(total);
			
			i++;
			
			if (q == true) {
				num2 = subtotal;
			}

		}
		
		return total;
	}

}