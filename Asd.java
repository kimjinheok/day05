package day05;

import java.io.IOException;
import java.util.Scanner;

public class Asd {
public static void main(String[] args) throws IOException {
	
	Scanner input = new Scanner(System.in);
	String id = null,pw = null, cid = null, cpw = null;
	int wnum = 0;
	while(wnum < 1) {
	System.out.println("1.로그인");
	System.out.println("2.회원가입");
	System.out.println("3.나가기");
	System.out.println(">>>");
	int num = input.nextInt();
	switch(num) {
	
	case 1:
		System.out.println("아이디 입력 :");
		cid = input.next();
		System.out.println("비밀번호 입력 :");
		cpw= input.next();
		System.out.println("인증 실패 !!!");
		if( cid.equals(id) && pw.equals cpw) 
	break;
	
	case 2:
		System.out.println("저장할 아이디 입력 :");
		id = input.next();
		System.out.println("저장할 비밀번호 입력 :");
		pw = input.next();
		System.out.println("가입 완료 !!!");
		break;
	case 3:
		System.out.println("프로그램 종료 합니다!!!");
	wnum++;
	}
		
		}

	}
}




