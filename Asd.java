package day05;

import java.io.IOException;
import java.util.Scanner;

public class Asd {
public static void main(String[] args) throws IOException {
	
	Scanner input = new Scanner(System.in);
	String id = null,pw = null, cid = null, cpw = null;
	int wnum = 0;
	while(wnum < 1) {
	System.out.println("1.�α���");
	System.out.println("2.ȸ������");
	System.out.println("3.������");
	System.out.println(">>>");
	int num = input.nextInt();
	switch(num) {
	
	case 1:
		System.out.println("���̵� �Է� :");
		cid = input.next();
		System.out.println("��й�ȣ �Է� :");
		cpw= input.next();
		System.out.println("���� ���� !!!");
		if( cid.equals(id) && pw.equals cpw) 
	break;
	
	case 2:
		System.out.println("������ ���̵� �Է� :");
		id = input.next();
		System.out.println("������ ��й�ȣ �Է� :");
		pw = input.next();
		System.out.println("���� �Ϸ� !!!");
		break;
	case 3:
		System.out.println("���α׷� ���� �մϴ�!!!");
	wnum++;
	}
		
		}

	}
}




