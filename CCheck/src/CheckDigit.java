/*
 * Matthew Schlogel
 * CheckDigit
 * 
 */
import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * Couldn't figure this code out while troubleshooting with a
 * basic main method, so decided It would be pointless to add
 * the input interface to type in the parameter.
 * 
 * The problem that gave me the most trouble was trying to get 
 * the initial sum of the every two digit algorithm starting
 * from the back of the array.
 */
public class CheckDigit {

//_______________
	public static void main(String[] args){
		int[] numArray = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
		int i;
		int sum1 = 0;
		int sum2 = 0;
		int othersum = 0;
		int othersum1 = 0;
		int temp = numArray.length-1;
		for (i = temp; i > 0; i--){
			if ((i % 2) == 0){
				if (numArray[i]*2 > 9){
					int tempnum = numArray[i]-9;
					othersum += tempnum;
				}
				othersum1 += (numArray[i])*2;
			    sum1 = othersum + othersum1;
			}
		}
		for (i = temp; i > 0; i--){
			if ((i % 2) != 0){
				sum2 += numArray[i];
			}
		}
		
		
//____________________________________________		
		int sum = sum1 + sum2;
		
		//if sum%10 == 0 then the card would be valid
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum);
		}

		
		
		
		
		
		
	}
	