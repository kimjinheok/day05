package day05;

import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
	
	
	 Scanner input = new Scanner(System.in);
	   int num1, num2, sum=0;
	   System.out.println("두 수 입력");
	   num1 = input.nextInt();
	   num2 = input.nextInt();
	   int n1 = num1;
	   while(n1 <= num2) {
	      sum+=n1;
	      n1++;
	   }
	   while(num2 <= num1) {
	      sum+=num2;
	      num2++ ;
	   }
	   System.out.println(sum);
	   /*
	   int max=0, min=0;
	   if(num1 > num2) {
	      max = num1;   min = num2;
	   }else {
	      max = num2;   min = num1;
	   }
	   while(min <= max) {
	      sum+=min;
	      min++;
	   }
	   System.out.println(sum);
	   */
	}
}