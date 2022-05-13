package week2;

//Weekly Coding Challenge:
//Pls mention the link to your solution in the comments section not later than Friday morning.
//
//1) Magic Index: A magic index in an array A [ 0 ... n -1] is defined to be an index such that A[i] = i. 
//Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in array A.
//
//Follow up: What if the values are not distinct?
//
//2) Power Set: Write a method to return all subsets of a set.
//
//3) Recursive Multiply: Write a recursive function to multiply two positive integers without using the *operator.
//You can use addition, subtraction, and bit shifting, but you should minimize the number of those operations.

public class PowerSet {
	public static void subset(String allSets) {
		
		int listOfSet = allSets.length();
		String subset ="";
		System.out.println(allSets);
		for(int i=0 ; i < listOfSet ; i++) {
			subset = "";
			if(i != listOfSet-2) {
				subset = subset+allSets.charAt(i);
				System.out.println(subset);
				for(int k=i+1 ; k< listOfSet ; k++) {
					System.out.println( subset + allSets.charAt(k));
				}
			}
			
		}
		
	}

}
