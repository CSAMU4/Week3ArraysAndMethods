

/**
 * 
 */

/**
 * @author Candace Samuels
 *
 */
public class ArrayAssignement {

	
	private static int[] ages;
	private static int firstElement;
	private static int lastElement;
	private static int diffElement;
	private static int sum;
	private static int avg;
	private static int count;
	private static String temp;
	private static int avgWord;
	private static int[] namesLengths;
	private static int sumLength;
	private static String word;

	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		// create an array of integers called ages and add the following values: 3, 9, 23, 64, 2, 8, 28, 93. 
		ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
			ages.toString(); 
			
		
		firstElement = ages[ages.length - ages.length]; // first element in the array
		lastElement = ages[ages.length - 1]; // last element in the array 
		
		System.out.println("First Element: " + firstElement);
		System.out.println("Last element: " + lastElement);
				 
		// subtract the first and last element in the array without printing ages[7]. 
		
		diffElement = (lastElement - firstElement); // 93 - 3 = 90 
		
		System.out.println("The difference between the last element and first element:" + " " + diffElement);
		
		// add a new age to the array and repeat
		ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
	
			//add the new element to array manually 	
			ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 20}; 
				System.out.println("New Last Element:" + ages[ages.length - 1]); 
			int diffElement = (ages[ages.length - 1] - firstElement); 
				
				System.out.println("The difference between the new last element and first element:" + " " + diffElement); 
	
		// loop through the array and calculate the average then print to console 
					
		//		ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 20};
			//int i = 0;
				//for (i = 0; i < ages.length; i++); 
				
					
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			
				int i = 0;
				for (count = 0; i < names.length; i++); 

			count += names.length; 
			
			avgWord = count / names.length; 
			
				System.out.println("Average number of letters per name is" + " " + avgWord); 
		
		namesLengths = new int[names.length]; 
			for (int i1 =0; i1 < names.length; i1++); 
			
		sumLength = sum(names.length); 
				System.out.println("Sum of namesLength Array is:" + "" + sum(names.length));
				
		
		// write a method that takes String word and an int = times to return the concatenated word

			String word = "Hello"; 
			int times = 3; 
		
		//	System.out.println("String:" + String.repeat(0)); // hard time establishing the method 
			
		// write a method with two Strings, firstName and LastName, and return full name 
			String firstName = "Jeffrey"; 
			String lastName = "Gavilanes"; 
			String fullName= (firstName + " " + lastName);
				System.out.println(fullName); 

				
		// write a method of array integers and return true if the sum of all the int are greater than 100 
		
			
		
					
				
			
		
			
			
			
					
			
			
			
		
			
		
			
			
			
		
			
		
			
			
			
			
			
			
			
			 
				
				
			
			
				
				
		
		
			 
			 
			 
		
			 
			 	
			 
			 
			
			
	}



	private static boolean isGreaterthan(int[] ages2) {
		// TODO Auto-generated method stub
		return false;
	}



	private static boolean isGreaterthan)(int[] is) {
		// TODO Auto-generated method stub
		return false;
	}



	private static String repeat(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}



	private static String concatenate(String word2, int n2) {
		// TODO Auto-generated method stub
		return null;
	}



	private static int sum(int length) {
		// TODO Auto-generated method stub
		return 0;
	}

}
