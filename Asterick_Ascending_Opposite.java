package Nested_For_Loop.com;

public class Asterick_Ascending_Opposite {

	public static void main(String[] args) {

		for (int i = 1; i <= 5 ; i++) {
			
			
			for (int j = 5; j >= i ; j--) {
				System.out.print("* ");				
			}
			System.out.println();
		}
	}

}
