package day05;

import java.util.Scanner;

public class Ex01 {
public static void main(String[]args) {
	/*
	 �ݺ���
	 - ��Ģ������ ���� ���Ѵٸ� �ݺ����� ����� �� �ִ�.
	 */
	int sum=0, i =0;
	// �ʱⰪ ;(Ư������ ������ �����Ѵ�) ���ǽ� ; ������ 
	for( i=1 ; i <= 10 ; i++) { //for���ȿ��� �����ݷ��� �ΰ��־���Ѵ�.
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
	//����ڷ� ���� �Է¹��� �������� ¦,Ȧ, ������ ���ϼ���
	
	Scanner input = new Scanner(System.in);
	int num, evenSum=0, oddSum=0, allSum=0;
	System.out.println("�� �Է�");
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

