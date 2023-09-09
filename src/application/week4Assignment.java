package application;

public class week4Assignment {

	 public static void main(String[] args) {

	        // 1.
	        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

	        // a.
	        int result = ages[ages.length - 1] - ages[0];

	        System.out.println("1.a. " + result);

	        // b. NOTE: arrays cannot be increased past their set size when initially created.

	        int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 44}; // added a new age
	        int difference = newAges[newAges.length - 1] - newAges[0];
	        System.out.println(" ");
	        System.out.println("1.b. *new number 44*: " + difference);

	        // c.

	        int total = 0;
	        for(int i = 0; i < newAges.length; i++) {
	            total += newAges[i];
	        }
	        int average = total / newAges.length;
	        System.out.println(" ");
	        System.out.println("1.c. The average age is: " + average);

	        // 2.

	        //a.
	        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

	        int totalLetters = 0;

	        for (int i=0; i < names.length; i++) {
	            totalLetters += names[i].length();
	        }
	        int averageLetters = totalLetters / names.length;
	        System.out.println(" ");
	        System.out.println("2.a. The average number of letters per name is: " + averageLetters);

	        //b.

	        String concatenatedNames = "";
	        for(int i=0; i < names.length; i++) {
	            concatenatedNames += names[i] + " ";
	        }
	        System.out.println("");
	        System.out.println("2.b. " + concatenatedNames);

	        // 3.
	        System.out.println("");
	        System.out.println("3. array[array.length - 1]");

	        // 4.
	        System.out.println("");
	        System.out.println("4. array[0]");

	        // 5.

	        int[] nameLengths = new int[names.length];

	        for(int i = 0; i < names.length; i++) {
	            nameLengths[i] = names[i].length();
	            System.out.println("");
	            System.out.println("5. " + nameLengths[i] );
	        }

	        // 6.

	        int lengthSum = 0;

	        for(int i = 0; i < nameLengths.length; i++) {
	            lengthSum += nameLengths[i];
	        }

	        System.out.println("");
	        System.out.println("6. " + lengthSum);

	        // 7.

	        String concatenatedWord = concatenateWord("Hello", 3);
	        System.out.println("");
	        System.out.println("7. " + concatenatedWord); // Output: "HelloHelloHello"
	        
	        // 8. printline
	        String printFullName = fullName("Karim", "Lopez");
	        System.out.println("");
	        System.out.println("8. " + printFullName);
	        
	        // 9. printline
	        int[] example = {10, 20, 30, 40, 50};
	        boolean booleanResult = sumGreaterThan100(example);
	        System.out.println("");
	        System.out.println("9. " + booleanResult);
	        
	        // 10. printline
	        double[] averageArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        double averageResult = calculateAverage(averageArray);
	        System.out.println("");
	        System.out.println("10. " + averageResult);
	        
	        //11. printline
	        double[] arr1 = {2, 4, 6, 8 ,10};
	        double[] arr2 = {1, 2 , 3 , 4, 5};
	        System.out.println("");
	        System.out.println("11. Array 1 is greater? " + greaterAverage(arr1, arr2));
	        
	        //12. printline
	        System.out.println("");
	        System.out.println("12. Able to buy drink? " + willBuyDrink(true, 11));
	        
	        //13. self method, show avaiable inventory with proper printline
	        String[] inventory = {"Apple", "Orange", "Watermelon", "Banana", "Mango"};
	        System.out.println("");
	        System.out.println("13. ");
	        System.out.println("AVAILABLE INVENTORY");
	        inventoryList(inventory);
	        }
	        
	    

	 // 7. method 
	    public static String concatenateWord(String word, int n) {
	        String result = "";
	        for (int i = 1; i <= n; i++) {
	            result += word;
	        }
	        return result;
	    }
	    
	 // 8. method
	    public static String fullName(String firstName, String lastName) {
	    	String result = "";
	    	result = firstName + " " + lastName;
	    
	    return result;
	    }
	    
	 // 9. method
	    public static boolean sumGreaterThan100(int[] nums) {
	    	int sum = 0;
	    	for (int num : nums) {
	    		sum += num;
	    	}
	    	return sum>100;
	    }
	    
	 // 10. method
	    
	    public static Double calculateAverage(double[] elements) {
	   double sum = 0;
	   for(int i=0; i <elements.length; i++) {
		   sum += elements[i];
	   }
	   double average = sum / elements.length;
	   return average;
	     
	    	
	    }
	    
	 // 11. method
	    public static boolean greaterAverage(double[] array1, double[] array2) {
	    	double sum1 = 0;
	    	double sum2 = 0;
	    	
	    	for(int i=0; i < array1.length;i++) {
	    		sum1 += array1[i];
	    	}
	    	for(int i=0; i < array2.length;i++) {
	    		sum2 += array2[i];
	    	}
	    	if(sum1 > sum2) {
	    		return true;
	    		
	    	}else {
	    		return false;
	    	}
	
	    } 
	    
	 // 12. method
	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    	if(isHotOutside == true && moneyInPocket > 10.50) {
	    		return true;
	    	}else {
	    		return false;
	    	}
	    }
	    
	    
	 // 13. method, iterates through array, printing out each option on their own line for easy selection
	    
	    public static void inventoryList(String[] inv) {
	    	
	    	for(int i=0; i < inv.length; i++) {
	    		System.out.println(inv[i]);
	    	}
	    	
	    	
	    }
	}
	


