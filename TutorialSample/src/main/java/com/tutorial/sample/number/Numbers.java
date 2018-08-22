/**
 * @author Puneet Duneja
 * ©TRIOHATS Consulting Pvt Ltd
 *
 */

package com.tutorial.sample.number;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Puneet D
 * 
 * 
 * provide a utility 
 * 
 * 1) to add 2 numbers and return the result- non TDD approach  
 * 2) provide which number is greater number - TDD approach 
 * 3) if both numbers are same then application should be able to return both numbers - TDD approach
 *  
 *
 */
public class Numbers {
	
	int number1=0;
	int number2=0;
	
	
	public int summation (int num1 , int num2){
		return num1 + num2;
	}


public List greaterNumber(int first, int second) {
		
		List numberList = new ArrayList();
		
		if (first > second) {
			numberList.add(first);
			
		}else if(first < second){
			numberList.add(second);
			
		} else {
			numberList.add(first);
			numberList.add(second);
		}
		
		return numberList;
	
		
	}



	
	
	
	
	

}
