package day05;


import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	

	Scanner input = new Scanner(System.in);
	String login=null, join=null, ex=null;
	int num;
	while(true) {
		System.out.println("1.�α���");
		System.out.println("2.ȸ������");
		System.out.println("3.������");
		System.out.println(">>>");
		num = input.nextInt();
		switch (num){
		case 1:
			System.out.println("���̵� �Է� :");
			System.out.println("��й�ȣ �Է� :");
			login = input.next();
			break;
			
		case 2:
			System.out.println("������ ���̵� �Է� :");
			System.out.println("������ ��й�ȣ �Է� :");
			join = input.next();
			break;
		
	case 3:
		System.out.println("���α׷� ���� �մϴ�!!!");
		ex = input.next();
		break;
		
		

	
	


}	
}
}
}
