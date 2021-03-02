
public class javaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// loops allow us to repeat certain tasks. the code will run and loop until the
		// condition we give is not met anymore

		// i=0 so "i" will print increasing by 1, up to the 5 index.
		// index= (0,1,2,3,4)
		// 0 is the FIRST in the index, then 1,2,3,4. 4 being the FIFTH

	/*
		 * for (int x = 3; x < 10; x++) { System.out.println(x); }
		 
		 for (int z = 28; z < 35; z++) { System.out.println(z); }
		  
		  
	     // in this example you can increase by 2
		  
		  
		 for (int x = 2; x < 10; x = x + 2) { System.out.println(x); }
		 
		 
		 //Decreasing loops

		for (int y=9; y>=0; y--) {
			System.out.println(y);
		}
		
	*/
		
		// ARRAY LIST allows you to store multiple values in a single variable
		
		
		String[] BMW = {"M2", "M3", "M4", "M5", "M8", "X3M", "X4M", "X5M", "X6M"};
		System.out.println(BMW[3]);
		BMW[0]= "M2 Competition";
		System.out.println(BMW[0]);
		System.out.println(BMW[5]);
		

		String[] cars = { "BMW", "Mercedes", "Porsche", "Audi" };
		System.out.println(cars[0]);
		// substituing a value
		cars[3] = "Bentley";
		System.out.println(cars[3]);

	}

}
