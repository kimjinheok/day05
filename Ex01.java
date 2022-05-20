package day05;

import java.util.Scanner;

public class Ex01 {
public static void main(String[]args) {
	/*
	 반복문
	 - 규칙적으로 값이 변한다면 반복문을 사용할 수 있다.
	 */
	int sum=0, i =0;
	// 초기값 ;(특정값에 변수를 선언한다) 조건식 ; 증감식 
	for( i=1 ; i <= 10 ; i++) { //for문안에는 세미콜론이 두개있어야한다.
		System.out.println(i);
		sum = sum + i;
	}
	System.out.println("i : " +i);
	
	System.out.println("sum : "+sum);
	/*
	i++; sum = sum + i; //i++; sum(1) = sum(0) +(1)i;
	i++; sum = sum + i; 
	i++; sum = sum + i; 
	i++; sum = sum + i;
	i++; sum = sum + i;
	i++; sum = sum + i;
	i++; sum = sum + i;
	i++; sum = sum + i;
	i++; sum = sum + i;
	i++; sum = sum + i;
	System.out.println("sum : "+sum);
	*/
//	for(int k=1; k<=10; k+=2) {
//		System.out.println("k : "+k);
//	}
//	System.out.println("============");
//	for(int k=1; k<=10; k++) {
//		if(k%2 == 1) {
//			System.out.println("k : "+k);
//		}
//	}
	//사용자로 부터 입력받은 수까지의 짝,홀, 총합을 구하세요
	
	Scanner input = new Scanner(System.in);
	int num, evenSum=0, oddSum=0, allSum=0;
	System.out.println("수 입력");
	num = input.nextInt();
	for(int k=1; k <= num ; k++) {
		System.out.println("k : " +k);
		if(k%2 == 0) {
			evenSum += k;
		}else {
			oddSum += k;
		}
		allSum += k;
		System.out.println("allSum : "+allSum);
		System.out.println("evenSum : "+evenSum);
		System.out.println("oddSum : "+oddSum);
		
		i=0;
		for( ; i<3 ;) {
			System.out.println("test");
			i++; 
}				
}		
}
}

