package day05;

public class Q1 {

	public static void main(String[] args) {
		for(int i=1; i<5;i++) {
			
					System.out.println(i+ ".hello");
				
				
		}
		int sum=0;
		for(int i=1; i<=100;i++) {
			sum+=i;
			if(sum == 528) {
				System.out.println(i);
			}
		}
		for(int i=1; i<=25;i++) {
			System.out.print(i+"\t");
			if(i%5 == 0) {
				System.out.println();
			}
			
		}
}
}
