import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
//		1a
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			System.out.println("Value of last element subtracted by the first");
			System.out.println(ages[ages.length - 1] - ages[0]);
		
//		1b
		System.out.println("Original array");
		System.out.println(Arrays.toString(ages));
		
		ages = Arrays.copyOf(ages, ages.length + 1);
		ages[ages.length - 1] = 15; //adding 15 as new age to array
		
		System.out.println("Array with new element added");
		System.out.println(Arrays.toString(ages));
		
		System.out.println("Value of last element subtracted by the first");
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		
//		1c
		float sum = 0;
		for(int age : ages) {
			sum += age;
		}
		float average = sum / ages.length;
		System.out.println("Calculate the average of the array");
		System.out.println(average);
		
//		2a
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		sum = 0;
		
		for(String aName : names) {
			//System.out.println("Number of letters");
			int numletters = aName.length();
			//System.out.println(numletters);
			sum += numletters;
		}
		
		average = sum / names.length;
		System.out.println("Calculate the average number of letters per name");
		System.out.println(average);
		
//		2b
		String namesTogether = "";
		for(String aName : names) {
			namesTogether = namesTogether + aName + " ";
		}
		System.out.println("Result is");
		System.out.println(namesTogether);
		
//		5
		int i = 0;
		int[] nameLengths = new int [names.length];
		for (String lengthOfNames : names) {
			nameLengths[i] = lengthOfNames.length();
					
			i++;
		}
		System.out.println(Arrays.toString(nameLengths) );
		
//		6
		sum = 0;
		for (int sumOfElements : nameLengths) {
			sum += sumOfElements;	
		}
		System.out.println("The sum of the lengths of elements in the nameLengths array: ");
		System.out.println(sum);
		
//		7
		System.out.println(wordConcatenated("Hello", 3) );
		
//		8
		System.out.println(concatFullName("Cruz", "Gonzalez") );
		
//		9
		System.out.println(intArray(nameLengths) );
		
//		10
		double[] myDoubles = {1.0, 2.0, 3.0, 4.0};
		System.out.println(getAverage(myDoubles) );
//		11
		double[] mySecondDoubles = {0.5, 1.0, 1.5, 2.0, 2.5};
		System.out.println(compareTwoArrays(myDoubles, mySecondDoubles) );
		
//		12
		boolean hot = true;
		double money = 11.50;
		System.out.println(willBuyDrink(hot, money) );
		
//		13
		boolean isBookerPlaying = true;
		int wins = 20;
		int losses = 10;
		System.out.println(ifSunsAreGood(isBookerPlaying, wins, losses) );
		
	}
	
	public static String wordConcatenated(String word, int n) 
	{
		String concatenated = "";
		for (int i = 0; i < n; i++) 
		{
			concatenated = concatenated.concat(word);
		}
		
		return concatenated;
	}
	
	public static String concatFullName(String firstName, String lastName)
	{
		String fullName = "";
		fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public static boolean intArray(int[] someInts)
	{
		boolean isGreater = true;
		//Returns true if the sum of all the ints in the array is greater than 100
		int sum = 0;
		for (int aInt : someInts) 
		{
			sum += aInt;	
		}
		
		if (sum < 100)
		{
			isGreater = false;
		}
		
		return isGreater;
	}
	
	public static double getAverage(double[] someDoubles)
	{
		double average = 0.0;
		double sum = 0.0;
		for (double aDouble : someDoubles)
		{
			sum += aDouble;
		}
		
		average = sum / someDoubles.length;
		
		return average;
	}
	
	public static boolean compareTwoArrays(double[] someDoubles, double[] moreDoubles)
	{
		boolean isMoreThan = true; 
		double average1 = 0.0;
		double average2 = 0.0;
		double sum1 = 0.0;
		double sum2 = 0.0;
		
		for (double aDouble : someDoubles)
		{
			sum1 += aDouble;
		}
		
		average1 = sum1 / someDoubles.length;
		
		for (double anotherDouble : moreDoubles)
		{
			sum2 += anotherDouble;
		}
		
		average2 = sum2 / moreDoubles.length;
		
		if (average1 < average2)
		{
			isMoreThan = false;
		}
	
		return isMoreThan;
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
	{
		boolean willBuyDrink = false;
		
		if(isHotOutside == true && moneyInPocket > 10.50)
		{
			willBuyDrink = true;
		}
		
		return willBuyDrink;
	}
	
	public static boolean ifSunsAreGood(boolean isBookerPlaying, int wins, int losses)
	{
		boolean sunsAreGood = false;
		
		if(wins > losses && isBookerPlaying == true)
		{
			sunsAreGood = true;
		}
		
		return sunsAreGood;
	}
	
	
	
}
