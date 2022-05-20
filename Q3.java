package day05;


import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	

	Scanner input = new Scanner(System.in);
	String login=null, join=null, ex=null;
	int num;
	while(true) {
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.나가기");
		System.out.println(">>>");
		num = input.nextInt();
		switch (num){
		case 1:
			System.out.println("아이디 입력 :");
			System.out.println("비밀번호 입력 :");
			login = input.next();
			break;
			
		case 2:
			System.out.println("저장할 아이디 입력 :");
			System.out.println("저장할 비밀번호 입력 :");
			join = input.next();
			break;
		
	case 3:
		System.out.println("프로그램 종료 합니다!!!");
		ex = input.next();
		break;
		
		

	
	


}	
}
}
}
