package week4;

import java.util.ArrayList;

public class Week04 {
	//	lab specified objects
	public static int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
	public static int[] ages2 = { 1, 9, 12, 23, 64, 2, 8, 28, 95 };
	public static ArrayList<String> names = new ArrayList<>();
	public static ArrayList<Integer> nameLengths =new ArrayList<>(); 

//	initialization for lab objects as they are used in methods for problems 2 and 5 it makes sense to define and initialize these once outside of defining the methods for each problem.
	public static void init() {
		names.add("Sam");
		names.add("Tommy");
		names.add("Tim");
		names.add("Sally");
		names.add("Buck");
		names.add("Bob");
	}
	
	public static void prob1() {
		

		System.out.println(ages[ages.length - 1] - ages[0]);

		//1.a -  both use index of array length -1 so are dynamic
		System.out.println(ages2[ages2.length - 1] - ages2[0]);

		// we need to average the ages but expect it will not return a whole number so
		// need double data type vs int

		double sum = 0;

		// this loop iterates through the array ages and sums the values of the array
		for (int age : ages) {

			// this adds the next age in the array to the running sum and continues to
			// iterate through the array
			sum = sum + age;

		}

		// this calculates the average of the ages array by dividing the sum of the
		// array values by the length of the array
		// we want to use a double type here versus int, as we do not expect it to
		// return a whole number and do not want it truncated so it will return an
		// accurate average

		double average = sum / ages.length;
		// print average
		System.out.println(average);
	}
	
	//problem two
	public static void prob2() {
		System.out.println(names);
		
	//iterate through array via loop to calculate average number of letters per name
		
		double sum = 0;

		// this loop iterates through the array names and sums the values of the array
		for (String name : names) {

			// this adds the length of the next name in the array 
			sum = sum + name.length();
		}
		
		// this averages the length of the names in the array
		
		double average = sum / names.size();
		
		// print average of name length
		System.out.println(average);
		
	}
	
	//prob 5 and 6 
	public static void prob5() {
		int sum = 0;
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array. 
		// this loop iterates over the previously created array names and appends the length of each name to the ArrayList nameLengths
				for (String name : names) {
					nameLengths.add(name.length());
					
		//prob6			
					sum += name.length();
					// Interchangeable with:
					// sum = sum + name.length();
				}
				System.out.println(sum);
	}
			
	//prob7
	// starting at 0, this loop will run iterations until i is not less than n, each loop will append the word into stringbuilder
	public static void prob7(String word, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i =0; i<n ; i++) {
			sb.append(word);

		}
		//when it finishes the loop the sting builder will hold n references of the word
		System.out.println(sb.toString());
	}
	
	//prob8
	public static String prob8 (String firstName, String lastName){
		return firstName + " " + lastName;
	
	}
	
	//prob9 
	//for sum starting at 0, we add the first integer to create a new sum, and then follow through the array adding each integer
	// we need to return true if sum of intArray is greater than 100
	
	public static boolean prob9(int[] intArray) {
		int sum = 0;

		for (int i : intArray) {

			sum = sum + i;
		}
		
		return sum > 100;
	}
	
	//prob10 - method that takes an array of double and returns the average of all the elements in the array.
	
	public static double prob10(double[] doubleArray) {
		double sum = 0;

		for (double i : doubleArray) {

			sum = sum + i;
		}
		
		
		return sum /doubleArray.length;
	}
	
	//prob11- method that takes an array of double and true if the average if elements in doubleArray1 is greater than average in doubleArray2
	public static boolean prob11(double[] doubleArray1, double[] doubleArray2){
		return prob10(doubleArray1) > prob10(doubleArray2);
	}
	
	//prob12 - 	method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket
		//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	//prob13- if spoons are less than or equal to zero, return "Keep it simple stupid."	, otherwise return "Let's get creative!"
	// super tired, this seemed a relevant method  for my brain-space tonight
	public static String complexityAdvice(int spoons){
		if (spoons <=  0) {
			return  "Keep it simple stupid.";			
		}
		else {
			return "Let's get creative!";
			
		}
	}
	
	
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		prob1();
		prob2();
	//	prob3 - How do you access the last element of any array?
	//	prob4 - How do you access the first element of any array?)
		prob5();
		// Should print: "HelloHelloHello"
		prob7("Hello",3);
		
	//prob8 - this should print John Smith
		System.out.println(prob8("John", "Smith"));
		
		
	//prob9	- method that takes an array of int and returns true if the sum of all the ints 
		//in the array is greater than 100.
		//Should print true
		System.out.println(prob9(new int[] {77,22,55}));
		//Should print false
		System.out.println(prob9(new int[] {33,22,11,5,4}));
		
	//prob10 - 	method that takes an array of double and returns the average of all the elements in the array.
		System.out.println(prob10(new double[] {10, 20, 60}));
	// should print 30
		
	//prob11- method that takes two arrays of double and returns true if the average in first array is greater than second	
		System.out.println(prob11(new double[] {10, 20, 60}, new double[] {20, 40, 120}));
	//this  should return false
		
	//prob12 - 	method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket
	//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println(willBuyDrink(true, 87));
	//should return true	
		
		
	//prob13 - 	method of your own that solves a problem. In comments, write what the method does and why you created it.
	// if spoons are less than or equal to zero, return "Keep it simple stupid."	, otherwise return "Let's get creative!"
		System.out.println(complexityAdvice(4));
		//prints "Let's get creative!"
		System.out.println(complexityAdvice(-12));
		//prints "keep it simple stupid."
	}
	

	}
